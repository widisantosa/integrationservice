package com.investasikita.integration.client.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investasikita.integration.client.AuthorizedUserFeignClient;
import com.investasikita.integration.client.model.MutualFundNAV;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;

@AuthorizedUserFeignClient(name = "mftransactionservice")
public interface TransactionServiceProxy {
    @RequestMapping(value = "/api/mutual-fund-navs",method = RequestMethod.POST)
    ResponseEntity<MutualFundNAVDTO> createMutualFundNAV(@RequestBody MutualFundNAVDTO mutualFundNAVDTO);

}
