package PraktikumModul1;
//Nama  : AHMAD RAYYAN NAFIHUZZUHA
//NIM   : 09020626043
//KELAS : H6Z.1
import java.util.Scanner;

public class BeasiswaTahfidz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("=== PROGRAM PENENTUAN SYARAT BEASISWA MAHASISWA TAHFIDZ ===\n");
        System.out.print("Masukan IPK anda : ");
        double ipk = input.nextDouble();
        System.out.print("Masukan Hafalan anda (juz) : ");
        int hafalan = input.nextInt();

        if (ipk >= 3.25 && hafalan >= 5) {
            System.out.println("Memenuhi syarat beasiswa.");
            System.out.println("Selamat, anda berhak mendapatkan beasiswa.");
        } else {
            System.out.println("Belum memenuhi syarat beasiswa.");
            System.out.println("Maaf, anda belum berhak mendapatkan beasiswa.");
        }

        input.close();
    }
}
