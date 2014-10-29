package com.travel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.commons.Country;
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

	@RequestMapping(value = "/login/")
	public String login() {
		return "admin/login";
	}

	@RequestMapping(value = "/country/")
	public String countryList() {
		return "admin/countrylist";
	}

	/**
	 * get Country form
	 * 
	 * @param model
	 * @return form for adding country
	 */
	@RequestMapping(value = "/country/add/", method = RequestMethod.GET)
	public String getCountryForm(Model model) {
		model.addAttribute("country", new Country());
		return "admin/countryadd";
	}

	/**
	 * 
	 * @param country
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/country/add/", method = RequestMethod.POST)
	public String createOrUpdateCountry(
			@Valid @ModelAttribute("country") Country country,
			BindingResult result) {
		if (result.hasErrors()) {
			if (country.getId() != 0)
				return "admin/countryadd";
			else
				return "admin/countryupdate";
		}
		adminService.addCountry(country);
		return "redirect:../";
	}

}
