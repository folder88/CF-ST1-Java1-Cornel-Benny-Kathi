package Kathi;

public class VersionTwo {

    public static void main(String[]main){
        double[] one = {12, 95, 3, 10, 45.7};
        double total = 0;

        for(int i=0; i < one.length; i++){
            total = total + one[i];
        }

        double average = total / one.length;

        System.out.println("The average value of " + one[0] + ", " + one[1] + ", " + one[2] + ", " + one[3] + ", " + one[4] +" is: " + average);
    }
}
