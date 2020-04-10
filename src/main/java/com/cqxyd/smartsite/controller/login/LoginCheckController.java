package com.cqxyd.smartsite.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: HospitalInfoController
 * @Description: 用户登录控制层
 * @author Angus
 * @date 2018-11-21
 */
@Controller
public class LoginCheckController {

	
	@RequestMapping(value = "/login/loginCheck")
	@ResponseBody
	public String loginCheck(String adminId, String adminPassword, HttpServletRequest request, HttpServletResponse response) {

//		AdminInfo adminInfo = loginService.getAdminInfo(adminId);
//		if (adminInfo == null) {
//			return "{\"success\":false,\"error\":\"用户名不存在\"}";
//		}
//		// 密码MD5加密
//		String md5Password = MD5Helper.MD5Encrypt(adminPassword);
//		if (!md5Password.equals(adminInfo.getAdminPassword())) {
//			return "{\"success\":false,\"error\":\"密码错误\"}";
//		}
//		adminInfo.setAdminPassword("");
		request.getSession().setAttribute("adminInfo", "test");
		return "{\"success\":true}";
	}

	@RequestMapping(value = "/login/logout")
	public String logout(HttpSession session) {
		// 移除session
		session.removeAttribute("adminInfo");
		return "redirect:/login/userLogin";
	}

}
