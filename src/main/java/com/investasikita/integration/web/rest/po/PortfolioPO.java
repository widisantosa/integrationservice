package com.investasikita.integration.web.rest.po;

import java.io.Serializable;
import java.util.Collection;

import com.investasikita.integration.service.dto.OrderItemDTO;
import com.investasikita.integration.service.dto.PortfolioDTO;
import com.investasikita.integration.service.dto.PortfolioHistoryDTO;

public class PortfolioPO implements Serializable {
	
    public PortfolioDTO portfolioEntity;
    public Collection<PortfolioHistoryDTO> portfolioHisotryEntities;
    
    public Collection<OrderItemDTO> OrderItemEntities;
    
 
}
