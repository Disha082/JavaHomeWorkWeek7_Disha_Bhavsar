package JavaPrograms;

import java.util.Scanner;

public class Question10 {
    static  double c;


    public static void main(String[] args) {
        symbol();
    }

    public static void symbol() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any 2 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter any symbol from +,-,*,/ :");

        char sign = sc.next().charAt(0);
        if (sign == '+') {
            c = a + b;
            System.out.println(+a + "+" + b + "=" + c);
        } else if (sign == '-') {
            c = a - b;
            System.out.println(+a + "-" + b + "=" + c);
        } else if (sign == '*') {
            c = a * b;
            System.out.println(+a + "*" + b + "=" + c);
        } else {
            c = (a / b);
            System.out.println(+a + "/" + b + "=" + c);
        }
    }
}

