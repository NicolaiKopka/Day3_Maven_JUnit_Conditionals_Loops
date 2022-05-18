import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SchleifenTest {

    @Test
    void shouldReturn1ifInput0() {
        int numberToTest = 0;
        int actualResult = Schleifen.faculty(numberToTest);
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void shouldReturn1ifInput1() {
        int numberToTest = 1;
        int actualResult = Schleifen.faculty(numberToTest);
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    void shouldReturn2ifInput2() {
        int numberToTest = 2;
        int actualResult = Schleifen.faculty(numberToTest);
        Assertions.assertEquals(2, actualResult);
    }

    @Test
    void shouldReturn720ifInput6() {
        int numberToTest = 6;
        int actualResult = Schleifen.faculty(numberToTest);
        Assertions.assertEquals(720, actualResult);
    }


}