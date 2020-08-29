package br.com.jadson.pipelinedemo.domain.ports;

import br.com.jadson.pipelinedemo.domain.model.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {

    @InjectMocks
    private CalculatorServiceImpl service;

    /**
     * Simple calculate test for service
     */
    @Test
    public void sumTest(){
        Assertions.assertEquals(40, service.sum(10, 30));
    }

}