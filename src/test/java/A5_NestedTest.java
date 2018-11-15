import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class A5_NestedTest {

    List<Object> aList;

    @Test
    void init(){
        aList = new ArrayList<>();

        assertThat(aList).isNotNull();
    }

    @Nested
//    @DisplayName("Tests on new list")
    class NewList {
        @BeforeEach
        void setUp(){
            aList = new ArrayList<>();
        }

        @Test
        void isEmpty(){
            assertThat(aList).isEmpty();
        }

        @Test
        void addElement(){
            aList.add(new Object());

            assertThat(aList).hasSize(1);
        }
    }

    @Nested
    class ListWithElement {

        @BeforeEach
        void setUp(){
            aList = new ArrayList<>();
            aList.add(new Object());
        }

        @Test
        void isNotEmpty(){
            assertThat(aList).isNotEmpty();
        }

        @Test
        void addElement(){
            aList.add(new Object());

            assertThat(aList).hasSize(2);
        }

        @Test
        void removeElement(){
            aList.remove(0);

            assertThat(aList).isEmpty();
        }
    }
}
