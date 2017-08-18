package com.smartparking.car.manager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.smartparking.car.manager.bean.TAuth;
import com.smartparking.car.manager.service.AuthService;

@Controller
public class AuthController {

	@Autowired
	AuthService authService;

	@ResponseBody
	@RequestMapping("/getAuths")
	public Map<String, Object> getAuths(
			@RequestParam(value = "pageNum",required=false) Integer pageNum,
			@RequestParam(value = "page") int pageNo,
			@RequestParam(value = "rows") int pageSize,HttpSession session) {
		session.setAttribute("rows", pageSize);
		List<TAuth> auths = null;
		if(pageNum != null)
			auths = authService.getAuths(pageNum, pageSize);
		else
			auths = authService.getAuths(pageNo, pageSize);
		Page<TAuth> page = (Page<TAuth>) auths;

		Map<String, Object> map = new HashMap<>();
		map.put("total", page.getTotal());
		map.put("rows", auths);
		return map;
	}

	@ResponseBody
	@RequestMapping("/addAuth")
	public void addAuth(TAuth auth) {
		authService.addAuth(auth);
	}

	@ResponseBody
	@RequestMapping("/editAuth")
	public void updateAuth(TAuth auth) {
		authService.update(auth);
	}

	@ResponseBody
	@RequestMapping("/editAuthself")
	public void updateAuthSelf(TAuth auth, HttpSession session) {
		TAuth authself = authService.updateAuthSelf(auth);
		session.setAttribute("auth", authself);
	}

	@ResponseBody
	@RequestMapping("/deleteAuth")
	public void deleteAuth(Integer id) {
		authService.deleteAuth(id);
	}

	@ResponseBody
	@RequestMapping("/searchAuth")
	public Map<String,Object> searchAuth(@RequestParam("name") String name,
			@RequestParam("value") String value,HttpSession session) {
		Map<String,Object> map =new HashMap<String, Object>();
		TAuth auth = null;
		if ("id".equals(name)) {
			try {
				auth = authService.getAuthById(Integer.parseInt(value));
			} catch (NumberFormatException e) {
			}
		}else if ("name".equals(name)) {
			auth = authService.getAuthByName(value);
		}else if ("email".equals(name)) {
			auth = authService.getAuthByEmail(value);
		}else if ("phone".equals(name)) {
			auth = authService.getAuthByPhone(value);
		}
		
		if(auth != null){
			long count = authService.getAuthCount(auth) ;
			
			Integer rows = (Integer) session.getAttribute("rows");
			
			int pageNum = (int) (count/(rows.intValue())) + 1;
			int row = (int) (count%(rows.intValue()));
			
			map.put("pageNum", pageNum);
			map.put("row", row);
			System.out.println(pageNum+","+row);
		}
		map.put("searchAuth",auth);
		return map;
	}
	
}
