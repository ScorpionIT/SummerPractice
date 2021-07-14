package com.company.operation.service;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(AmountService.NAME)
public class AmountServiceBean implements AmountService {

    @Override
    public boolean canAmountFieldBeFree(Account acc, BigDecimal amount, OperationType operationType) {

        if(operationType == OperationType.REDUCE)
            return !(amount.compareTo(acc.getFunds()) > 0);

        return true;
    }
}