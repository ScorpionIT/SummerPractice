package com.company.operation.service;

import com.company.operation.entity.Account;

import java.math.BigDecimal;

public interface AmountService {
    String NAME = "operation_AmountService";

    public boolean canAmountFieldBeFree (Account acc, BigDecimal amount);
}