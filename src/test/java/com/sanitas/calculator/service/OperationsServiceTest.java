package com.sanitas.calculator.service;

import com.sanitas.calculator.controller.OperationsController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = OperationsController.class)
@ActiveProfiles("test")
class OperationsServiceTest {

    @MockBean
    private OperationsService service;

    @Test
    void calculate() {
        Double value1 = 4.0;
        String operator = "sub";
        Double value2 = 2.0;
        Double expected = 2.0;

        when(this.service.calculate(value1, operator, value2)).thenReturn(expected);

        Double result = this.service.calculate(value1, operator, value2);

        verify(this.service).calculate(value1, operator, value2);

        Assertions.assertNotNull(result);
        Assertions.assertEquals(result, expected);
    }

}
