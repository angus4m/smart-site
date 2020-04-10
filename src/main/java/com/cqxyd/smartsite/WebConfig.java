package com.cqxyd.smartsite;

import java.lang.reflect.Method;

import com.cqxyd.smartsite.Interceptor.LoginInterceptor;
import com.cqxyd.smartsite.util.DateConverter;
import com.cqxyd.smartsite.version.ApiVersion;
import com.cqxyd.smartsite.version.ApiVersionCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

	private final LoginInterceptor loginInterceptor;

	public WebConfig(LoginInterceptor loginInterceptor) {
		this.loginInterceptor = loginInterceptor;
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/login/**", "/static/**",
				"/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**",
				"classpath:/META-INF/resources/webjars/","classpath:/META-INF/resources/", "/configuration/**","/favicon.ico");
		super.addInterceptors(registry);
	}

	/**
	 * swagger静态文件路径过滤,否则版本控制会拦截
	 */
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:/static/");

		super.addResourceHandlers(registry);
	}

	// 重写请求过处理的方法
	@Override
	protected RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
		RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
		handlerMapping.setOrder(0);
		return handlerMapping;
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		// 添加日期格式转换
		registry.addConverter(new DateConverter());
	}

	// [end]

	/**
	 * 自定义匹配的处理器 Created on 2019/4/18 14:10.
	 *
	 * @author caogu
	 */
	private static class CustomRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
		@Override
		protected RequestCondition<ApiVersionCondition> getCustomTypeCondition(Class<?> handlerType) {
			ApiVersion apiVersion = AnnotationUtils.findAnnotation(handlerType, ApiVersion.class);
			return createCondition(apiVersion);
		}

		@Override
		protected RequestCondition<ApiVersionCondition> getCustomMethodCondition(Method method) {
			ApiVersion apiVersion = AnnotationUtils.findAnnotation(method, ApiVersion.class);
			return createCondition(apiVersion);
		}

		private RequestCondition<ApiVersionCondition> createCondition(ApiVersion apiVersion) {
			return apiVersion == null ? null : new ApiVersionCondition(apiVersion.value());
		}
	}
}
