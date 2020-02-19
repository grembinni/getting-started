package com.swaggyj.gettingstarted.client.api.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.swaggyj.gettingstarted.client.api.QuoteCapi;
import com.swaggyj.gettingstarted.client.resource.Quote;
import com.swaggyj.gettingstarted.exception.InternalException;

@Component
public class QuoteCapiImpl implements QuoteCapi {

	private static final String URL = "https://gturnquist-quoters.cfapps.io/api/random";

	@Override
	public Quote getQuote() {

		final RestTemplate restTemplate = new RestTemplate();
		final ResponseEntity<Quote> response = restTemplate.getForEntity(URL, Quote.class);

		if (!response.getStatusCode().is2xxSuccessful()) {
			throw new InternalException();
		}

		return response.getBody();
	}

}
