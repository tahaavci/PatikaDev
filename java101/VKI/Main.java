package java101.VKI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = sc.nextDouble();

        double index = kilo / Math.pow(boy, 2);
        System.out.println("Vücut Kitle İndeksiniz :"+index);
        
        
        sc.close();


    }

}
