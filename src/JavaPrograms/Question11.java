package JavaPrograms;

public class Question11 {
   /* Write a java program to print the numbers between 1 to 100 which can be divided by 3
    and 5 separately.*/

    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int three, five;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        System.out.println("\n Numbers divisible by 3 are ");
        for (three = 1; three < a.length; three++) {
            if (three % 3 == 0) {
                System.out.print(three + " ");
            }
        }

        System.out.println("\n Numbers divisible by 5 are ");
        for (five = 0; five < a.length; five++) {
            if (five % 5 == 0) {
                System.out.print(five + " ");
            }

        }
    }
}