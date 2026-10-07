import java.util.*;
public class GradeAkademik {
    public static void main(String []args) {
        
        System.out.println("Masukan nilai untuk mengetahui grade Mahasiswa :");
        Scanner input = new Scanner(System.in);
        int nilai = input.nextInt();
        
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak VALID!");
        }else if (nilai >= 91) {
            System.out.println("Grade anda tergolong 'A'");
        } else if (nilai >= 86) {
            System.out.println("Grade anda tergolong 'A-'");
        } else if (nilai >= 81) {
            System.out.println("Grade anda tergolong 'B+'");
        } else if (nilai >= 76) {
            System.out.println("Grade anda tergolong 'B'");
        } else if (nilai >= 71) {
            System.out.println("Grade anda tergolong 'B-'");
        } else if (nilai >= 66) {
            System.out.println("Grade anda tergolong 'C+'");
        } else if (nilai >= 61) {
            System.out.println("Grade anda tergolong 'C'");
        } else if (nilai >= 56) {
            System.out.println("Grade anda tergolong 'D'");
        } else if (nilai >= 0) {
            System.out.println("Grade anda tergolong 'E'");
        }
    }
}
