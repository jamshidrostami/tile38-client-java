package com.bard.tile38.enumeration;

public enum OperationEnum {
    GREATER("+inf"), LESS("-inf");

    private String value;

    OperationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
