package org.self.limitsservice.controller;

import org.self.limitsservice.pojo.Limits;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsServiceController {

	@Value("${limits-service.minimum}")
	private String minimum;
	
	@Value("${limits-service.maximum}")
	private String maximum;
	
	@GetMapping("/limit")
	public Limits getLimits() {
		Limits limit = new Limits(Integer.parseInt(minimum), Integer.parseInt(maximum));
		return limit;
	}
}
