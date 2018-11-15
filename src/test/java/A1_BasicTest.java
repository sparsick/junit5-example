import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


class A1_BasicTest {

    @BeforeAll
    static void setUpClass(){

    }

    @BeforeEach
    void setUp(){

    }

    @Test
    void test(){
        assertTrue(true);
    }

    @Test
    @Disabled
    void ignoredTest(){
        assertTrue(false);
    }

    @AfterEach
    void tearDown(){

    }

    @AfterAll
    static void tearDownClass(){

    }
}
