package com.company.operation.service;

import com.company.operation.entity.OperationCategory;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public interface SpendingService {
    String NAME = "operation_SpendingService";

    BigDecimal allSpendingByDate(OperationCategory category, Date date, Date dateEnd);
}