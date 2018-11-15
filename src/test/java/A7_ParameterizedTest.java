import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class A7_ParameterizedTest {

    // Source of Arguments

    @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c"})
    void singleLetter(String candidate) {
        assertTrue(isSingleLetter(candidate));
    }

    private boolean isSingleLetter(String candidate) {
        return candidate.length() == 1;
    }

    // type for value sources:
    //    short
    //    byte
    //    int
    //    long
    //    float
    //    double
    //    char
    //    java.lang.String
    //    java.lang.Class


    @ParameterizedTest
    @EnumSource(TimeUnit.class)
    void timeUnit(TimeUnit timeUnit) {
        assertThat(timeUnit).isNotNull();
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithSimpleMethodSource(String argument) {
        assertNotNull(argument);
    }

    // return value must be Stream or Stream of primitive types
    static Stream<String> stringProvider() {
        return Stream.of("foo", "bar");
    }

    @ParameterizedTest
    @CsvSource({ "foo, 1", "bar, 2", "'baz, qux', 3" })
    void testWithCsvSource(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

    @ParameterizedTest
    @ArgumentsSource(MyArgumentsProvider.class)
    void testWithArgumentsSource(String argument) {
        assertNotNull(argument);
    }



    // @CsvFileSource


}
