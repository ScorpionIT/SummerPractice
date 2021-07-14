package com.company.operation.service;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Objects;

@Service(AccountApproveService.NAME)
public class AccountApproveServiceBean implements AccountApproveService {

    @Override
    public Account accountApprove(Account acc, BigDecimal amount, OperationType operationType) {
        if(Objects.equals(operationType, OperationType.ADD)){
            acc.setFunds(acc.getFunds().add(amount));
        } else if (acc.getFunds().compareTo(amount )> 0){
            acc.setFunds(acc.getFunds().subtract(amount));
        } else acc.setFunds(new BigDecimal("0.0"));
        return acc;
    }
}