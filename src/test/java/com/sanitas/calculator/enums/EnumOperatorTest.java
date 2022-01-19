package com.sanitas.calculator.enums;

import com.sanitas.calculator.enums.EnumOperator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class EnumOperatorTest {

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of("ADD", "ADD", 1, "add", "+"),
                Arguments.of("SUBTRACT", "SUBTRACT", 2, "sub", "-"),
                Arguments.of("NOT_SUPPORTED", "NOT_SUPPORTED", 0, "not supported", "0")
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void enum_test(String name, EnumOperator item, Integer code, String value, String symbol) {
        Assertions.assertEquals(name, item.toString());
        Assertions.assertEquals(name, item.name());
        Assertions.assertEquals(item, EnumOperator.fromValue(value));
        Assertions.assertEquals(code, item.getCode());
    }

}
