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

        // TODO: Check if value1 and value2 are nulls and operator exists.
        /** Addition */
        if (operator.equals(EnumOperator.ADD.getValue())) {
            result = value1 + value2;
        }
        /** Substraction */
        else if (operator.equals(EnumOperator.SUBTRACT.getValue())) {
            result = value1 - value2;
        }

        tracer.trace(result);

        return result;
    }

}
