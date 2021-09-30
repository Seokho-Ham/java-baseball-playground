package study.baseballgame;

import static org.assertj.core.api.Assertions.assertThat;
import com.baseballgame.GameController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class GameControllerTest {
    static GameController instance;

    @BeforeAll
    static void beforeAll() {
        instance = new GameController();
    }

    @Test
    @DisplayName("strike 판별 테스트")
    void isStrike(){
        int strike1 = instance.isStrike('2','1');
        assertThat(strike1).isEqualTo(0);

        int strike2 = instance.isStrike('1','1');
        assertThat(strike2).isEqualTo(1);
    }
    @Test
    @DisplayName("ball 판별 테스트")
    void isBall(){
        int ball1 = instance.isBall("123", "645",0);
        assertThat(ball1).isEqualTo(0);

        int ball2 = instance.isBall("123","245", 0);
        assertThat(ball2).isEqualTo(1);
    }

    @Test
    @DisplayName("strike, ball, nothing 판별 테스트")
    void validateBall(){
        HashMap<String,Integer> result = instance.validateBall("123", "234");
        int strike = result.get("strike");
        int ball = result.get("ball");

        assertThat(strike).isEqualTo(0);
        assertThat(ball).isEqualTo(2);
    }

    @Test
    @DisplayName("게임 재실행, 종료 여부 테스트")
    void decision(){

    }


}
