package Debugging;
import java.util.Scanner;

public class TugasAnalisisMahasiswa {
    public static int inputNilai(Scanner scanner, String pesan) {
        System.out.print(pesan);
        return scanner.nextInt();
    }
    
    public static double hitungRataRata(int nilai1, int nilai2, int nilai3) {
        return (nilai1 + nilai2 + nilai3) / 3.0;
    }
    
    public static String tentukanGrade(double rataRata) {
        if (rataRata >= 90) {
            return "A";
        } else if (rataRata >= 80) {
            return "B";
        } else if (rataRata >= 70) {
            return "C";
        } else if (rataRata >= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void tampilkanHasil(String nama, String kelas, String prodi, double rataRata, String grade) {
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Program studi: " + prodi);
        System.out.println("Kelas: " + kelas);
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan program studi: ");
        String prodi = scanner.nextLine();
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();

        int nilai1 = inputNilai(scanner, "Masukkan nilai pertama: ");
        int nilai2 = inputNilai(scanner, "Masukkan nilai kedua: ");
        int nilai3 = inputNilai(scanner, "Masukkan nilai ketiga: ");
        
        double rataRata = hitungRataRata(nilai1, nilai2, nilai3);
        String grade = tentukanGrade(rataRata);
        
        tampilkanHasil(nama, kelas, prodi, rataRata, grade);
        
        scanner.close();
    }
}
