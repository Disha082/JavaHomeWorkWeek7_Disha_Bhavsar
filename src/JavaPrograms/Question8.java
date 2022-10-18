package JavaPrograms;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Question8 {
   /* 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
    any other alphabet should be invalid entry*/

    static char city;
    public static void main(String[] args) {
        CityName();

    }

    public static void cityselection() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Initial of city A to F || a to f to get city name:  ");
        city = sc1.next().charAt(0);

    }

    public static void CityName() {
        cityselection();
        if (city == 'A' || city == 'a') {
            System.out.println("Ashford");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bolton");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cornwal");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Dundee");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Exeter");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Faltham");
        }
    }

}






