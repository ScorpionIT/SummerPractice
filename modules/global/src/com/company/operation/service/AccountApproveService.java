package com.company.operation.service;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationType;

import java.math.BigDecimal;

public interface AccountApproveService {
    String NAME = "operation_AccountApproveService";

    Account accountApprove(Account acc, BigDecimal bigDecimal, OperationType operationType);
}