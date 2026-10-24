package PraktikumModul1;
//Nama  : AHMAD RAYYAN NAFIHUZZUHA
//NIM   : 09020626043
//KELAS : H6Z.1
import java.util.Scanner;
public class DonasiRamadan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Mahasiswa : ");
        String namaMahasiswa = input.nextLine();
        System.out.print("NIM Mahasiswa: ");
        String nimMahasiswa = input.nextLine();
        System.out.print("Jumlah donasi : Rp");
        int jumlahDonasi = input.nextInt();
        input.nextLine();
        System.out.print("Kode transaksi : ");
        String kode = input.nextLine();
        System.out.print("Donasi anonim? (true/false): ");
        boolean anonim = input.nextBoolean();

        System.out.println("\n=== DATA DONASI ===");
        System.out.println("Nama : " + namaMahasiswa);
        System.out.println("NIM : " + nimMahasiswa);
        System.out.println("Donasi : Rp" + jumlahDonasi);
        System.out.println("Kode : " + kode);
        System.out.println("Anonim : " + anonim);

        input.close();
    }
}

