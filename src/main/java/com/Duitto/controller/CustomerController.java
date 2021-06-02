package com.Duitto.controller;

import java.util.HashMap;
import java.util.Optional;

import com.Duitto.dto.UserDto;
import com.Duitto.model.ConfirmationTokenModel;
import com.Duitto.model.CustomerRegistrationModel;
import com.Duitto.service.CustomerService;

import org.json.JSONObject;
import org.json.JSONString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	@PostMapping("/signup")
	public HashMap<String, Object> customerSignUp(@RequestBody UserDto customer) {

		return customerservice.registerCustomer(customer);

	}

	@PostMapping("/signin")
	public HashMap<String, Object> customerSignIn(@RequestBody UserDto customer) {

		return customerservice.customerSignIn(customer);

	}

	@GetMapping("/confirm/{token}")
	public HashMap<String, Object> confirmMail(@PathVariable String token) {
		HashMap<String, Object> map = new HashMap();
		Optional<ConfirmationTokenModel> optionalConfirmationToken = customerservice.findByConfirmationToken(token);
		if (optionalConfirmationToken.isPresent()) {
			map = customerservice.confirmUser(optionalConfirmationToken.get());
		} else {
			map.put("status", false);
			map.put("message", "Link expired");
		}
		return map;
	}

	@GetMapping("/loginVerification/{token}")
	//@PreAuthorize("hasRole('USER')")
	public HashMap<String, Object> loginVerification(@PathVariable String token) {

		return customerservice.loginVerification(token);

	}

	@PostMapping("/userNameVerification")
	public  HashMap<String, Object> userNameVerification(@RequestBody String json) {

		return customerservice.userNameVerification(json);

	}
	
	@PostMapping("/requestToAdminForReservedUserName")
	public  HashMap<String, Object> requestToAdminForReservedUserName(@RequestBody String json) {

		return customerservice.requestToAdminForReservedUserName(json);

	}
	

}
