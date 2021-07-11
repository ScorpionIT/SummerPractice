package com.company.operation.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "OPERATION_OPERATION")
@Entity(name = "operation_Operation")
@NamePattern("%s|data")
public class Operation extends StandardEntity {
    private static final long serialVersionUID = 8645215951665096997L;

    @NotNull
    @Column(name = "TYPE_", nullable = false)
    private String type;

    @Column(name = "AMOUNT", nullable = false)
    @NotNull
    private BigDecimal amount;

    @NotNull
    @Column(name = "DATA_", nullable = false, unique = true)
    private LocalDateTime data;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "COMMENTARY")
    private String commentary;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}