package com.swaggyj.gettingstarted.api.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swaggyj.gettingstarted.api.GreetingApi;
import com.swaggyj.gettingstarted.resource.Greeting;

@RestController
public class GreetingController implements GreetingApi {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Override
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}