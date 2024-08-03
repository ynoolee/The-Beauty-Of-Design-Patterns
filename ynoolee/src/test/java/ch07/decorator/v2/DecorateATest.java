package ch07.decorator.v2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class DecorateATest {

    @Nested
    @DisplayName("PowerA 타입 객체를 합성해서 만든 SuperPowerA 타입 객체의 eat 메서드는 ")
    public class SuperPowerAComposedOfPowerA {

        private A superPowerA = new SuperPowerA(new PowerA(new BaseA()));

        @Test
        @DisplayName("PowerA eat 을 리턴한다")
        public void test() {
            String result = superPowerA.eat();

            Assertions.assertThat(result)
                    .isEqualTo("PowerA eat");
        }
    }

}
