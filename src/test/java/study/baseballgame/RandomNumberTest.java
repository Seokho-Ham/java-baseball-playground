package study.baseballgame;

import com.baseballgame.RandomNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class RandomNumberTest {
    @Test
    @DisplayName("중복이 있으면 true, 중복이 없으면 false를 반환하는가?")
    void checkOverlap(){
        String str = "12";
        boolean t = RandomNumber.checkOverlap(str,"1");
        boolean f = RandomNumber.checkOverlap(str,"3");
        assertThat(t).isEqualTo(true);
        assertThat(f).isEqualTo(false);
    }

    @Test
    @DisplayName("중복이 안되는 숫자를 반환하는가?")
    void makeOneRandomNumber(){
        String str = "12";
        String number = RandomNumber.makeOneRandomNumber(str);
        assertThat(!str.contains(number)).isTrue();
    }

    @Test
    @DisplayName("길이가 3인 랜덤 숫자를 반환하는가?")
    void makeRandomNumbers(){
        String random = RandomNumber.makeRandomNumbers();
        assertThat(random.length()).isEqualTo(3);
    }

}
