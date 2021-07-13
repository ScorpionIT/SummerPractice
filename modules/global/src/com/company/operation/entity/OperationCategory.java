package com.company.operation.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OperationCategory implements EnumClass<String> {

    HEALTH("A"),
    FOOD("B"),
    SERVICES("C"),
    TECHNICS("D"),
    ENTERTAINMENT("E"),
    CLOTHES("F"),
    OTHER("G");

    private String id;

    OperationCategory(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OperationCategory fromId(String id) {
        for (OperationCategory at : OperationCategory.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}