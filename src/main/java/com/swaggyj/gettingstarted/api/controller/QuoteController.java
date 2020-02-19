package com.swaggyj.gettingstarted.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggyj.gettingstarted.api.QuoteApi;
import com.swaggyj.gettingstarted.client.api.QuoteCapi;
import com.swaggyj.gettingstarted.client.resource.Quote;

@RestController
public class QuoteController implements QuoteApi {

	private final QuoteCapi quoteCapi;

	@Autowired
	public QuoteController(QuoteCapi quoteCapi) {
		super();
		this.quoteCapi = quoteCapi;
	}

	@Override
	@GetMapping("/quote")
	public Quote quote() {
		return quoteCapi.getQuote();
	}
}