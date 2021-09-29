package study.baseballgame;

import static org.assertj.core.api.Assertions.assertThat;

import com.baseballgame.BaseballGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseBallGameTest {
    BaseballGame instance;
    @BeforeEach
    void setUp(){
        instance = new BaseballGame();
        instance.randomNumber = "123";
    }
    @Test
    @DisplayName("Strike 검사 : 값이 맞으면 1, 틀리면 0을 반환하는가?")
    void checkStrike(){

        int result1 = instance.checkStrike(0,'1');
        assertThat(result1).isEqualTo(1);

        int result2 = instance.checkStrike(0,'2');
        assertThat(result2).isEqualTo(0);


    }
    @Test
    @DisplayName("Ball 검사 : 값을 가지고 있으면 1, 틀리면 0을 반환하는가?")
    void checkBall(){

        int result1 = instance.checkBall(2,'1');
        assertThat(result1).isEqualTo(1);

        int result2 = instance.checkBall(0,'4');
        assertThat(result2).isEqualTo(0);


    }

    @Test
    @DisplayName("프린팅 테스트 : 올바른 값을 프린팅 하는가?")
    void printResult(){
        boolean result1 = instance.printResult(2,2);
        assertThat(result1).isFalse();
        boolean result2 = instance.printResult(3,0);
        assertThat(result2).isTrue();
    }
}

