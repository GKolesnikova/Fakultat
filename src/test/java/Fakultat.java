import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fakultat {

    public static void main(String[] args) {

    }


    static void FakultatTestFor0 {
        // GIVEN
        int number = 0;

        // WHEN
        int actual = Fakultat.calculateFactorial(number);

        // THEN
        assertEquals(1, actual);
    }

    @Test
    static void FakultatTestFor1 {
        // GIVEN
        int number = 1;

        // WHEN
        int actual = Fakultat.calculateFactorial(number);

        // THEN
        assertEquals(1, actual);
    }


    static void FakultatTestFor2 {
        // GIVEN
        int number = 2;

        // WHEN
        int actual = Fakultat.calculateFactorial(number);

        // THEN
        assertEquals(2, actual);
    }

    static void FakultatTestFor3 {
        // GIVEN
        int number = 3;

        // WHEN
        int actual = Fakultat.calculateFactorial(number);

        // THEN
        assertEquals(6, actual);
    }

}
