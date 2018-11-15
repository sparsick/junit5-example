import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class A6_RepeatedTest {

    @RepeatedTest(2)
    void test(){
        assertTrue(true);
    }

    @RepeatedTest(value = 3, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    void testLongVersion(){
        assertTrue(true);
    }
}
