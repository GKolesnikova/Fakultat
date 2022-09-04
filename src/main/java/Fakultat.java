public class Fakultat {

    public static void main(String[] args) {
        System.out.println(calculateFactorial(4));

        Integer result = Fakultat.calcRecursion(3);
        System.out.println(result);
    }

    public static int calculateFactorial(int number) {
        if (number >= 1) {
            int firstNumber = 1;
            for (int i = 1; i <= number; i++) {
                int result = firstNumber * i;
            }
            return System.out.println(" Die Fakultat von " + number + " ist: " + result);
        } else {
            System.out.println("Write a natural number from 1");
        }
    }

        public static int calcRecursion(Integer value) {
            if (value <= 1) {
                return 1;
            }
            return value * Fakultat.calcRecursion(value - 1);
        }
    }






}
