package com.investasikita.integration.service;

import java.io.IOException;

import com.investasikita.integration.client.AuthorizedUserFeignClient;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;

public interface MutualFundNAVService {

	public void getAllLastNAV() throws IOException;

	public void getAllInventmentMutualFund() throws IOException;
 }
