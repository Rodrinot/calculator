package com.sanitas.calculator.controller;

import com.sanitas.calculator.service.OperationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Controller that allows to carry out the different operations of the calculator.
 */
@Validated
@RestController
@RequestMapping(path = "/operations")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OperationsController {

    /** Calculator service */
    private final OperationsService service;

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
    @GetMapping("/calculate")
    @ResponseBody
    public Double calculate(@RequestParam("value1") Double value1,
                            @RequestParam("operator") String operator,
                            @RequestParam("value2") Double value2) {
        return this.service.calculate(value1, operator, value2);
    }
}
