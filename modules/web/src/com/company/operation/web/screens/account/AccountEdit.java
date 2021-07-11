package com.company.operation.web.screens.account;

import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Account;

@UiController("operation_Account.edit")
@UiDescriptor("account-edit.xml")
@EditedEntityContainer("accountDc")
@LoadDataBeforeShow
public class AccountEdit extends StandardEditor<Account> {
}