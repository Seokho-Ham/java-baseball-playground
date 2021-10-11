package study.baseballgame;

import static org.assertj.core.api.Assertions.assertThat;
import com.baseballgame.RandomNumbers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumbersTest {
    static RandomNumbers instance;
    @BeforeAll
    static void setUp(){
        instance = new RandomNumbers();
    }

    @Test
    @DisplayName("중복된 값 여부 테스트")
    void validateOverlap() {
        String number = "12";
        assertThat(instance.validateOverlap(number,"3")).isTrue();
        assertThat(instance.validateOverlap(number, "1")).isFalse();
    }

    @Test
    @DisplayName("1~9의 범위 테스트")
    void validateRange() {
        String number1 = "1";
        String number2 = "10";
        assertThat(instance.validateRange(number1)).isTrue();
        assertThat(instance.validateRange(number2)).isFalse();
    }

    @Test
    @DisplayName("길이 테스트")
    void validateLength(){
        String number1 = "123";
        String number2 = "1234";
        assertThat(instance.validateLength(number1)).isTrue();
        assertThat(instance.validateLength(number2)).isFalse();
    }
}
