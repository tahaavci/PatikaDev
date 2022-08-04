package java101.CalcHypo;

import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Kenar 1: ");
        int a = sc.nextInt();

     
        System.out.print("Kenar 2: ");
        int b = sc.nextInt();
   
        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
        System.out.println("Uzun Kenar :"+c);
    }

}
