
package jobsheet7;
import java.util.Scanner;
public class Cobapercab5 {
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          int nilai;
          System.out.print("\nNilai Anda ? ");
          nilai = scanner.nextInt();
        
          String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
          System.out.println(nilai+ "=>"+ grade);
          
      }
}



          
    


