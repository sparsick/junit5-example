package com.github.sparsick.junit5.examples.assertion.assertj;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A2_AssertionDescriptionTest {

    @Disabled
    @Test
    void assertionWithDescription(){
        Hero superman = new Hero("Superman", "Clark Kent");
        assertThat(superman.getRealName()).as("check %s's real name", superman.getName()).isEqualTo("Bruce Wayne");
    }

    @Test
    void customizeErrorMessage(){
        Hero superman = new Hero("Superman", "Clark Kent");
        Hero batman = new Hero("Batman", "Bruce Wayne");
        assertThat(superman).withFailMessage("should be %s", superman).isEqualTo(batman);
    }


}
