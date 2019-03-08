package com.investasikita.integration.client.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.investasikita.integration.client.AuthorizedUserFeignClient;
import com.investasikita.integration.config.FeignConfiguration;
import com.investasikita.integration.service.dto.MutualFundNAVDTO;

@AuthorizedUserFeignClient(name = "mfproductservice")
public interface ProductServiceProxy {
    @RequestMapping(value = "/api/products/getlastnav",method = RequestMethod.GET)
    List<Object[]> getLastNAVAllMutualFund() ;
    
    @RequestMapping(value = "/api/products/all_products_im",method = RequestMethod.GET)
    List<Object[]> getAllProductsInvestmentManager() ;

 }
