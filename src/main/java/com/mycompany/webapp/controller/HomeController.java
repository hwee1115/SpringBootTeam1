package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.webapp.dto.Product;
import com.mycompany.webapp.service.ProductService;

@Controller	
public class HomeController {
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	ProductService p;
	@RequestMapping
	public String home() {
		logger.info("실행");
		Product ps = p.getProduct(10);
		System.out.println(ps.getP_name());
		return "home"; // view 이름
	}
}
