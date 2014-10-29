package com.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.iservices.IAdminService;

@Controller
@RequestMapping(value = "/admin/")
public class AdminController {
	@Autowired
	private IAdminService adminService;

	@RequestMapping(value = "/")
	public String home() {
		return "admin/index";
	}

}
