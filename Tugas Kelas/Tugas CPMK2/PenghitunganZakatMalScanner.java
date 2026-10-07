package TugasTugasPemdasrSmester1;
import java.util.Scanner;
public class PenghitunganZakatMalScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=======PROGAM PENGHITUNGAN ZAKAT MAL========");
        System.out.println("");
        
        System.out.println("MASUKAN JUMLAH HARTA ANDA :");
        double jumlahHarta = input.nextDouble();
        
        int nisab = 2000000*85;
        System.out.println("NISAB SEKARANG ADALAH : Rp" + nisab);
        System.out.println("");
        
        if (jumlahHarta >= nisab) {
            double zakat = jumlahHarta * 0.0025;
            System.out.println("Anda Wajib Zakat Sebesar : Rp" + zakat);
        }
        else {
            System.out.println("Anda Belum Wajib Zakat");
        }
        System.out.println("");
        System.out.println("============================================");
        
        input.close();
    }
}
