package com.offcn.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.service.Servi;

@Controller
public class Contro {
	
	@Autowired
	private Servi ser;
	
	@RequestMapping("/aa")
	public void getCount(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		String str = ser.getCount();
		System.out.println(str);
		try {
			Thread.sleep(1000);
			response.getWriter().write(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/bb")
	public void getSta(HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		String sta = ser.getSta();
		try {
			Thread.sleep(1000);
			response.getWriter().write(sta);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
