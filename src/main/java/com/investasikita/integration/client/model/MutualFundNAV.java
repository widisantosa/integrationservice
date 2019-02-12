package com.investasikita.integration.client.model;

import java.math.BigDecimal;
import java.time.Instant;

public class MutualFundNAV {
	private Long id;

	private Instant effectiveDate;

	private BigDecimal value;

	private Instant createdAt;

	private String createdBy;

	private Instant updatedAt;

	private String updatedBy;

	private String status;

	private String mutualFundCode;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Instant effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMutualFundCode() {
		return mutualFundCode;
	}

	public void setMutualFundCode(String mutualFundCode) {
		this.mutualFundCode = mutualFundCode;
	}
}
