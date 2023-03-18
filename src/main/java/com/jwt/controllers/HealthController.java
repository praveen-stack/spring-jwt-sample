package com.jwt.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping({ "/health" })
    @ResponseBody
	public Map<String, String> health() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("status", "OK");
		return map;
	}
}