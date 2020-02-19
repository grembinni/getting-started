package com.swaggyj.gettingstarted.api;

import com.swaggyj.gettingstarted.resource.Greeting;

public interface GreetingApi {

	Greeting greeting(String name);
}