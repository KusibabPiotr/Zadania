package com.illa.patterns.singleton;

import com.illa.patterns.singleton.Logger;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LoggerTest {

//    @Test
//    public void shouldReturnLastLog(){
//        //given
//        Logger hello = new Logger();
//        hello.log("Hello!");
//        //when
//        String lastLog = hello.getLastLog();
//        //then
//        assertThat(lastLog).isEqualTo("Hello!");
//    }

    @Test
    public void shouldReturnLastLog(){
        //given
        Logger instance = Logger.getInstance();
        instance.log("Hello 2!");
        //when
        String lastLog = instance.getLastLog();
        //then
        assertThat(lastLog).isEqualTo("Hello 2!");
    }
}