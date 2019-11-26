package com.github.sparsick.junit5.examples.assertion.assertj;

import java.util.List;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class A8_ConditionTest {

    List<String> femaleHeros = List.of("Wonder Woman", "Supergirl");

    Condition<Hero> supernaturalPower = new Condition<>(hero -> hero.hasSupernaturalPower(), "supernatural power");
    Condition<Hero> female = new Condition<>(hero -> femaleHeros.contains(hero.getName()), "female power");

    @Test
    void conditions(){
        Hero hero = new Hero("Superman", "Clark Kent");
        hero.setSupernaturalPower(true);
        assertThat(hero).is(female);
        assertThat(hero).has(supernaturalPower);
    }
}
