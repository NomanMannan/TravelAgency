package com.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.commons.PackageBooking;

@Controller
public class CustomerController {
	
	@RequestMapping(value="/packagebooking/", method=RequestMethod.GET)
	public String getPackageBookingForm(Model model){
		model.addAttribute("pack", new PackageBooking());
		return "package/packagebooking";
	}

}
