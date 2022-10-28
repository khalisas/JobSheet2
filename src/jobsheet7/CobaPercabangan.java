
package jobsheet7;

import java.util.Scanner;

public class CobaPercabangan {
    public static void main(String[] args){
        String identitas = "Khalisa Shiva/RPL7/16";
        System.out.println("identitas" +identitas);
        Scanner scanner = new Scanner (System.in);
        System.out.print(" Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("nIF . . 1");
        if (a < 5)System.out.println("nilai a kurang dari 5");
        
        System.out.println("nIF . . 2");
        if (a == 5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("nIF . . 3");
        if (a > 5) {
            System.out.println("isi variabel a :" + a );
            System.out.println("nilai a lebih dari 5 ");
        }
    }
}