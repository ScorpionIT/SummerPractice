package com.company.operation.service;

import com.company.operation.entity.Account;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;

@Service(AmountService.NAME)
public class AmountServiceBean implements AmountService {

    @Inject
    private DataManager dataManager;

    @Override
    public boolean canAmountFieldBeFree(Account acc, BigDecimal amount) {
        BigDecimal fund = acc.getFunds();
        return !(amount.compareTo(fund) >= 1);
    }
}