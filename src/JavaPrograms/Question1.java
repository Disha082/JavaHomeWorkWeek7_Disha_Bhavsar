package JavaPrograms;
/*1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc4 = new Scanner(System.in);

        System.out.print("Enter Number:   ");
        int number = sc4.nextInt();

        String evenODD = (number%2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + evenODD);
    }
}
