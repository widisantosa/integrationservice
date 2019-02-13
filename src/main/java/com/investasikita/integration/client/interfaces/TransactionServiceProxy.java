package com.investasikita.integration.client.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investasikita.integration.client.AuthorizedUserFeignClient;
import com.investasikita.integration.config.FeignConfiguration;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;
import com.investasikita.integration.web.rest.po.PortfolioPO;

@AuthorizedUserFeignClient(name = "mftransactionservice", configuration=FeignConfiguration.class)
public interface TransactionServiceProxy {
    @RequestMapping(value = "/api/mutual-fund-navs",method = RequestMethod.POST)
    ResponseEntity<MutualFundNAVDTO> createMutualFundNAV(@RequestBody MutualFundNAVDTO mutualFundNAVDTO);

    @RequestMapping(value = "/api/portfolio",method = RequestMethod.POST)
    ResponseEntity<PortfolioPO> createPortfolios(@RequestBody PortfolioPO portfolioPO);
 
}
