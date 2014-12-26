package com.travel.controller;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
	 * country update form
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
	 * place update form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "/place/{id}", method = RequestMethod.GET)
	public String getPlaceUpdateForm(@PathVariable long id, Model model) {
		Place place = adminService.getPlace(id);
		model.addAttribute("place", place);
		model.addAttribute("countries", adminService.getCountries());
		return "admin/placeupdate";
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
	 * get Sightseeing form
	 * 
	 * @param model
	 * @return form for adding sightseeing
	 */
	@RequestMapping(value = "/sightseeing/add/", method = RequestMethod.GET)
	public String getSightseeingForm(Model model) {
		model.addAttribute("sightseeing", new SightSeeing());
		model.addAttribute("places", adminService.getPlaces());
		return "admin/sightseeingadd";
	}
	
	/**
	 * 
	 * @param sightseeing
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/sightseeing/add/", method = RequestMethod.POST)
	public String createSightseeing(Model model,
			@Valid @ModelAttribute("sightseeing") SightSeeing sightseeing,
			BindingResult result) {
		
		if (result.hasErrors()) {
			if (sightseeing.getId() != 0) {
				model.addAttribute("sightseeings", adminService.getSightseeings());
				return "admin/sightseeingupdate";
			} else {
				model.addAttribute("sightseeings", adminService.getSightseeings());
				return "admin/sightseeingadd";
			}
		}

		adminService.addSightseeing(sightseeing);
		return "redirect:../";
	}
	
	/**
	 * sightseeing update form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "/sightseeing/{id}", method = RequestMethod.GET)
	public String getSightseeingUpdateForm(@PathVariable long id, Model model) {
		SightSeeing sightseeing = adminService.getSightseeing(id);
		model.addAttribute("sightseeing", sightseeing);
		model.addAttribute("places", adminService.getPlaces());
		return "admin/sightseeingupdate";
	}

	

	
	/**
	 * 
	 * @param sightseeing
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/sightseeing/update/", method = RequestMethod.POST)
	public String updateSightseeing(Model model,
			@Valid @ModelAttribute("sightseeing") SightSeeing sightseeing,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/sightseeingupdate";
		}
		adminService.updateSightseeing(sightseeing);
		return "redirect:../";
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
	 * get transport form
	 * 
	 * @param model
	 * @return form for adding country
	 */
	@RequestMapping(value = "/transport/add/", method = RequestMethod.GET)
	public String getTransportForm(Model model) {
		model.addAttribute("transport", new Transport());
		return "admin/transportadd";
	}
	
	/**
	 * 
	 * @param transport
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/transport/add/", method = RequestMethod.POST)
	public String createTransport(Model model,
			@Valid @ModelAttribute("Transport") Transport transport,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/transportupdate";
		}
		adminService.addTransport(transport);
		return "redirect:../";
	}

	/**
	 * transport update form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/transport/{id}", method = RequestMethod.GET)
	public String getTransportUpdateForm(@PathVariable long id, Model model) {
		Transport transport = adminService.getTransport(id);
		model.addAttribute("transport", transport);
		return "admin/transportupdate";
	}

	/**
	 * 
	 * @param transport
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/transport/update/", method = RequestMethod.POST)
	public String updateTransport(Model model,
			@Valid @ModelAttribute("transport") Transport transport,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/transportupdate";
		}
		adminService.updateTransport(transport);
		return "redirect:../";
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
	

	/**
	 * get package form
	 * 
	 * @param model
	 * @return form for adding package
	 */
	@RequestMapping(value = "/package/add/", method = RequestMethod.GET)
	public String getPackageForm(Model model) {
		model.addAttribute("pack", new Package());
		model.addAttribute("places", adminService.getPlaces());
		model.addAttribute("sightseeings", adminService.getSightseeings());
		model.addAttribute("transports", adminService.getTransports());

		return "admin/packageadd";
	}
	
	/**
	 * 
	 * @param package
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/package/add/", method = RequestMethod.POST)
	public String createPackage(Model model,
			@Valid @ModelAttribute("pack") Package pack,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/packageupdate";
		}
		adminService.addPackage(pack);
		return "redirect:../";
	}

	/**
	 * country update form
	 * 
	 * @param id
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/package/{id}", method = RequestMethod.GET)
	public String getPackageUpdateForm(@PathVariable long id, Model model) {
		Package pack = adminService.getPackage(id);
		model.addAttribute("pack", pack);
		model.addAttribute("places", adminService.getPlaces());
		model.addAttribute("sightseeings", adminService.getSightseeings());
		model.addAttribute("transports", adminService.getTransports());
		return "admin/packageupdate";
	}

	/**
	 * 
	 * @param country
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/package/update/", method = RequestMethod.POST)
	public String updatePackage(Model model,
			@Valid @ModelAttribute("pack") Package pack,
			BindingResult result) {
		if (result.hasErrors()) {
			return "admin/packageupdate";
		}
		adminService.updatePackage(pack);
		return "redirect:../";
	}

	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));

		binder.registerCustomEditor(Long.class, "id",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String text) {
						Long id = Long.parseLong(text);
						setValue(id);
					}
				});

		binder.registerCustomEditor(List.class, "places",
				new CustomCollectionEditor(List.class) {
					@Override
					protected Object convertElement(Object element) {
						Long id = null;
						if (element instanceof String
								&& !((String) element).equals("")) {
							// From the JSP 'element' will be a String
							try {
								id = Long.parseLong((String) element);
							} catch (NumberFormatException e) {
								System.out.println("Element was "
										+ ((String) element));
								e.printStackTrace();
							}
						} else if (element instanceof Long) {
							// From the database 'element' will be a Long
							id = (Long) element;
						}
						return id != null ? adminService.getPlace(id) : null;
					}
				});
		
		binder.registerCustomEditor(List.class, "sightseeings",
				new CustomCollectionEditor(List.class) {
					@Override
					protected Object convertElement(Object element) {
						Long id = null;
						if (element instanceof String
								&& !((String) element).equals("")) {
							// From the JSP 'element' will be a String
							try {
								id = Long.parseLong((String) element);
							} catch (NumberFormatException e) {
								System.out.println("Element was "
										+ ((String) element));
								e.printStackTrace();
							}
						} else if (element instanceof Long) {
							// From the database 'element' will be a Long
							id = (Long) element;
						}
						return id != null ? adminService.getSightseeing(id) : null;
					}
				});
		
		binder.registerCustomEditor(List.class, "transports",
				new CustomCollectionEditor(List.class) {
					@Override
					protected Object convertElement(Object element) {
						Long id = null;
						if (element instanceof String
								&& !((String) element).equals("")) {
							// From the JSP 'element' will be a String
							try {
								id = Long.parseLong((String) element);
							} catch (NumberFormatException e) {
								System.out.println("Element was "
										+ ((String) element));
								e.printStackTrace();
							}
						} else if (element instanceof Long) {
							// From the database 'element' will be a Long
							id = (Long) element;
						}
						return id != null ? adminService.getTransport(id) : null;
					}
				});
		
		binder.registerCustomEditor(Country.class, "country",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Country country = adminService.getCountry((Long
								.parseLong(id)));
						setValue(country);
					}
				});
		
		binder.registerCustomEditor(Place.class, "place",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Place place = adminService.getPlace((Long
								.parseLong(id)));
						setValue(place);
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
