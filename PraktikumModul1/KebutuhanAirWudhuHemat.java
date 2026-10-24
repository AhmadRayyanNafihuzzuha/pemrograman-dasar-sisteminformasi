package PraktikumModul1;
//Nama  : AHMAD RAYYAN NAFIHUZZUHA
//NIM   : 09020626043
//KELAS : H6Z.1
import java.util.Scanner;

public class KebutuhanAirWudhuHemat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan jumlah mahasiswa yang menggunakan air wudhu : ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Masukan frekuensi wudhu per mahasiswa : ");
        int frekuensiWudhu = input.nextInt();

        System.out.print("Masukan jumlah air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();

        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        double totalAirHemat = totalAir * 0.85;

        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air = " + totalAir + " liter");
        System.out.println("Total kebutuhan air yang telah dihemat 15% = " + totalAirHemat + " liter");

        input.close();
    }
}
