package study;

import static org.assertj.core.api.Assertions.*;

import com.calculator.StringCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {
    static StringCalculator calculator;

    @BeforeEach
    void setUp(){
       calculator = new StringCalculator(Integer.parseInt("2"));
    }
    @Test
    @DisplayName("값을 더하는 테스트")
    void add() {
        calculator.add(3);
        int result = calculator.result;
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("값을 빼는 테스트")
    void substract() {
        calculator.subtract(2);
        int result = calculator.result;
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("값을 곱하는 테스트")
    void multiply() {
        calculator.multiply(2);
        int result = calculator.result;
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("값을 나누는 테스트")
    void divide() {
        calculator.divide(2);
        int result = calculator.result;
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("사칙 연산 테스트")
    void calculate(){
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");
        StringCalculator calculator = new StringCalculator(Integer.parseInt(values[0]));
        int result = calculator.calculate(values);

        assertThat(result).isEqualTo(10);
    }
}
