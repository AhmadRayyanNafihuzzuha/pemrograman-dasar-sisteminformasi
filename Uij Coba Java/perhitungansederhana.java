
import java.util.Scanner;

public class perhitungansederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("===== PROGRAM PERHITUNGAN SEDERHANA ===");
            System.out.println("Masukan Angka Pertama :");
            int angka1 = input.nextInt();
            
            System.out.println("Masukan Operasi Yang akan digunakan (+, -, *, /) :");
            char operasi = input.next().charAt(0);
            
            System.out.println("Masukan angka ke-dua :");
            int angka2 = input.nextInt();
            
            int hasil = 0;
            boolean valid = true;
            
            switch(operasi) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    }
                    else {
                        System.out.println("Jangan gunakan pembagian 0!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Operasi tidak valid, Ulangi lagi!");
                    valid = false;
                    break;
            }
            if (valid) {
                System.out.println("--------------------");
                System.out.println("Hasil dari perhitungan " + " " + angka1 + " " + operasi + " " + angka2 + " adalah " + hasil);
                System.out.println("====================");
            }
        }
    }
}