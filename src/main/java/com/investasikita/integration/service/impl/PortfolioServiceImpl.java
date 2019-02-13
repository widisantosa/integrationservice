package com.investasikita.integration.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.investasikita.integration.client.interfaces.TransactionServiceProxy;
import com.investasikita.integration.service.PortfolioService;
import com.investasikita.integration.web.rest.po.PortfolioPO;

@Service
@Transactional
public class PortfolioServiceImpl  implements PortfolioService {
	private final Logger log = LoggerFactory.getLogger(PortfolioServiceImpl.class);

 	static TransactionServiceProxy transactionService;

	public PortfolioServiceImpl( TransactionServiceProxy transactionService) {
 		this.transactionService = transactionService;
	}

	@Override
	public void savePortfolio() {
		try {
			PortfolioPO po = new PortfolioPO();
			//po.setMutualFundCode("IDN000058500");
  			transactionService.createPortfolios(po);

 		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage().toString();
		}
 	}

 }
