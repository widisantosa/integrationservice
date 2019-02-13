package com.investasikita.integration.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

 
public class PortfolioDTO implements Serializable {
	private Long id;

	private Instant portfolioDate;

	private BigDecimal averageNav;

	private BigDecimal nettUnit;

	private String currency;

 	private String status;

	private Instant createdAt;

	private Instant updatedAt;

 	private String client;

 	private String ifua;

	private Long gerai;

 	private String tags;

 	private String mutualFundCode;

	private Long portReturnId;

 	private String clientName;

 	private String mutualFundName;

	private BigDecimal aum;

	private BigDecimal investmentValue;

	private BigDecimal returnPerct;

	private Long clientDetailId;
	
	private BigDecimal avgUnit;

	private BigDecimal totalAmount;
	
	private BigDecimal lastUnit;
	
	private BigDecimal estimateAmount;

	private BigDecimal returnAmount;

 
	
 	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getPortfolioDate() {
		return portfolioDate;
	}

	public void setPortfolioDate(Instant portfolioDate) {
		this.portfolioDate = portfolioDate;
	}

	public BigDecimal getAverageNav() {
		return averageNav;
	}

	public void setAverageNav(BigDecimal averageNav) {
		this.averageNav = averageNav;
	}

	public BigDecimal getNettUnit() {
		return nettUnit;
	}

	public void setNettUnit(BigDecimal nettUnit) {
		this.nettUnit = nettUnit;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getIfua() {
		return ifua;
	}

	public void setIfua(String ifua) {
		this.ifua = ifua;
	}

	public Long getGerai() {
		return gerai;
	}

	public void setGerai(Long gerai) {
		this.gerai = gerai;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getMutualFundCode() {
		return mutualFundCode;
	}

	public void setMutualFundCode(String mutualFundCode) {
		this.mutualFundCode = mutualFundCode;
	}

	public Long getPortReturnId() {
		return portReturnId;
	}

	public void setPortReturnId(Long portfolioReturnId) {
		this.portReturnId = portfolioReturnId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getMutualFundName() {
		return mutualFundName;
	}

	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}

	public Long getClientDetailId() {
		return clientDetailId;
	}

	public void setClientDetailId(Long clientDetailId) {
		this.clientDetailId = clientDetailId;
	}

	public BigDecimal getAum() {
		return aum;
	}

	public void setAum(BigDecimal aum) {
		this.aum = aum;
	}

	public BigDecimal getInvestmentValue() {
		return investmentValue;
	}

	public void setInvestmentValue(BigDecimal investmentValue) {
		this.investmentValue = investmentValue;
	}

	public BigDecimal getReturnPerct() {
		return returnPerct;
	}

	public void setReturnPerct(BigDecimal returnPerct) {
		this.returnPerct = returnPerct;
	}

	public BigDecimal getAvgUnit() {
		return avgUnit;
	}

	public void setAvgUnit(BigDecimal avgUnit) {
		this.avgUnit = avgUnit;
	}
	
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public BigDecimal getLastUnit() {
		return lastUnit;
	}

	public void setLastUnit(BigDecimal lastUnit) {
		this.lastUnit = lastUnit;
	}
	
	public BigDecimal getEstimateAmount() {
		return estimateAmount;
	}

	public void setEstimateAmount(BigDecimal estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

 
}