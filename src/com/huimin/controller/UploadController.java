package com.huimin.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UploadController {

	
	@RequestMapping("downLoad.do")
	@ResponseBody
    public String downloadFile(String fileName,HttpServletResponse response){  
	
		return "{\"xixi\":\"haha\"}";
	}
}
