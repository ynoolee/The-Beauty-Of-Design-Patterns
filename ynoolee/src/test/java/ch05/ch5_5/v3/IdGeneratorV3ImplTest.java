package ch05.ch5_5.v3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class IdGeneratorV3ImplTest {

    @Nested
    public class DescribeGetLastSubStrSplittedByDot {
        @Test
        @DisplayName("Dot 을 2개 포함한 경우, 두 번째 Dot 이후의 문자열을 리턴한다")
        public void GivenTwoDotsContext() {
            final IdGeneratorV3Impl generator = new IdGeneratorV3Impl();
            final String actualSubStr = generator.getLastSubStrSplitByDot("field1.field2.field3");

            assertThat(actualSubStr).isEqualTo("field3");
        }

        @Test
        @DisplayName("Dot 이 없는 경우, 주어진 문자열을 리턴한다")
        public void GivenNoDotsContext() {
            final IdGeneratorV3Impl generator = new IdGeneratorV3Impl();
            final String actualSubStr = generator.getLastSubStrSplitByDot("field1");

            assertThat(actualSubStr).isEqualTo("field1");
        }

        @Test
        @DisplayName("Dot 이 없는 경우, 주어진 문자열을 리턴한다")
        public void GivenNotDotsButOtherSymbolsContext() {
            final IdGeneratorV3Impl generator = new IdGeneratorV3Impl();
            final String actualSubStr = generator.getLastSubStrSplitByDot("field1$field2#field3");

            assertThat(actualSubStr).isEqualTo("field1$field2#field3");
        }
    }


    @ParameterizedTest
    @DisplayName("주어진 길이의 랜덤문자열을 생성한다")
    @ValueSource(ints = {3, 4, 5})
    public void generateRandomAlphanumeric(int length) {
        final IdGeneratorV3Impl generator = new IdGeneratorV3Impl();
        final String actualRandomString = generator.generateRandomAlphanumeric(length);

        Assertions.assertThat(actualRandomString).isNotNull();
        Assertions.assertThat(actualRandomString.length()).isEqualTo(length);
    }

    @Test
    @DisplayName("알파벳 대소문자 및 숫자 캐릭터로 이루어진 랜덤문자열을 생성한다")
    public void generateRandomAlphaNumeric() {
        final IdGeneratorV3Impl generator = new IdGeneratorV3Impl();
        final String actualRandomString = generator.generateRandomAlphanumeric(6);

        for (char c : actualRandomString.toCharArray()) {
            Assertions.assertThat(Character.isDigit(c) || Character.isLetter(c)).isTrue();
        }
    }
}
