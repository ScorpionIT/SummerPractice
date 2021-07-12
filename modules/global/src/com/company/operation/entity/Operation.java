package com.company.operation.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Table(name = "OPERATION_OPERATION")
@Entity(name = "operation_Operation")
@NamePattern("%s %s|type,category")
public class Operation extends StandardEntity {
    private static final long serialVersionUID = 8645215951665096997L;

    @Column(name = "TYPE_", nullable = false)
    @NotNull
    private Integer type;

    @Column(name = "AMOUNT", nullable = false)
    @NotNull
    private BigDecimal amount;

    @NotNull
    @Column(name = "DATA_", nullable = false)
    private LocalDateTime data;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "COMMENTARY")
    private String commentary;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACCOUNT_ID")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    private Account account;

    public void setCategory(OperationCategory category) {
        this.category = category == null ? null : category.getId();
    }

    public OperationCategory getCategory() {
        return category == null ? null : OperationCategory.fromId(category);
    }

    public void setType(OperationType type) {
        this.type = type == null ? null : type.getId();
    }

    public OperationType getType() {
        return type == null ? null : OperationType.fromId(type);
    }

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

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}