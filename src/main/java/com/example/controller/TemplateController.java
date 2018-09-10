package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.daomapper.StrudentMapper;
import com.example.models.Student;

/**
 * html模板测试
 * @author Administrator
 *
 */

@Controller
public class TemplateController {
	
	@Autowired
	private StrudentMapper studentmapper;
	
	/**
	 * 返回html模板
	 */
	
	@RequestMapping("/indexHtml")
	public String indexHtml(Map<String, Object> map) {
		map.put("hello", "from TemplateController.indexHtml");
		map.put("mas", "this is my test webpage!!");
		return "user/IndexHtml";
	}
	
	@RequestMapping("/getmassage")
	public @ResponseBody Student get () {
		Student student = studentmapper.getStudentByID(1);
		return student;
	}
}
