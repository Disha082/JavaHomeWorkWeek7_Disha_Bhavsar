package JavaPrograms;
/*Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc2= new Scanner(System.in);
        System.out.print("Enter any year");
        int xyz = sc2.nextInt();

        if(xyz%100==0 && xyz%400==0 || xyz%100!=0 && xyz%4==0)
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not leap Year");
        }

    }
}
