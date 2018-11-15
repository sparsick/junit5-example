import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A better description of my test cases")
class A2_DisplayNameTest {

    @Test
    @DisplayName("A useful description of your Test")
    void test(){
        assertTrue(true);
    }

}
