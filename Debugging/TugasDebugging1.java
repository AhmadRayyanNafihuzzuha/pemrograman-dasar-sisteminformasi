package Debugging;
import java.util.Scanner;
import java.util.InputMismatchException;
public class TugasDebugging1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Masukan nilai 1: ");
            int nilai1 = input.nextInt();
            
            System.out.print("Masukan nilai 2: ");
            int nilai2 = input.nextInt();
            
            System.out.print("Masukan nilai 3: ");
            int nilai3 = input.nextInt();
            
            if (nilai1 < 0 || nilai1 > 100 ||
                nilai2 < 0 || nilai2 > 100 ||
                nilai3 < 0 || nilai3 > 100) {
                
                System.out.println("Error: Nilai harus antara 0 sampai 100");
                
            }
            else {
                double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;
                
                System.out.println("Rata-rata: " + rataRata);
                
                if (rataRata >= 75) {
                    System.out.println("Status: Lulus");
                }
                else {
                    System.out.println("Status: Tidak Lulus");
                }
            }
           }
            catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa bilangan bulat");
        } 
        finally {
                    input.close();
                    System.out.println("Program Selesai");
                    }
    }
}
