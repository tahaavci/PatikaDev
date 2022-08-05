package java101.Grocery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        double sum = 0;


        System.out.println("Armut Kaç Kilo ? :");
        sum += sc.nextDouble()*2.14;
        
        System.out.println("Elma Kaç Kilo ? :");
        sum += sc.nextDouble()*3.67;

        System.out.println("Domates Kaç Kilo ? :");
        sum += sc.nextDouble()*1.11;
        
        System.out.println("Muz Kaç Kilo ? :");
        sum += sc.nextDouble()*0.95;
        
        System.out.println("Patlıcan Kaç Kilo ? :");
        sum += sc.nextDouble()*5;
        
        
        
        
        System.out.println("Toplam Tutar :"+sum);










    }
}
