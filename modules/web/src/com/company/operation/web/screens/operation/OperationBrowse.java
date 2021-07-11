package com.company.operation.web.screens.operation;

import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

@UiController("operation_Operation.browse")
@UiDescriptor("operation-browse.xml")
@LookupComponent("operationsTable")
@LoadDataBeforeShow
public class OperationBrowse extends StandardLookup<Operation> {
}