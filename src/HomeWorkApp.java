import java.sql.SQLOutput;

        public class HomeWorkApp {
        public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 5;
        b = 7;
        // 0 < x < 100
//       if (0 < a && a < 100) {
//
//      }

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value = -1;
        if (value < 0) {
            System.out.println("Красный");


            if (value > 0) {
                System.out.println("Желтый");
                if (value <= 100) ;
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers() {
        int a;
        int b;
        a = 3;
        b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        }else
                System.out.println("a < b");
            }
            }










