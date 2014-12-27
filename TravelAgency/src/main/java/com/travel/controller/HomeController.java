package com.travel.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.travel.commons.Package;
import com.travel.commons.SightSeeing;
import com.travel.commons.Transport;
import com.travel.iservices.ICustomerService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private ICustomerService customerService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<Package> packages = customerService.getPackages();
		model.addAttribute("packages", packages);
		
		List<SightSeeing> sightseeings = customerService.getSightseeings();
		model.addAttribute("sightseeings", sightseeings);
		
		List<Transport> transports = customerService.getTransports();
		model.addAttribute("transports", transports);
		
		return "index";
	}
	
	/**
	 * package details form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/package/{id}", method = RequestMethod.GET)
	public String getPackageDetails(@PathVariable long id, Model model) {
		Package pack = customerService.getPackage(id);
		model.addAttribute("pack", pack);
		
		return "package/packagedetails";
	}
	
	/**
	 * sightseeing details form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/sightseeing/{id}", method = RequestMethod.GET)
	public String getSightseeingDetails(@PathVariable long id, Model model) {
		SightSeeing sightseeing = customerService.getSightseeing(id);
		model.addAttribute("sightseeing", sightseeing);
		
		return "sightseeing/sightseeingdetails";
	}
	
	/**
	 * transport details form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/transport/{id}", method = RequestMethod.GET)
	public String getTransportDetails(@PathVariable long id, Model model) {
		Transport transport = customerService.getTransport(id);
		model.addAttribute("transport", transport);
		
		return "transport/transportdetails";
	}
	
}
