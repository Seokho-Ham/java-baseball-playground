package study.baseballgame;

import static org.assertj.core.api.Assertions.assertThat;
import com.baseballgame.Baseball;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

    @Test
    @DisplayName("입력받은 값으로 baseball 객체를 생성하는 테스트")
    void baseball() {
        Baseball ball = new Baseball("123");
        assertThat(ball.getBall()).isEqualTo("123");
    }
}
