package com.investasikita.integration.client.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investasikita.integration.client.AuthorizedUserFeignClient;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;

@AuthorizedUserFeignClient(name = "mfproductservice")
public interface ProductServiceProxy {
    @RequestMapping(value = "/api/mutual-fund-navs/getlastnavbycode/IDN000195906",method = RequestMethod.GET)
    MutualFundNAVDTO findLastMutualFundNAVByMutualFundCode();

}
