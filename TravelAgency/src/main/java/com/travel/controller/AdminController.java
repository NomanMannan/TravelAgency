package com.travel.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.commons.Country;
import com.travel.commons.Package;
import com.travel.commons.Place;
import com.travel.commons.SightSeeing;
import com.travel.commons.Transport;
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

	/**
	 * 
	 * @param model
	 * @return the list of country in the system
	 */
	@RequestMapping(value = "/country/", method = RequestMethod.GET)
	public String countryList(Model model) {
		List<Country> countries = adminService.getCountries();
		model.addAttribute("countries", countries);
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
	 * semester details with section list
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public String getCountryUpdateForm(@PathVariable long id, Model model) {
		Country country = adminService.getCountry(id);
		model.addAttribute("country", country);
		return "admin/countryupdate";
	}

	/**
	 * 
	 * @param country
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/country/add/", method = RequestMethod.POST)
	public String createCountry(Model model,
			@Valid @ModelAttribute("country") Country country,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/courseupdate";
		}
		adminService.addCountry(country);
		return "redirect:../";
	}

	/**
	 * 
	 * @param country
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/country/update/", method = RequestMethod.POST)
	public String updateCountry(Model model,
			@Valid @ModelAttribute("country") Country country,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/courseupdate";
		}
		adminService.updateCountry(country);
		return "redirect:../";
	}
	
	/**
	 * 
	 * @param model
	 * @return the list of place in the system
	 */
	@RequestMapping(value = "/place/", method = RequestMethod.GET)
	public String placeList(Model model) {
		List<Place> places = adminService.getPlaces();
		model.addAttribute("places", places);
		return "admin/placelist";
	}
	
	/**
	 * 
	 * @param model
	 * @return the list of sightseeing in the system
	 */
	@RequestMapping(value = "/sightseeing/", method = RequestMethod.GET)
	public String sightseeingList(Model model) {
		List<SightSeeing> sightseeings = adminService.getSightseeings();
		model.addAttribute("sightseeings", sightseeings);
		return "admin/sightseeinglist";
	}
	
	/**
	 * 
	 * @param model
	 * @return the list of transport in the system
	 */
	@RequestMapping(value = "/transport/", method = RequestMethod.GET)
	public String transportList(Model model) {
		List<Transport> transports = adminService.getTransports();
		model.addAttribute("transports", transports);
		return "admin/transportlist";
	}
	
	/**
	 * 
	 * @param model
	 * @return the list of package in the system
	 */
	@RequestMapping(value = "/package/", method = RequestMethod.GET)
	public String packageList(Model model) {
		List<Package> packages = adminService.getPackages();
		model.addAttribute("packages", packages);
		return "admin/packagelist";
	}
	
	

}
