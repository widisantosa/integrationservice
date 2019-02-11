package com.investasikita.integration.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundNAVDTO implements Serializable {
	private Long id;

	private Instant effectiveDate;

	private BigDecimal value;

	private Instant createdAt;

	@Size(max = 50)
	private String createdBy;

	private Instant updatedAt;

	@Size(max = 50)
	private String updatedBy;

	@Size(max = 50)
	private String status;

	@Size(max = 25)
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

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		MutualFundNAVDTO mutualFundNAVDTO = (MutualFundNAVDTO) o;
		if (mutualFundNAVDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), mutualFundNAVDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "MutualFundNAVDTO{" + "id=" + getId() + ", effectiveDate='" + getEffectiveDate() + "'" + ", value="
				+ getValue() + ", createdAt='" + getCreatedAt() + "'" + ", createdBy='" + getCreatedBy() + "'"
				+ ", updatedAt='" + getUpdatedAt() + "'" + ", updatedBy='" + getUpdatedBy() + "'" + ", status='"
				+ getStatus() + "'" + ", mutualFundCode=" + getMutualFundCode() + "}";
	}
}