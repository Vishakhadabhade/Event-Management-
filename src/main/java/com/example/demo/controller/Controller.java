package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Caterers;
import com.example.demo.entity.Decorators;
import com.example.demo.entity.Event;
import com.example.demo.entity.Locations;
import com.example.demo.entity.Users;
import com.example.demo.service.CaterersService;
import com.example.demo.service.DecoratorsService;
import com.example.demo.service.EventService;
import com.example.demo.service.LocationsService;
import com.example.demo.service.UsersService;

import jakarta.servlet.http.HttpSession;  

@RestController  
@CrossOrigin(origins="http://localhost:4200") 
public class Controller {
	
	
	@Autowired
	private CaterersService catservice;
	
	@Autowired
	private DecoratorsService decservice;
	
	@Autowired
	private EventService eveservice;
	
	@Autowired
	private LocationsService locservice;
	
	@Autowired
	private UsersService userservice;
	
	private final Logger logger = LoggerFactory.getLogger(Controller.class);
	
	
	
	@PostMapping("/caterers")
	public Caterers saveCaterer(@RequestBody Caterers caterer)
	{
		logger.info("save Caterer");
		return catservice.saveCaterer(caterer);
	}
	
	@GetMapping("/caterers")
	public List<Caterers>fetchCatererList()
	{
		logger.info("Get List of Caterers");
		return catservice.fetchCaterersList();
	}
	
	@GetMapping("caterers/{id}")
	public Caterers fetchCatererById(@PathVariable("id")Long id)
	{
		logger.info("Get Caterer from list");
		return catservice.fetchCatererById(id);
	}
	
	
	@DeleteMapping("/caterers/{id}")
	public String deleteCatererById(@PathVariable("id")Long id)
	{
		catservice.deleteCatererById(id);
		return "Caterer deleted from list";
		
	}
	
	@PutMapping("/caterers/{id}")
	public Caterers updateCaterer(@PathVariable("id")Long id ,@RequestBody Caterers caterer)
	{
		logger.info("Caterer updated");
		return catservice.updateCaterer(id, caterer);
	}

	
	
	
	@PostMapping("/decorators")
	public Decorators saveDecorator(@RequestBody Decorators decorator)
	{
		logger.info("save Decorator");
		return decservice.saveDecorator(decorator);
	}
	
	@GetMapping("/decorators")
	public List<Decorators>fetchDecoratorList()
	{
		logger.info("Get List of Decorators");
		return decservice.fetchDecoratorList();
	}
	
	@GetMapping("decorators/{id}")
	public Decorators fetchDecoratorById(@PathVariable("id")Long id)
	{
		logger.info("Get Decorator from list");
		return decservice.fetchDecoratorById(id);
	}
	
	
	@DeleteMapping("/decorators/{id}")
	public String deleteDecoratorById(@PathVariable("id")Long id)
	{
		decservice.deleteDecoratorById(id);
		return "Decorator deleted from list";
		
	}
	
	@PutMapping("/decorators/{id}")
	public Decorators updateDecorator(@PathVariable("id")Long id ,@RequestBody Decorators decorator)
	{
		logger.info("Decorator updated");
		return decservice.updateDecorator(id, decorator);
	}
	
	
	@PostMapping("/event")
	public Event saveEvent(@RequestBody Event event)
	{
		logger.info("save Event");
		return eveservice.saveEvent(event);
	}
	
	@GetMapping("/event")
	public List<Event>fetchEventList()
	{
		logger.info("Get List of Events");
		return eveservice.fetchEventList();
	}
	
	@GetMapping("event/{id}")
	public Event fetchEventById(@PathVariable("id")Long id)
	{
		logger.info("Get Event from list");
		return eveservice.fetchEventById(id);
	}
	
	
	@DeleteMapping("/event/{id}")
	public String deleteEventById(@PathVariable("id")Long id)
	{
		eveservice.deleteEventById(id);
		return "Event deleted from list";
		
	}
	
	@PutMapping("/event/{id}")
	public Event updateEvent(@PathVariable("id")Long id ,@RequestBody Event event)
	{
		logger.info("Event updated");
		return eveservice.updateEvent(id, event);
	}
	
	@PostMapping("/locations")
	public Locations saveLocation(@RequestBody Locations location)
	{
		logger.info("save Location");
		return locservice.saveLocation(location);
	}
	
	@GetMapping("/locations")
	public List<Locations>fetchLocationList()
	{
		logger.info("Get List of Locations");
		return locservice.fetchLocationList();
	}
	
	@GetMapping("locations/{id}")
	public Locations fetchLocationById(@PathVariable("id")Long id)
	{
		logger.info("Get Locations from list");
		return locservice.fetchLocationById(id);
	}
	
	
	@DeleteMapping("/locations/{id}")
	public String deleteLocationById(@PathVariable("id")Long id)
	{
		locservice.deleteLocationById(id);
		return "Location deleted from list";
		
	}
	
	@PutMapping("/locations/{id}")
	public Locations updateLocation(@PathVariable("id")Long id ,@RequestBody Locations location)
	{
		logger.info("Location updated");
		return locservice.updateLocation(id, location);
	}

	
	
	@PostMapping("/users")
	@CrossOrigin(origins = "http://localhost:4200")
	public Users saveUsers(@RequestBody Users users)throws Exception
	{
		String tempEmail = users.getEmail();
		if(tempEmail != null &&!"".equals(tempEmail)) {
			Users userObj =  userservice.fetchUserByEmail(tempEmail);
			if(userObj != null) {
				throw new Exception("User with "+tempEmail+" already exists ");
			}
		}
		Users userObj = null;
		
		userObj =  userservice.saveUsers(users);
		logger.info("save Users");
		return userObj;
	}
	
	@GetMapping("/users")
	public List<Users>fetchUserList()
	{
		logger.info("Get List of Users");
		return userservice.fetchUsersList();
	}
	
	@GetMapping("users/{id}")
	public Users fetchUserById(@PathVariable("id")Long id)
	{
		logger.info("Get Users from list");
		return userservice.fetchUsersById(id);
	}
	
	
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id")Long id)
	{
		userservice.deleteUsersById(id);
		return "User deleted from list";
		
	}
	
	@PutMapping("/users/{id}")
	public Users updateUser(@PathVariable("id")Long id ,@RequestBody Users users)
	{
		logger.info("User updated");
		return userservice.updateUsers(id, users);
	}


	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public Users loginUser(@RequestBody Users users ) throws Exception
	{
		String tempEmail = users.getEmail();
		String tempPass = users.getPassword();
		Users userObj = null;
		if(tempEmail != null && tempPass!= null) {
			userObj = userservice.fetchUserByEmailAndPassword(tempEmail , tempPass);
		}
		if(userObj == null) {
			throw new Exception ("bad credentials");
		}
		return userObj;
	}
}
