package com.example.fourth.card.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.fourth.card.service.CardService;

@RestController
public class DemoCardController {
	@Autowired
	ServiceCard scard;

	@GetMapping("/scard/{cardNo}")
	public String getCard(@PathVariable long cardNo) {
		return this.scard.getCardType(cardNo);
	}
}
