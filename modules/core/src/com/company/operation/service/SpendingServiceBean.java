package com.company.operation.service;

import com.company.operation.entity.Operation;
import com.company.operation.entity.OperationCategory;
import com.company.operation.entity.OperationType;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service(SpendingService.NAME)
public class SpendingServiceBean implements SpendingService {

    @Inject
    private DataManager dataManager;

    @Override
    public BigDecimal allSpendingByDate(OperationCategory category, Date dateStart, Date dateEnd) {
        //Сделал вашим примером, не работал корректно
        // Оставил как есть
        List<Operation> operationList = dataManager.load(Operation.class)
                .query("select e from operation_Operation e where " +
                        "(e.data between :dateStart and :dateEnd) " +
                        "and e.type = :reduce " +
                        "and e.category = :category")
                .parameter("reduce", OperationType.REDUCE)
                .parameter("category", category)
                .parameter("dateStart", dateStart)
                .parameter("dateEnd", dateEnd)
                .list();
        BigDecimal res = new BigDecimal(0);
        for (Operation operation : operationList) {
            res = res.add(operation.getAmount());
        }
        return res;
    }
}