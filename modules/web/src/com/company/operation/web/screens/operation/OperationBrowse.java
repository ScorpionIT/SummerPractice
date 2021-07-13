package com.company.operation.web.screens.operation;

import com.company.operation.service.SpendingService;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

import java.math.BigDecimal;

@UiController("operation_Operation.browse")
@UiDescriptor("operation-browse.xml")
@LookupComponent("operationsTable")
@LoadDataBeforeShow
public class OperationBrowse extends StandardLookup<Operation> {
}