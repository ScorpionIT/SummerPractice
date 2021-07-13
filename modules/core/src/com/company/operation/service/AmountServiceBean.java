package com.company.operation.service;

import com.company.operation.entity.Account;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(AmountService.NAME)
public class AmountServiceBean implements AmountService {

    @Override
    public boolean canAmountFieldBeFree(Account acc, BigDecimal amount) {
        BigDecimal fund = acc.getFunds();
        return !(amount.compareTo(fund) > 0);
    }
}