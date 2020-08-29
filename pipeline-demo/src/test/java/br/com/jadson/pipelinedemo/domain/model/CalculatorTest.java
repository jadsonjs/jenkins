package br.com.jadson.pipelinedemo.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    /**
     * Simple calculate test
     */
    @Test
    public void sumTest(){
        Assertions.assertEquals(40, new Calculator().sum(10, 30));
    }

}