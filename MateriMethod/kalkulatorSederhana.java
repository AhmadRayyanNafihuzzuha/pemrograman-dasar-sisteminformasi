package MateriMethod;
import java.util.*;
public class kalkulatorSederhana{
    //Bagian untuk template proses
    static double penjumlahan(double angka1, double angka2){
        return angka1 + angka2;
    }
    static double pengurangan(double angka1, double angka2){
        return angka1 - angka2;
    }
    static double perkalian(double angka1, double angka2){
        return angka1 * angka2;
    }
    static double pembagian(double angka1, double angka2){
        if (angka1 == 0 && angka2 == 0){
            System.out.println("Mohon memasukan nilai pembagian yang valid!");
            return Double.NaN;
    }
    return angka1 / angka2;
    }
    static double pemangkatan(double angka1, double angka2){
        return Math.pow(angka1, angka2);
    }
    static double sisa(double angka1, double angka2){
        return angka1 % angka2;
    }
    
    //Bagian perhitungan
    
    static double eksekusi(int pilihan, double angka1, double angka2){
        switch(pilihan){
            case 1:
                return penjumlahan(angka1, angka2);
            case 2:
                return pengurangan(angka1, angka2);
            case 3:
                return perkalian(angka1, angka2);
            case 4:
                return pembagian(angka1, angka2);
            case 5:
                return pemangkatan(angka1, angka2);
            case 6:
                return sisa(angka1, angka2);
            default:
                return Double.NaN;
        }
    }
    
    //Model penginputan
    static int membacaInt(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }

    static double membacaDouble(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextDouble();
    }
    
    //Tampilan Menu

    static void tampilkanMenuPilihan() {
        System.out.println("=== KALKULATOR MODULAR ===");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan(-)");
        System.out.println("3. Perkalian(*)");
        System.out.println("4. Pembagian(/)");
        System.out.println("5. Pangkat (^)");
        System.out.println("6. Sisa Bagi (%)");
        System.out.println("0. Keluar");
    }
    
    //Untuk tampilan hasil akhir
    
    static void tampilkanHasil(String operasi, double angka1, double angka2, double hasil) {
        System.out.println( angka1 + " " + operasi + " " + angka2 + " = " + hasil);
    }
    
    //Hasil akhir program
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int pilihan;
        
        do {
            tampilkanMenuPilihan();
        
            do {
                pilihan = membacaInt(input, "Pilih menu dari 0-6 : ");
                
                if (pilihan < 0 || pilihan > 6) {
                    System.out.println("Menu tidak ada! lakukan input ulang!");
                }
        }
            while (pilihan < 0 || pilihan > 6);
            
            if (pilihan >= 1&& pilihan <= 6){
                double angka1 = membacaDouble(input, "Angka pertama : ");
                double angka2 = membacaDouble(input, "Angka kedua : ");
                
                double hasil = eksekusi(pilihan, angka1, angka2);
                
                if (!Double.isNaN(hasil)){
                    String operasi;
                    
                    switch (pilihan){
                        case 1:
                            operasi = "+";
                            break;
                        case 2:
                            operasi = "-";
                            break;
                        case 3:
                            operasi = "*";
                            break;
                        case 4:
                            operasi = "/";
                            break;
                        case 5:
                            operasi = "^";
                            break;
                        case 6:
                            operasi = "%";
                            break;
                        default:
                            operasi = "?";
                    }
                tampilkanHasil(operasi, angka1, angka2, hasil);
                }
            }
            System.out.println();
        }
        while (pilihan !=0);
        
input.close();
    }
}