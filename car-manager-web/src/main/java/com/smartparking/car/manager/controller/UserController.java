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
import com.smartparking.car.manager.bean.TUserMember;
import com.smartparking.car.manager.service.KUserService;

@Controller
public class UserController {

	@Autowired
	KUserService userService;

	@ResponseBody
	@RequestMapping("/getunAuthUsers")
	public Map<String, Object> getunAuthUsers(
			@RequestParam(value = "pageNum", required = false) Integer pageNo,
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize) {
		Map<String, Object> map = new HashMap<>();
		List<TUserMember> getunAuthUsers = null;
		if (pageNo != null)
			getunAuthUsers = userService.getunAuthUsers(pageNo, pageSize);
		else
			getunAuthUsers = userService.getunAuthUsers(pageNum, pageSize);
		Page<TUserMember> page = (Page<TUserMember>) getunAuthUsers;

		map.put("total", page.getTotal());
		map.put("rows", getunAuthUsers);
		return map;
	}

	@ResponseBody
	@RequestMapping("/getAuthUsers")
	public Map<String, Object> getAuthUsers(
			@RequestParam(value = "pageNum", required = false) Integer pageNo,
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize) {
		Map<String, Object> map = new HashMap<>();
		List<TUserMember> getAuthUsers = null;
		if (pageNo != null)
			getAuthUsers = userService.getAuthUsers(pageNo, pageSize);
		else
			getAuthUsers = userService.getAuthUsers(pageNum, pageSize);
		Page<TUserMember> page = (Page<TUserMember>) getAuthUsers;

		map.put("total", page.getTotal());
		map.put("rows", getAuthUsers);
		return map;
	}

	@ResponseBody
	@RequestMapping("/getfailedAuthUsers")
	public Map<String, Object> getfailedAuthUsers(
			@RequestParam(value = "pageNum", required = false) Integer pageNo,
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize,
			HttpSession session) {
		Map<String, Object> map = new HashMap<>();
		List<TUserMember> getfailedAuthUsers = null;
		if (pageNo != null)
			getfailedAuthUsers = userService.getfailedAuthUsers(pageNo, pageSize);
		else
			getfailedAuthUsers = userService.getfailedAuthUsers(pageNum, pageSize);
		Page<TUserMember> page = (Page<TUserMember>) getfailedAuthUsers;

		session.setAttribute("pageSize", pageSize);
		map.put("total", page.getTotal());
		map.put("rows", getfailedAuthUsers);
		return map;
	}

	@ResponseBody
	@RequestMapping("/authSuccess")
	public void authSuccess(@RequestParam("id") Integer id) {
		userService.authSuccess(id);
	}

	@ResponseBody
	@RequestMapping("/authFail")
	public void authFail(@RequestParam("id") Integer id) {
		userService.authFail(id);
	}

	@ResponseBody
	@RequestMapping("/deleteUser")
	public void deleteUser(@RequestParam("id") Integer id) {
		userService.deleteUser(id);
	}

	@ResponseBody
	@RequestMapping("/searchUser")
	public Map<String, Object> searchUser(String name, String value,
			HttpSession session) {
		Map<String, Object> map = new HashMap<>();
		TUserMember member = null;
		if ("id".equals(name)) {
			try {
				member = userService.searchUserByid(Integer.parseInt(value));
			} catch (NumberFormatException e) {
				member = null;
			}
		} else if ("name".equals(name)) {
			member = userService.searchUserByName(value);
		} else if ("phoneNumber".equals(name)) {
			member = userService.searchUserByPhoneNumber(value);
		}
		map.put("member", member);
		if (member != null) {
			long count = userService.getCountBeforeMember(member);
			Integer pageSize = (Integer) session.getAttribute("pageSize");
			int page = (int) (count / (pageSize.intValue())) + 1;
			int row = (int) (count % (pageSize.intValue()));
			map.put("page", page);
			map.put("row", row);
		}
		return map;
	}
}
