package com.arun.demo.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//for local development
//@FeignClient(value = "demo2", url="http://localhost:8082/")
//using microserveice name 
//@FeignClient(value = "demo2")



//@FeignClient(value = "demo2", url="${DEMO2_SERVICE_HOST:http://localhost}:8082")



//WE ARE PASSING CUSTOME URI TO OPEN FEIGN IF OUR DEMO2 IS NOT AVAILABLE THEN IT WILL HANDLE ACCORDINGLEY	
@FeignClient(value = "demo2", url="${DEMO2_URI_SERVICE_HOST:http://localhost}:8082")
public interface Openfeignexample {
	 @GetMapping("/open-feign")
	    String getval();
}
