package com.chenbo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springmvc的控制器类
 * @author 11366
 *
 */

@Controller("helloSpringmvc")
@RequestMapping("/springmvc")
public class HelloSpringmvc {
	@RequestMapping("/testInterceptor")
	public String testInterceptor() {
		System.out.println("执行了Hellospring的testInterceptor方法。。。");
		return "success";
	}
}
