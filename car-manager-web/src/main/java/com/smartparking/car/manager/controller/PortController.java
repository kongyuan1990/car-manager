package com.smartparking.car.manager.controller;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.smartparking.car.manager.bean.TCarport;
import com.smartparking.car.manager.bean.TUserPortowner;
import com.smartparking.car.manager.service.PortOwnerService;
import com.smartparking.car.manager.service.PortService;

@Controller
public class PortController {

	@Autowired
	PortOwnerService ownerService;
	@Autowired
	PortService portService;

	@ResponseBody
	@RequestMapping("/getunAuthPorts")
	public Map<String,Object> getunAuthPorts(
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize) {
		Map<String,Object> map = new HashMap<>();
		List<TUserPortowner> owners = ownerService.getunAuthPorts(pageNum,pageSize);
		Page<TUserPortowner> page = (Page<TUserPortowner>) owners;
		map.put("total", page.getTotal());
		map.put("rows",owners);
		return map;
	}

	@ResponseBody
	@RequestMapping("/getAuthPorts")
	public Map<String,Object> getAuthPorts(
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize) {
		Map<String,Object> map = new HashMap<>();
		List<TUserPortowner> owners = ownerService.getAuthPorts(pageNum,pageSize);
		Page<TUserPortowner> page = (Page<TUserPortowner>) owners;
		map.put("total", page.getTotal());
		map.put("rows",owners);
		return map;

	}

	@ResponseBody
	@RequestMapping("/getfailedAuthPorts")
	public Map<String,Object> getfailedAuthPorts(
			@RequestParam(value = "page", defaultValue = "1") Integer pageNum,
			@RequestParam(value = "rows", defaultValue = "10") Integer pageSize) {
		Map<String,Object> map = new HashMap<>();
		List<TUserPortowner> owners = ownerService.getfailedAuthPorts(pageNum,pageSize);
		Page<TUserPortowner> page = (Page<TUserPortowner>) owners;
		map.put("total", page.getTotal());
		map.put("rows",owners);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/portFail")
	public void portFail(@RequestParam("id")Integer id){
		ownerService.portFail(id);
	}
	
	@ResponseBody
	@RequestMapping("/portSuccess")
	public void portSuccess(@RequestParam("id")Integer id){
		ownerService.portSuccess(id);
	}
	
	@ResponseBody
	@RequestMapping("/deletePort")
	public void deletePort(@RequestParam("id")Integer id){
		ownerService.deletePort(id);
	}
	
	@ResponseBody
	@RequestMapping("/ownerport")
	public Map<String,Object> ownerport(@RequestParam(value="portownerId",required=false)Integer portowenerId){
		Map<String,Object> map = new HashMap<>();
		List<Map<String,Object>> ports = new ArrayList<>();
		Class cartport = TCarport.class;
		Field[] fields = cartport.getDeclaredFields();
		TCarport port = null;
		if(portowenerId != null)
			port = portService.getPortByPortowenerId(portowenerId);
		if(port != null){
			for (Field field : fields) {
				Map<String,Object> fieldmap = new HashMap<>();
				String fieldName = field.getName();
				fieldmap.put("name", fieldName);
				String methodName = "get"+ fieldName.toUpperCase().substring(0,1)+fieldName.substring(1);
				try {
					fieldmap.put("value", cartport.getMethod(methodName, null).invoke(port,null));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					fieldmap.put("value","");
				}
				ports.add(fieldmap);
			}
		}
		
		map.put("total", 1);
		map.put("rows",ports);
		return map;
	}

}
