package com.company.operation.service;

import com.company.operation.entity.Operation;
import com.company.operation.entity.OperationCategory;
import com.company.operation.entity.OperationType;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.FluentLoader;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service(SpendingService.NAME)
public class SpendingServiceBean implements SpendingService {

    @Inject
    private DataManager dataManager;

    @Override
    public BigDecimal allSpendingByDate(OperationCategory category, Date dateStart, Date dateEnd) {
        //OperationCategory food = OperationCategory.FOOD;
        OperationType reduce = OperationType.REDUCE;
        List<Operation> operationList = dataManager.load(Operation.class)
                .query("select e from operation_Operation e where " +
                        "(e.data between :dateStart and :dateEnd) " +
                        "and e.type = :reduce " +
                        "and e.category = :category")
                .parameter("reduce",reduce)
                .parameter("category",category)
                .parameter("dateStart", dateStart)
                .parameter("dateEnd", dateEnd)
                .list();
        BigDecimal res = new BigDecimal(0);
        for (int i=0; i <operationList.size();i++){
            res = res.add(operationList.get(i).getAmount());
        }
        return res;
    }
}