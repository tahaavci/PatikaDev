import java.util.*;

public class Main{



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Lecture> lectures = new ArrayList<Lecture>();
        


        System.out.print("Ders sayısı giriniz : ");
        int numofLecture = sc.nextInt();
            
        System.out.println("-------------");

        for(int i=numofLecture; i>0; i--){

            System.out.print("Ders    : ");
            String lec = sc.next();

            System.out.print("Notunuz : ");
            int score = sc.nextInt();

            System.out.println("-------------");

            lectures.add(new Lecture(lec, score));

        }
        sc.close();

        // ortalama hesaplama
        int avarage = lectures.stream().mapToInt(x-> x.score).sum()/numofLecture;
    
        System.out.println("Ortalamanız :"+avarage);
        System.out.println(avarage >= 60 ? "Geçtiniz" :"Kaldınız");
    }



}
class Lecture{

    String name ;
    int score;

    public Lecture(String name,int score){

        this.name = name ;
        this.score = score;
    }


}