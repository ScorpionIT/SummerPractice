package com.company.operation.web.screens.operation;

import com.company.operation.entity.OperationCategory;
import com.company.operation.service.SpendingService;
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
    private DateField<Date> startDate;
    @Inject
    private DateField<Date> endDate;
    @Inject
    private LookupField<OperationCategory> categoryField;
    @Inject
    private CurrencyField<BigDecimal> spendingsResult;
    @Inject
    private SpendingService spendingService;

    @Subscribe("spendingsBtn")
    public void onSpendingsButtonClick(Button.ClickEvent event) {
        BigDecimal res = spendingService.allSpendingByDate(categoryField.getValue(), startDate.getValue(), endDate.getValue());
        if (res == null) {
            spendingsResult.setValue(null);
        }
        spendingsResult.setValue(res);
    }
}