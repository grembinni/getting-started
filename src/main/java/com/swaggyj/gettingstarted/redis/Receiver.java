package com.swaggyj.gettingstarted.redis;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	private final AtomicInteger counter = new AtomicInteger();

	public int getCount() {
		return counter.get();
	}

	public void receiveMessage(String message) {
		LOGGER.info("Received <" + message + ">");
		counter.incrementAndGet();
	}
}