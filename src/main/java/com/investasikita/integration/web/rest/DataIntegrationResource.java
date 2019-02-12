package com.investasikita.integration.web.rest;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.investasikita.integration.service.MutualFundNAVService;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/api")
public class DataIntegrationResource {
	private final Logger log = LoggerFactory.getLogger(DataIntegrationResource.class);

	private static final String ENTITY_NAME = "mfTransactionServiceIntegration";

	private final MutualFundNAVService mutualFundNAVService;

	public DataIntegrationResource(MutualFundNAVService mutualFundNAVService) {
		this.mutualFundNAVService = mutualFundNAVService;
 	}
	@GetMapping("/lastNav")
	@Timed
	public String getLastNAV() throws IOException {
 		return mutualFundNAVService.getAllLastNAV();
 	}

}
