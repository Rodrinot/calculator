package com.sanitas.calculator.controller;

import com.sanitas.calculator.service.OperationsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = OperationsController.class)
@ActiveProfiles("test")
class OperationsControllerTest {

    private static final String BASE_MAPPING = "/operations/calculate";

    @Autowired
    private MockMvc mvc;

    @MockBean
    private OperationsService service;

    @Test
    void calculate() throws Exception {
        Double value1 = 1.0;
        String operator = "add";
        Double value2 = 2.0;
        Double result = 3.0;

        when(this.service.calculate(value1, operator, value2)).thenReturn(result);

        this.mvc.perform(MockMvcRequestBuilders.get(BASE_MAPPING)
                .param("value1", String.valueOf(value1))
                .param("operator", operator)
                .param("value2", String.valueOf(value2)))
                .andExpect(status().isOk());

        verify(this.service).calculate(value1, operator, value2);
    }

}
