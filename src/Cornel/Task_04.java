package Cornel;

public class Task_04 {




    public static void main (String [] arg){

        double x = 125;
        double y = 24;


        double summ = x + y;
        double diff = x - y;
        double product = x * y;
        double div = x / y;
        double mod = x % y;


        double [] intArray = {summ,diff,product,div,mod};

        for(int i = 0;i <intArray.length;i++){
            System.out.println(intArray[i]);
        }





    }

}
