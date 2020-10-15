package Kathi;

public class VersionTwo {

    public static void main(String[]main){
        double[] one = {12, 95, 3, 10, 45.7};
        double total = 0;

        for(int i=0; i < one.length; i++){
            total = total + one[i];
        }

        double average = total / one.length;

        double[] loopToPrint = {12, 95, 3, 10, 45.7};
        String resultPrint = "";
        for(int x = 0; x < loopToPrint.length; x++){
            resultPrint += Double.toString(loopToPrint[x]) + ", ";
        }

        System.out.println("The average value of " + resultPrint + " is: " + average);
    }
}
