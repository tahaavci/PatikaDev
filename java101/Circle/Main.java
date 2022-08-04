package java101.Circle;

import java.util.Scanner;

import java101.CalcHypo.main;

public class Main {
    
    
    
    public static void main(String[] args) {
     

        Scanner sc = new Scanner(System.in);

        System.out.print("Yarıçap :");
        int r = sc.nextInt();

        System.out.print("Açı :");
        int a = sc.nextInt();


        double sum = Math.PI * Math.pow(r, 2)*a/360;

        System.out.println("Alan : "+sum);

    }
    



}