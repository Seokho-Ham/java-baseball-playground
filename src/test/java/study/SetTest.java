package study;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private static Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

    }


    @Test
    void size(){
        int length = numbers.size();
        assertThat(length).isEqualTo(3);
    }


    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(int number){
        assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value={"1:true","2:true","3:true","4:false","5:false"}, delimiter = ':')
    void checkContainMethodReturnValue (String data,String expected){
        System.out.println(Integer.parseInt(data));
        assertThat(numbers.contains(Integer.parseInt(data))).isEqualTo(Boolean.valueOf(expected));
    }
}
