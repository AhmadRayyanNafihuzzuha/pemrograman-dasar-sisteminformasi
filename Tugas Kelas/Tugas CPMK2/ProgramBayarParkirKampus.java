package TugasTugasPemdasrSmester1;
import java.util.Scanner;

public class ProgramBayarParkirKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=======PEMBAYARAN PARKIR KAMPUS=======");
        System.out.println("");
        System.out.println("JENIS KENDARAAN ANDA :");
        System.out.println("1.SEPEDA MOTOR");
        System.out.println("2.MOBIL");
        
        int jenis = 0;
        int tarifAwal = 0;
        int tarifTambahan = 0;
        String kendaraan = "";

        while (true) {
            System.out.print("KETIK ANGKA SESUAI KODE KENDARAAN DIATAS: ");
            jenis = input.nextInt();
            
            if (jenis == 1) {
                kendaraan = "MOTOR";
                tarifAwal = 2000;
                tarifTambahan = 1000;
                break; 
            } else if (jenis == 2) {
                kendaraan = "MOBIL";
                tarifAwal = 5000;
                tarifTambahan = 2000;
                break; 
            } else {
                System.out.println("HARAP MASUKAN DATA DENGAN BENAR!!!");
                System.out.println("");
            }
        }
        
        System.out.print("LAMA ANDA PARKIR (JAM): ");
        int lamaParkir = input.nextInt(); 
        
        int total = tarifAwal;
        if (lamaParkir > 1) {
            total = tarifAwal + ((lamaParkir - 1) * tarifTambahan);
        }
        
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("JENIS KENDARAAN ANDA : " + kendaraan);
        System.out.println("LAMA PARKIR ANDA     : " + lamaParkir + " Jam");
        System.out.println("JUMLAH BIAYA PARKIR  : Rp" + total);
        
        input.close();
    }
}