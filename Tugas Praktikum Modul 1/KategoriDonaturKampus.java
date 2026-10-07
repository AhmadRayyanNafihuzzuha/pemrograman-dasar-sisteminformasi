package PraktikumModul1;
//Nama  : AHMAD RAYYAN NAFIHUZZUHA
//NIM   : 09020626043
//KELAS : H6Z.1
import java.util.Scanner;
 
public class KategoriDonaturKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("=== PROGRAM PENENTUAN KATEGORI DONATUR KAMPUS ===\n");
        System.out.print("Masukan besaran UKT anda : Rp");
        double besaranUkt = input.nextDouble();
 
        String kategori;
        if (besaranUkt >= 5000000) {
            kategori = "Selamat anda menjadi DONATUR UTAMA kampus ini karena UKT anda Mahal!";
        } else if (besaranUkt >= 1000000) {
            kategori = "Anda adalah salah satu Donatur tingkat menengah di kampus ini";
        } else if (besaranUkt >= 500000) {
            kategori = "Anda adalah Donatur Pendukung kampus ini";
        } else {
            kategori = "Anda belum menjadi Donatur besar dikampus ini, karena UKT anda masih kecil";
        }
 
        System.out.println("Kategori donatur : " + kategori);
        input.close();
    }
}
