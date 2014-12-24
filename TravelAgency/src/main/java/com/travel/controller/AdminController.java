package com.travel.controller;

import java.beans.PropertyEditorSupport;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
			return "admin/countryupdate";
		}
		adminService.addCountry(country);
		return "redirect:../";
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
	@RequestMapping(value = "/country/update/", method = RequestMethod.POST)
	public String updateCountry(Model model,
			@Valid @ModelAttribute("country") Country country,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/countryupdate";
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
	 * get Country form
	 * 
	 * @param model
	 * @return form for adding country
	 */
	@RequestMapping(value = "/place/add/", method = RequestMethod.GET)
	public String getPlaceForm(Model model) {
		model.addAttribute("place", new Place());
		model.addAttribute("countries", adminService.getCountries());
		return "admin/placeadd";
	}
	
	/**
	 * 
	 * @param place
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/place/add/", method = RequestMethod.POST)
	public String createPlace(Model model,
			@Valid @ModelAttribute("place") Place place,
			BindingResult result) {
		
		if (result.hasErrors()) {
			if (place.getId() != 0) {
				model.addAttribute("countries", adminService.getCountries());
				return "admin/placeupdate";
			} else {
				model.addAttribute("countries", adminService.getCountries());
				return "admin/placeadd";
			}
		}

		adminService.addPlace(place);
		return "redirect:../";
	}
	
	/**
	 * 
	 * @param place
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/place/update/", method = RequestMethod.POST)
	public String updatePlace(Model model,
			@Valid @ModelAttribute("place") Place place,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/placeupdate";
		}
		adminService.updatePlace(place);
		return "redirect:../";
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
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
//
//		binder.registerCustomEditor(Integer.class, "totalSeat",
//				new PropertyEditorSupport() {
//
//					@Override
//					public void setAsText(String text) {
//						Integer totalSeat = Integer.parseInt(text);
//						setValue(totalSeat);
//					}
//				});

		binder.registerCustomEditor(Long.class, "id",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String text) {
						Long id = Long.parseLong(text);
						setValue(id);
					}
				});

//		binder.registerCustomEditor(List.class, "prerequisites",
//				new CustomCollectionEditor(List.class) {
//					@Override
//					protected Object convertElement(Object element) {
//						Long id = null;
//						if (element instanceof String
//								&& !((String) element).equals("")) {
//							// From the JSP 'element' will be a String
//							try {
//								id = Long.parseLong((String) element);
//							} catch (NumberFormatException e) {
//								System.out.println("Element was "
//										+ ((String) element));
//								e.printStackTrace();
//							}
//						} else if (element instanceof Long) {
//							// From the database 'element' will be a Long
//							id = (Long) element;
//						}
//						return id != null ? adminService.getCourse(id) : null;
//					}
//				});
		
		binder.registerCustomEditor(Country.class, "country",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Country country = adminService.getCountry((Long
								.parseLong(id)));
						setValue(country);
					}
				});

//		binder.registerCustomEditor(Course.class, "course",
//				new PropertyEditorSupport() {
//
//					@Override
//					public void setAsText(String id) {
//						Course course = adminService.getCourse((Long
//								.parseLong(id)));
//						setValue(course);
//					}
//				});
	}	

}
