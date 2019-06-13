package com.github.sparsick.junit5.examples.basics;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
class A10_TextExecutionOrderTest {

    @Test
    @Order(1)
    void nullValues() {
        // perform assertions against null values
    }

    @Test
    @Order(2)
    void emptyValues() {
        // perform assertions against empty values
    }

    @Test
    @Order(3)
    void validValues() {
        // perform assertions against valid values
    }


//
//    Alphanumeric: sorts test methods alphanumerically based on their names and formal parameter lists.
//
//    OrderAnnotation: sorts test methods numerically based on values specified via the @Order annotation.
//
//    Random: orders test methods pseudo-randomly and supports configuration of a custom seed.



}
