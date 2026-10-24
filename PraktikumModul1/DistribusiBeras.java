package PraktikumModul1;
//Nama  : AHMAD RAYYAN NAFIHUZZUHA
//NIM   : 09020626043
//KELAS : H6Z.1
import java.util.Scanner;

public class DistribusiBeras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan total beras yang ada (Kg): ");
        int totalBeras = input.nextInt();
        System.out.print("Masukan beras yang diberikan perKeluarga (Kg) :");
        int berasPerKeluarga = input.nextInt();

        int jumlahKeluarga = totalBeras / berasPerKeluarga;
        int sisaBeras = totalBeras % berasPerKeluarga;

        System.out.println("\n=== HASIL DISTRIBUSI ===");
        System.out.println("umlah keluarga yang menerima : " + jumlahKeluarga + " keluarga");
        System.out.println("dan Sisa beras dari pembagian tadi adalah : " + sisaBeras + " kg");
        if (sisaBeras > 0) {
            System.out.println("Sisa beras disimpan untuk distribusi berikutnya.");
        } else {
            System.out.println("Tidak ada sisa beras.");
        }
        input.close();
    }
}

