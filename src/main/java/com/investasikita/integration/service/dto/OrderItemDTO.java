package com.investasikita.integration.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class OrderItemDTO implements Serializable {

	private Long id;

	@Size(max = 25)
	private String orderItemNo;

	private String transactionType;

	private BigDecimal orderAmount;

	private BigDecimal orderUnit;

	private Boolean isAllUnit;

	private BigDecimal feeAmount;

	private BigDecimal totalAmount;

	private String currency;

	private Instant navDate;

	private BigDecimal nav;

	private BigDecimal amountTo;

	private BigDecimal orderUnitTo;

	private BigDecimal navTo;

	private String tags;

	private Boolean isNominalOps;

	private String status;

	private String client;

	private String ifua;

	private Long gerai;

	private String productFrom;

	private String productTo;

	private String productType;

	private Long trxOrderId;

	private Long batchId;

	private String batchBatchCode;

	private String mutualFundName;

	private String mutualFundCode;

	private String investmentManagerName;

	private String portfolioMutualFundCode;

	private Long portfolioId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderItemNo() {
		return orderItemNo;
	}

	public void setOrderItemNo(String orderItemNo) {
		this.orderItemNo = orderItemNo;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public BigDecimal getOrderUnit() {
		return orderUnit;
	}

	public void setOrderUnit(BigDecimal orderUnit) {
		this.orderUnit = orderUnit;
	}

	public Boolean isIsAllUnit() {
		return isAllUnit;
	}

	public void setIsAllUnit(Boolean isAllUnit) {
		this.isAllUnit = isAllUnit;
	}

	public BigDecimal getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Instant getNavDate() {
		return navDate;
	}

	public void setNavDate(Instant navDate) {
		this.navDate = navDate;
	}

	public BigDecimal getNav() {
		return nav;
	}

	public void setNav(BigDecimal nav) {
		this.nav = nav;
	}

	public BigDecimal getAmountTo() {
		return amountTo;
	}

	public void setAmountTo(BigDecimal amountTo) {
		this.amountTo = amountTo;
	}

	public BigDecimal getOrderUnitTo() {
		return orderUnitTo;
	}

	public void setOrderUnitTo(BigDecimal orderUnitTo) {
		this.orderUnitTo = orderUnitTo;
	}

	public BigDecimal getNavTo() {
		return navTo;
	}

	public void setNavTo(BigDecimal navTo) {
		this.navTo = navTo;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Boolean isIsNominalOps() {
		return isNominalOps;
	}

	public void setIsNominalOps(Boolean isNominalOps) {
		this.isNominalOps = isNominalOps;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getProductFrom() {
		return productFrom;
	}

	public void setProductFrom(String productFrom) {
		this.productFrom = productFrom;
	}

	public String getProductTo() {
		return productTo;
	}

	public void setProductTo(String productTo) {
		this.productTo = productTo;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Long getTrxOrderId() {
		return trxOrderId;
	}

	public void setTrxOrderId(Long trxOrderId) {
		this.trxOrderId = trxOrderId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long transactionBatchId) {
		this.batchId = transactionBatchId;
	}

	public String getBatchBatchCode() {
		return batchBatchCode;
	}

	public void setBatchBatchCode(String transactionBatchBatchCode) {
		this.batchBatchCode = transactionBatchBatchCode;
	}

	public String getPortfolioMutualFundCode() {
		return portfolioMutualFundCode;
	}

	public void setPortfolioMutualFundCode(String portfolioMutualFundCode) {
		this.portfolioMutualFundCode = portfolioMutualFundCode;
	}

	public String getMutualFundName() {
		return mutualFundName;
	}

	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}

	public String getMutualFundCode() {
		return mutualFundCode;
	}

	public void setMutualFundCode(String mutualFundCode) {
		this.mutualFundCode = mutualFundCode;
	}

	public String getInvestmentManagerName() {
		return investmentManagerName;
	}

	public void setInvestmentManagerName(String investmentManagerName) {
		this.investmentManagerName = investmentManagerName;
	}

}