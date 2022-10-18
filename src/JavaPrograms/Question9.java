package JavaPrograms;
//9. Same as above program-8 using switch statement.

import java.util.Scanner;

public class Question9 { static char city;

    public static void main(String[] args) {
        CityName();

    }

    public static void cityselection() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Initial of city A to F || a to f to get city name:  ");
        city = sc1.next().charAt(0);

    }
    public static void CityName(){
        cityselection();
        switch (city){
            case 'A':
                System.out.println("Ashford");
                break;
            case 'a':
                System.out.println("Ashford");
                break;
            case 'B':
                System.out.println("Bolton");
                break;
            case 'b':
                System.out.println("Bolton");
                break;
            case 'C':
                System.out.println("Cornwal");
                break;
            case 'c':
                System.out.println("Cornwal");
                break;
            case 'D':
                System.out.println("Dundee");
                break;
            case 'd':
                System.out.println("Dundee");
                break;
            case 'E':
                System.out.println("Exeter");
                break;
            case 'e':
                System.out.println("Exeter");
                break;
            case 'F':
                System.out.println("Faltham");
                break;
            case 'f':
                System.out.println("Faltham");
                break;
            default:
                System.out.println("Enter valid Initial of city");








        }
    }
}
