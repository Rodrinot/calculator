package com.sanitas.calculator.enums;

import lombok.Getter;

import java.util.stream.Stream;

/**
 * Operators supported by the calculator
 */
@Getter
public enum EnumOperator {
    ADD(1, "add", "+"),
    SUBTRACT(2, "sub", "-"),
    NOT_SUPPORTED(0, "not supported", "0");

    /** Code of the operator */
    private final Integer code;
    /** Abbreviation of the operator */
    private final String value;
    /** Symbol of the operator */
    private final String symbol;

    /** Constructor */
    EnumOperator(Integer code, String value, String symbol) {
        this.code = code;
        this.value = value;
        this.symbol = symbol;
    }

    public static EnumOperator fromValue(String v) {
        return Stream.of(EnumOperator.values()).filter(status -> status.value.equals(v)).findFirst()
                .orElse(NOT_SUPPORTED);
    }

}
