package Kathi;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args){

        Scanner fill = new Scanner(System.in);

        System.out.println("enter something :)");
        String something = fill.nextLine();
        System.out.println("you ride: " + something);
        System.out.println("and now, enter a number!");
        int aNumber = fill.nextInt();
        System.out.println("you choose the number: " + aNumber);
        System.out.println("now, i want a dezimal Number.hehe");
        float fNumber = fill.nextFloat();
        System.out.println("the dezimal number: " + fNumber);

    }
}
