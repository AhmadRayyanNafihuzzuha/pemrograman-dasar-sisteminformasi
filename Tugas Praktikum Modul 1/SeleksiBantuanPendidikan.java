package PraktikumModul1;
import java.util.Scanner;
 
public class SeleksiBantuanPendidikan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukan IPK anda : ");
        double ipkMahasiswa = input.nextDouble();
        System.out.print("Masukan penghasilan orang tua : Rp");
        double penghasilanOrangTua = input.nextDouble();
        System.out.print("Masukan jumlah tanggungan : ");
        int tanggunganKeluarga = input.nextInt();
        System.out.print("Apakah anda aktif dalam kegiatan sosial? (true/false): ");
        boolean aktifSosial = input.nextBoolean();
        System.out.print("Apakah anda menerima beasiswa lain? (true/false): ");
        boolean beasiswaLain = input.nextBoolean();
 
        String kategori;
        if (beasiswaLain) {
            kategori = "Belum memenuhi prioritas";
        } else if (ipkMahasiswa >= 3.50 && penghasilanOrangTua <= 3000000 && tanggunganKeluarga >= 3) {
            kategori = "Prioritas Utama";
        } else if (ipkMahasiswa >= 3.00 && penghasilanOrangTua <= 5000000) {
            kategori = "Prioritas Kedua";
        } else if (aktifSosial && ipkMahasiswa >= 3.00) {
            kategori = "Pertimbangan Khusus";
        } else {
            kategori = "Belum memenuhi prioritas";
        }
 
        System.out.println("\n=== HASIL SELEKSI ===");
        System.out.println("Kategori bantuan : " + kategori);
 
        input.close();
    }
}
