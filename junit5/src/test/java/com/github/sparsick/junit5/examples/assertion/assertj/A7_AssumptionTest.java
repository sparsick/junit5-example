package com.github.sparsick.junit5.examples.assertion.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assumptions.assumeThat;

class A7_AssumptionTest {

    @Test
    void assume(){
        assumeThat("Bonn").isEqualTo("Bonn");
    }
}
