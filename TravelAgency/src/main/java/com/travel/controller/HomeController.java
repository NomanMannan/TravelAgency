package com.travel.controller;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.travel.commons.PlanMyTripBooking;
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

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		List<Package> packages = customerService.getPackages();
		model.addAttribute("packages", packages);

		List<SightSeeing> sightseeings = customerService.getSightseeings();
		model.addAttribute("sightseeings", sightseeings);

		List<Transport> transports = customerService.getTransports();
		model.addAttribute("transports", transports);

		model.addAttribute("planmytripbooking", new PlanMyTripBooking());
		model.addAttribute("countries", customerService.getCountries());
		model.addAttribute("places", customerService.getPlaces());
		model.addAttribute("sightseeings", customerService.getSightseeings());

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

	/**
	 * 
	 * @param planmytripbooking
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/planmytripbooking/add/", method = RequestMethod.POST)
	public String createPlanMyTripBooking(
			Model model,
			@Valid @ModelAttribute("planmytripbooking") PlanMyTripBooking planmytripbooking,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors"+result.getFieldErrorCount());
			return "booking/error";
		}
		customerService.addPlanMyTripBooking(planmytripbooking);
		return "booking/successful";
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
		
		binder.registerCustomEditor(List.class, "travelToCountries",
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
						return id != null ? customerService.getCountry(id) : null;
					}
				});

		binder.registerCustomEditor(List.class, "travelToPlaces",
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
						return id != null ? customerService.getPlace(id) : null;
					}
				});
		
		binder.registerCustomEditor(List.class, "travelToSightSeeings",
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
						return id != null ? customerService.getSightseeing(id) : null;
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
						return id != null ? customerService.getTransport(id) : null;
					}
				});
		
		binder.registerCustomEditor(Country.class, "country",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Country country = customerService.getCountry((Long
								.parseLong(id)));
						setValue(country);
					}
				});
		
		binder.registerCustomEditor(Place.class, "place",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Place place = customerService.getPlace((Long
								.parseLong(id)));
						setValue(place);
					}
				});

	}

}
