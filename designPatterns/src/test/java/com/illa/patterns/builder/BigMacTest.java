package com.illa.patterns.builder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BigMacTest {

    @Test
    public void testBuildBigMac(){
        //given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun(true)
                .sauce(Sauce.KETCHUP)
                .burgers(2)
                .ingredient(Ingredient.BACON)
                .ingredient(Ingredient.CHEESE)
                .ingredient(Ingredient.ONION)
                .build();
        //when
        List<Ingredient> ingredients = bigMac.getList();
        //then
        assertThat(ingredients).hasSize(3);
        assertThat(bigMac.getBun().isContainsSesame()).isTrue();
        assertThat(bigMac.getSauce().toString()).isEqualTo("KETCHUP");
        assertThat(bigMac.getBurgers()).isEqualTo(2);
    }
}