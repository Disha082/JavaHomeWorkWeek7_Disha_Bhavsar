package JavaPrograms;
/*6.Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Question6 {
    public static void main (String []args){
        Scanner sc1=new Scanner(System.in);
        System.out.print("please Enter your Number");
        int num= sc1.nextInt();
        if (num % 2 ==0) {
            System.out.println("Number is even :" +num);
        }
        else
        {
            System.out.println("Number is odd :" +num);
        }



    }
}
