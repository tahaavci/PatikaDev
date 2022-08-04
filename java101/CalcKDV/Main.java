package java101.CalcKDV;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Fiyat : ");
            double value = sc.nextDouble();
        

            if(value<1000){
                System.out.println("KDV Tutarı   %18: "+calcKdv18(value));
                System.out.println("KDV Dahil Tutar : "+(value+calcKdv18(value)));
            }else{
                System.out.println("KDV Tutarı    %8: "+calcKdv8(value));
                System.out.println("KDV Dahil Tutar : "+(value+calcKdv8(value)));
            }
        
        
            sc.close();


    }

    
    static double calcKdv18(double value){
        
    return value*0.18;
    }

    static double calcKdv8(double value){

        return value*0.08;
    }
    
}