package com.company.operation.web.screens.operation;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationCategory;
import com.company.operation.entity.OperationType;
import com.company.operation.service.AmountService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@UiController("operation_Operation.edit")
@UiDescriptor("operation-edit.xml")
@EditedEntityContainer("operationDc")
@LoadDataBeforeShow
public class OperationEdit extends StandardEditor<Operation> {
    @Inject
    private LookupField<OperationCategory> categoryField;
    @Inject
    private PickerField<Account> accountField;
    @Inject
    private TextField<BigDecimal> amountField;
    @Inject
    private TextField<String> commentaryField;
    @Inject
    private DateField<LocalDateTime> dataField;
    @Inject
    private LookupField<OperationType> typeField;
    @Inject
    private DataManager dataManager;
    @Inject
    private Notifications notifications;
    @Inject
    private Button commitAndCloseBtn;
    @Inject
    private AmountService amountService;

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) throws Exception{
        Account acc = dataManager.load(Account.class).id(accountField.getValue().getId()).one();

        if(typeField.getValue().equals(OperationType.ADD)){
            acc.setFunds(acc.getFunds().add(amountField.getValue()));
        } else if (acc.getFunds().compareTo(amountField.getValue() )>=1){
            acc.setFunds(acc.getFunds().subtract(amountField.getValue()));
        }

        dataManager.commit(acc);
    }

    @Subscribe("amountField")
    public void onAmountFieldValueChange(HasValue.ValueChangeEvent<BigDecimal> event) {
        commitAndCloseBtn.setEnabled(amountService.canAmountFieldBeFree(dataManager.load(Account.class).id(accountField.getValue().getId()).one(),amountField.getValue()));
    }

    @Subscribe("accountField")
    public void onAccountFieldValueChange(HasValue.ValueChangeEvent<Account> event) {
        typeField.setEnabled(true);
        amountField.setEnabled(true);
        dataField.setEnabled(true);
        categoryField.setEnabled(true);
        commentaryField.setEnabled(true);
        commitAndCloseBtn.setEnabled(false);
    }

}