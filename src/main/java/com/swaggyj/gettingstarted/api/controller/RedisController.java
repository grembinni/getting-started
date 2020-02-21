package com.swaggyj.gettingstarted.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaggyj.gettingstarted.api.RedisApi;
import com.swaggyj.gettingstarted.redis.Receiver;

@RestController
public class RedisController implements RedisApi {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedisController.class);

	private final StringRedisTemplate template;

	@Autowired
	public RedisController(StringRedisTemplate stringRedisTemplate, Receiver receiver) {
		this.template = stringRedisTemplate;
	}

	@Override
	@GetMapping("/api/redis/test")
	public String pingRedis() {

		LOGGER.info("Sending message...");
		template.convertAndSend("chat", "Hello from Redis!");

		return "success";
	}

}
