package com.github.sparsick.junit5.examples.basics;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("domain")
class A4_TaggingFilteringTest {

    // Demo see surefire configuration

    @Tag("fast")
    @Test
    void testFast(){
        assertTrue(true);
    }

    @Tag("slow")
    @Tag("database")
    @Test
    void testslowDatabase(){
        assertTrue(true);
    }

}
