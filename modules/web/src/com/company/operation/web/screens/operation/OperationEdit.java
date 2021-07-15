package com.company.operation.web.screens.operation;

import com.company.operation.entity.Account;
import com.company.operation.entity.OperationCategory;
import com.company.operation.entity.OperationType;
import com.company.operation.service.AccountApproveService;
import com.company.operation.service.AmountService;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.EntityStates;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@UiController("operation_Operation.edit")
@UiDescriptor("operation-edit.xml")
@EditedEntityContainer("operationDc")
@LoadDataBeforeShow
public class OperationEdit extends StandardEditor<Operation> {
    @Inject
    private PickerField<Account> accountField;
    @Inject
    private TextField<BigDecimal> amountField;
    @Inject
    private LookupField<OperationType> typeField;
    @Inject
    private DataManager dataManager;
    @Inject
    private AmountService amountService;
    @Inject
    private AccountApproveService accountApproveService;
    @Inject
    private DateField<LocalDateTime> dataField;
    @Inject
    private LookupField<OperationCategory> categoryField;
    @Inject
    private EntityStates entityStates;
    @Inject
    private Notifications notifications;
    @Inject
    private Button commitAndCloseBtn;
    @Inject
    private TextField<String> commentaryField;

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        Operation e = getEditedEntity();
        if (!(e.getAccount() == null || e.getAmount() == null || e.getType() == null)) {

            if (!amountService.canAmountFieldBeFree(e.getAccount(), e.getAmount(), e.getType())) {
                errors.add("Сумма списания не может быть больше средств на счете!");
            }

        }

        if (!entityStates.isNew(e)) {
            typeField.setEnabled(false);
            amountField.setEnabled(false);
            errors.add("Нельзя редактировать тип и сумму операции после создания!");
        } else{
            typeField.setEnabled(true);
            amountField.setEnabled(true);
        }

        super.validateAdditionalRules(errors);
    }

    @Subscribe("commitAndCloseBtn")
    public void onCommitAndCloseBtnClick(Button.ClickEvent event) {

        if (accountField.getValue() != null && typeField.getValue() != null && amountField.getValue() != null && dataField.getValue() != null && categoryField.getValue() != null && !entityStates.isNew(getEditedEntity())) {
            dataManager.commit(accountApproveService.accountApprove(dataManager.load(Account.class).id(Objects.requireNonNull(accountField.getValue()).getId()).one(), amountField.getValue(), typeField.getValue()));
        }

    }

    @Subscribe("typeField")
    public void onTypeFieldValueChange(HasValue.ValueChangeEvent<OperationType> event) {
        if(!entityStates.isNew(getEditedEntity())){
            notifications.create().withCaption("Нельзя редактировать операцию!").show();
            typeField.setEnabled(false);
            amountField.setEnabled(false);
            accountField.setEnabled(false);
            dataField.setEnabled(false);
            categoryField.setEnabled(false);
            commentaryField.setEnabled(false);
            commitAndCloseBtn.setEnabled(false);

        }
    }

}