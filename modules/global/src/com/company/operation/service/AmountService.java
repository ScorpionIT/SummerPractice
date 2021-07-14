package com.company.operation.service;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationType;

import java.math.BigDecimal;

public interface AmountService {
    String NAME = "operation_AmountService";

    boolean canAmountFieldBeFree(Account acc, BigDecimal amount, OperationType operationType);
}