package Cornel;

import java.util.Scanner;

public class Task_11 {
    public static void main (String [] arg){


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");


        String a = scan.nextLine();
        Integer b = Integer.parseInt(a);
        Integer c = Integer.parseInt(a+a);
        Integer e = Integer.parseInt(a+a+a);
        Integer result = b + c + e;
        System.out.println("Value of " + b + " + " + c +  " + " + e + " is "+ result);


    }
}
