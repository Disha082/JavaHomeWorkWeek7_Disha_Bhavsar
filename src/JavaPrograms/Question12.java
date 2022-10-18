package JavaPrograms;
//12.Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Question12 {
      char ch;

    public static void main(String[] args) {
        Question12 obj = new Question12();
        obj.NumAlpa();

    }
    public void NumAlpa(){
        Scanner sc6 =new Scanner(System.in);
        System.out.print("Enter any single number or any alphabet or any symbol:  " +" ");

        ch =sc6.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z'){
            System.out.println(ch + " is Apphabet");
        }
        else if (ch >= '0' && ch <='9'){
            System.out.println(ch + " is Digit");
        }else {
            System.out.println(ch + " is Symbol");
        }
    }


}
