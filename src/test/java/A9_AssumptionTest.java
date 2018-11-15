import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

class A9_AssumptionTest {

    @Test
    void standardAssume() {
        assumeFalse(false);
        assumeTrue(true);
    }


    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
                    // perform these assertions only on the CI server
                    assertEquals(2, 2);
                });

        // perform these assertions in all environments
        assertEquals("a string", "a string");
    }
}
