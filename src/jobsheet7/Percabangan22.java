
package jobsheet7;

public class Percabangan22 {
    public static void main (String[] args){
                int bahan2 = 2;
        
          if(bahan2 >= 1&& bahan2 <= 3)
          { 
            int bahan1 = 3;
              
              if (bahan1 == 1)
                  switch (bahan2)
                  {
                    case 1:System.out.println("Anda dapat membuat milk shakee banana "); break;
                    case 2:System.out.println("Anda dapat membuat pisang goreng"); break;
                    case 3:System.out.println("Anda dapat membuat pisang rebus"); 
                  }
              else
                  switch (bahan2)
                  {
                    case 1:System.out.println("Anda dapat membuat telur mata sapi"); break;
                    case 2:System.out.println("Anda dapat membuat sandwich telur"); break;
                    case 3:System.out.println("Anda dapat membuat telur rebus");  
          
                  }
   
              
          }else
              System.out.println ("Mohon Maaf,pilihan tidak ditemukan, " + "tidak dapat memberikan saran resep");
        
            
        }
    
}

    
