import java.util.Scanner;
import java.lang.*;

public class Temperature_Converter{
    public static void main(String[] as){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature");
        double temp = sc.nextDouble();
        System.out.println("Enter units of Temperature(C/F):");
        String unit = sc.next();

        double ConvertedTemp = 0;


        if(unit.equalsIgnoreCase("c")){
            ConvertedTemp = (temp * 9/5) + 32;
        }
        else if (unit.equalsIgnoreCase("F")) {
            ConvertedTemp = (temp - 32) * 5/9;
        }
        else{
            System.out.println("Invalid.Try again");
        }

        System.out.println(ConvertedTemp);
    }
}