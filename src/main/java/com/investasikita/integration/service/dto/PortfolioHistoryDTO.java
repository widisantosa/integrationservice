package com.investasikita.integration.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;

public class PortfolioHistoryDTO implements Serializable {

    private Long id;

    private Instant portfolioDate;

    private BigDecimal nettUnit;

    private BigDecimal averageNav;

    private BigDecimal nav;

    private Float histReturn;

    private Float returnPercent;

    private Long portfolioId;

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

    public BigDecimal getNettUnit() {
        return nettUnit;
    }

    public void setNettUnit(BigDecimal nettUnit) {
        this.nettUnit = nettUnit;
    }

    public BigDecimal getAverageNav() {
        return averageNav;
    }

    public void setAverageNav(BigDecimal averageNav) {
        this.averageNav = averageNav;
    }

    public BigDecimal getNav() {
        return nav;
    }

    public void setNav(BigDecimal nav) {
        this.nav = nav;
    }

    public Float getHistReturn() {
        return histReturn;
    }

    public void setHistReturn(Float histReturn) {
        this.histReturn = histReturn;
    }

    public Float getReturnPercent() {
        return returnPercent;
    }

    public void setReturnPercent(Float returnPercent) {
        this.returnPercent = returnPercent;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

}