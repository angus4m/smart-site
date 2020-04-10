package com.cqxyd.smartsite.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 自定义响应数据结构 这个类是提供给门户，ios，安卓，微信商城用的
 *               门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list） 其他自行处理 200：表示成功
 *               500：表示错误，错误信息在msg字段中 501：bean验证错误，不管多少个错误都以map形式返回
 *               502：拦截器拦截到用户token出错 555：异常抛出信息
 */
@ApiModel(value = "接口返回结果对象", description = "接口返回结果")
public class JSONResult<T> {

	// 响应业务状态
	@ApiModelProperty(value = "响应业务状态", name = "status", example = "200", required = true)
	private Integer status;

	// 响应消息
	@ApiModelProperty(value = "响应消息", name = "msg", example = "请求成功", required = true)
	private String msg;

	// 响应中的数据
	@ApiModelProperty(value = "返回的数据", name = "data", required = true)
	private T data;

	private String ok; // 不使用

	public static <T> JSONResult<T> build(Integer status, String msg, T data) {
		return new JSONResult<T>(status, msg, data);
	}

	public static <T> JSONResult<T> ok(T data) {
		return new JSONResult<T>(data);
	}

	public static <T> JSONResult<T> ok() {
		return new JSONResult<T>(null);
	}

	public static <T> JSONResult<T> errorMsg(String msg) {
		return new JSONResult<T>(500, msg, null);
	}

	public static <T> JSONResult<T> errorMap(T data) {
		return new JSONResult<T>(501, "error", data);
	}

	public static <T> JSONResult<T> errorTokenMsg(String msg) {
		return new JSONResult<T>(502, msg, null);
	}

	public static <T> JSONResult<T> errorException(String msg) {
		return new JSONResult<T>(555, msg, null);
	}

	public JSONResult() {

	}

	public JSONResult(Integer status, String msg, T data) {
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public JSONResult(T data) {
		this.status = 200;
		this.msg = "OK";
		this.data = data;
	}

	public Boolean isOK() {
		return this.status == 200;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
