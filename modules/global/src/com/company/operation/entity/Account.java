package com.company.operation.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "OPERATION_ACCOUNT")
@Entity(name = "operation_Account")
@NamePattern("%s|accName")
public class Account extends StandardEntity {
    private static final long serialVersionUID = 338492386569364700L;

    @Column(name = "ACC_NAME", nullable = false, unique = true, length = 20)
    @NotNull
    private String accName;

    @Column(name = "CURRENCY")
    @NotNull
    private String currency;

    @Column(name = "FUNDS")
    @NotNull
    private BigDecimal funds;

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }

    public BigDecimal getFunds() {
        return funds;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccName() {
        return accName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}