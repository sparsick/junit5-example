import java.util.function.Function;
import org.junit.jupiter.api.Test;

class JUnit5Test {


    @Test
    void testJava7Feature(){
        Java7Class java7 = new Java7Class();

        java7.aMethod();
        
        Function<String, String > java8Feature = (input) -> input;
    }
}
