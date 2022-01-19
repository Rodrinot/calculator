package com.sanitas.calculator.service;

import com.sanitas.calculator.enums.EnumOperator;
import org.springframework.stereotype.Service;
import io.corp.calculator.TracerImpl;

@Service
public class OperationsServiceImpl implements OperationsService {

    @Override
    public Double calculate(Double value1, String operator, Double value2) {
        TracerImpl tracer = new TracerImpl();
        Double result = 0.d;

        // Check if the values are not null
        if (!checkNullValues(value1, value2)) {
            // Check if the operation is supported by the calculator
            switch (checkOperation(operator)) {

                case 1:
                    // Addition
                    result = value1 + value2;
                    break;
                case 2:
                    // Subtraction
                    result = value1 - value2;
                    break;
                default:
                    break;
            }
            tracer.trace(result);
        }
        return result;
    }

    private boolean checkNullValues(Double value1, Double value2) {
        return ((value1 == null) || (value2 == null) || (value1.isNaN()) || (value2.isNaN()));
    }

    /**
     * Check if the operator is supported
     *
     * @param operator
     *        Operator of the calculator
     *
     * @return code of the operator, 0 if it is not supported
     */
    private int checkOperation(String operator) {
        return EnumOperator.fromValue(operator).getCode();
    }

}
