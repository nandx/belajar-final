package com.belajar.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.belajar.java.service.IOrderService;
import com.belajar.java.service.OrderServiceImpl;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		IOrderService orderService = new OrderServiceImpl();

		model.addAttribute("listorder", orderService.listOrder());
		model.addAttribute("totaltagihan", orderService.totalTagihan());

		return "index";
	}

}
