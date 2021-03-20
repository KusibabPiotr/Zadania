package spring.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTest{

    private final AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext("spring.calculator");
    @Test
    public void testCalculations() {
        // given
        Calculator calculator = context.getBean(Calculator.class);
        // when
        double add = calculator.add(10, 5);
        double sub = calculator.sub(10, 5);
        double div = calculator.div(10, 5);
        double mul = calculator.mul(10, 5);
        // then
        assertThat(add).isEqualTo(15);
        assertThat(sub).isEqualTo(5);
        assertThat(div).isEqualTo(2);
        assertThat(mul).isEqualTo(50);
    }
}