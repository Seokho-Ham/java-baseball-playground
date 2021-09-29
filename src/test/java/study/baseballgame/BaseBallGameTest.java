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
    }
    @Test
    @DisplayName("스트라이크 검사")
    void checkStrike(){


    }
}
