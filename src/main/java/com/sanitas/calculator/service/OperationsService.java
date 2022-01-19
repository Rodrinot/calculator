package com.sanitas.calculator.service;

/**
 * Operations service
 */
public interface OperationsService {

    /**
     * Execute an operation on the calculator
     *
     * @param value1
     *        First value of the operation
     *
     * @param operator
     *        Type of operation
     *
     * @param value2
     *        Second value of the operation
     *
     * @return result of the operation
     */
    Double calculate(Double value1, String operator, Double value2);

}
