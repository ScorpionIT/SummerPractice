package com.company.operation.web.screens.operation;

import com.haulmont.cuba.gui.screen.*;
import com.company.operation.entity.Operation;

@UiController("operation_Operation.edit")
@UiDescriptor("operation-edit.xml")
@EditedEntityContainer("operationDc")
@LoadDataBeforeShow
public class OperationEdit extends StandardEditor<Operation> {
}