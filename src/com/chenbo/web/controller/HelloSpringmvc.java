package com.chenbo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springmvc�Ŀ�������
 * @author 11366
 *
 */

@Controller("helloSpringmvc")
@RequestMapping("/springmvc")
public class HelloSpringmvc {
	@RequestMapping("/testInterceptor")
	public String testInterceptor() {
		System.out.println("ִ����Hellospring��testInterceptor����������");
		return "success";
	}
}
