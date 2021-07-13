package com.company.operation.web.screens.operation;

import com.company.operation.entity.OperationCategory;
import com.company.operation.service.SpendingService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.CurrencyField;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Date;

@UiController("operation_Operation-spendings.browse")
@UiDescriptor("operation-browse-spendings.xml")
@LookupComponent("operationsTable")
@LoadDataBeforeShow
public class OperationBrowseSpendings extends StandardLookup<Operation> {
    @Inject
    private Button spendingsBtn;
    @Inject
    private Screens screens;
    @Inject
    private DataManager dataManager;
    @Inject
    private DateField<Date> startDate;
    @Inject
    private DateField<Date> endDate;
    @Inject
    private LookupField categoryField;
    @Inject
    private CurrencyField<BigDecimal> spendingsResult;
    @Inject
    private SpendingService spendingService;

    @Subscribe("spendingsBtn")
    public void onSpendingsButtonClick(Button.ClickEvent event){
        Date start = startDate.getValue();
        Date end = endDate.getValue();
        OperationCategory operationCategory = (OperationCategory) categoryField.getValue();
        BigDecimal res = spendingService.allSpendingByDate(operationCategory,start,end);
        if (res == null) spendingsResult.setValue(null);
        spendingsResult.setValue(res);
    }
}