package com.company.operation.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum OperationType implements EnumClass<Integer> {

    ADD(10),
    REDUCE(20);

    private final Integer id;

    OperationType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static OperationType fromId(Integer id) {
        for (OperationType at : OperationType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}