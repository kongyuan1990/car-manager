package com.smartparking.car.manager.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smartparking.car.manager.bean.TAuth;
import com.smartparking.car.manager.service.AuthService;

@Controller
public class PageController {

	@Autowired
	AuthService authService;

	/* 登陆验证 */
	@RequestMapping("/login")
	public String login(TAuth auth, Model model, HttpSession session) {
		TAuth loginAuth = authService.loginAuth(auth);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
		if (loginAuth != null) {
			//上一次登陆时间
			Date loginTime = loginAuth.getLoginTime();
			if(loginTime == null)
				session.setAttribute("lasttime", "本次为第一次登陆");
			else{
				String lasttime = sdf.format(loginAuth.getLoginTime());
				session.setAttribute("lasttime",lasttime);
			}
			//本次登陆时间
			Date lt = new Date();
			String logintime = sdf.format(lt);
			session.setAttribute("logintime",logintime);
			loginAuth.setLoginTime(lt);
			
			authService.update(loginAuth);
			
			session.setAttribute("auth", loginAuth);
			return "redirect:/main.html";
		}
		model.addAttribute("msg", "账户或密码错误！");
		return "forward:/login.jsp";
	}

	/* 捕获main.html请求，来到主页面 */
	@RequestMapping("/main.html")
	public String main() {
		
		return "main";
	}

	/* 捕获main_auth请求，来到main_auth页面 */
	@RequestMapping("/main_auth")
	public String toMainAuthPage() {
		return "main_auth";
	}

	/* 捕获main_carowner请求，来到main_carowner页面 */
	@RequestMapping("/main_carowner")
	public String toMainCarOwnerPage() {
		return "main_carowner";
	}

	/* 捕获main_carport请求，来到main_carport页面 */
	@RequestMapping("/main_carport")
	public String toCarPortPage() {
		return "main_carport";
	}
	
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.removeAttribute("auth");
		return "redirect:/login.jsp";
	}
}
