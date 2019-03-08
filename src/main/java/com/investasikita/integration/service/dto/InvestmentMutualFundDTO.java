package com.investasikita.integration.service.dto;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Size;

public class InvestmentMutualFundDTO  implements Serializable {

	private Long id;

	@Size(max = 30)
	private String mutualFundCode;

	@Size(max = 255)
	private String mutualFundName;

	@Size(max = 255)
	private String mutualFundType;

	@Size(max = 25)
	private String sInvestCode;

	@Size(max = 255)
	private String sInvestName;

	@Size(max = 255)
	private String productType;

	@Size(max = 255)
	private String logoPath;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMutualFundCode() {
		return mutualFundCode;
	}

	public void setMutualFundCode(String mutualFundCode) {
		this.mutualFundCode = mutualFundCode;
	}

	public String getMutualFundName() {
		return mutualFundName;
	}

	public void setMutualFundName(String mutualFundName) {
		this.mutualFundName = mutualFundName;
	}

	public String getMutualFundType() {
		return mutualFundType;
	}

	public void setMutualFundType(String mutualFundType) {
		this.mutualFundType = mutualFundType;
	}

	public String getInvestCode() {
		return sInvestCode;
	}

	public void setInvestCode(String sInvestCode) {
		this.sInvestCode = sInvestCode;
	}

	public String getInvestName() {
		return sInvestName;
	}

	public void setInvestName(String sInvestName) {
		this.sInvestName = sInvestName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		InvestmentMutualFundDTO investmentMutualFundDTO = (InvestmentMutualFundDTO) o;
		if (investmentMutualFundDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), investmentMutualFundDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	@Override
	public String toString() {
		return "InvestmentMutualFundDTO{" + "id=" + getId() + ", " + "mutualFundCode='" + getMutualFundCode() + "'"
				+ ", " + "mutualFundName=" + getMutualFundName() + ", sInvestCode='" + getInvestCode() + "'"
				+ ", sInvestName='" + getInvestName() + "'" + ", productType='" + getProductType() + "'"
				+ ", logoPath='" + getLogoPath() + "}";
	}
}
