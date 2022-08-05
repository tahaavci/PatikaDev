package java101.Taxi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Mesafe giriniz :");
            double km = sc.nextDouble();

            System.out.println("Ücret : "+taxi(km));

            sc.close();
    }



    static double taxi(double km){

        double cost = 10+km*2.2;

        if(cost<20)
        return 20;
        else 
        return cost;
    }

    
}
