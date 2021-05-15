package com.example.three.SpringRestPincode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PinCodeController {
	
	@Autowired
	PinService sp;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return sp.getDetails(pincode);	
	}
}
