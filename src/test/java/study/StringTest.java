package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("replace Test")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split Test")
    void split() {
        String[] splitStr1 = "1,2".split(",");
        assertThat(splitStr1).containsExactly("1", "2");
        String[] splitStr2 = "1".split(",");
        assertThat(splitStr2).contains("1");
    }

    @Test
    @DisplayName("substring Test")
    void substring() {
        String str = "(1,2)".substring(1, 4);
        assertThat(str).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt Test")
    void charAt() {
        char alphabet = "abc".charAt(2);
        assertThat(alphabet).isEqualTo('c');
    }

    @Test
    @DisplayName("charAt Exception Test")
    void charAtException() {
        assertThatThrownBy(() -> {
            char alphabet = "abc".charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 3");
    }


}
