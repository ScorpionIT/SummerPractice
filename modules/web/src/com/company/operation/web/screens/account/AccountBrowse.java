package com.company.operation.web.screens.account;

import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Account;

@UiController("operation_Account.browse")
@UiDescriptor("account-browse.xml")
@LookupComponent("accountsTable")
@LoadDataBeforeShow
public class AccountBrowse extends StandardLookup<Account> {
}