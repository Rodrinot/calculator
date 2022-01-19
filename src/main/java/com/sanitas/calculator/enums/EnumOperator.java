package com.sanitas.calculator.enums;

import lombok.Getter;

/**
 * Operators supported by the calculator
 */
@Getter
public enum EnumOperator {
    ADD("add", "+"),
    SUBTRACT("sub", "-");

    /** Abbreviation of the operator */
    private final String value;
    /** Symbol of the operator */
    private final String symbol;

    /** Constructor */
    EnumOperator(String value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

}
