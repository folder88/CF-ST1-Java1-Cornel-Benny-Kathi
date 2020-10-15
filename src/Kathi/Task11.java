package Kathi;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args){


        Scanner one = new Scanner(System.in);
        System.out.println("input a number to computes the value of n+nn+nnn");
        int someNumber = one.nextInt();

        int two = someNumber;
        int three = someNumber * 11;
        int four = someNumber * 111;

        int result = two + three + four;

        System.out.println("Value of " + someNumber + " + " + someNumber +""+ someNumber + " + " + someNumber +""+ someNumber +"" + someNumber + " is: " + result);
    }
}
