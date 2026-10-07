
import java.util.*;
public class pilihpilihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka dari 1-4 untuk mengetahui Andi sedang belajar matematika apa : ");
        int angka = scanner.nextInt();

        if (angka == 1) {
            System.out.println("Andi sedang belajar Matematika operasi penjumlahan");
        } else if (angka == 2) {
            System.out.println("Andi sedang belajar Matematika operasi pengurangan");
        } else if (angka == 3) {
            System.out.println("Andi sedang belajar Matematika operasi pembagian");
        } else {
            System.out.println("Andi sedang belajar Matematika operasi perkalian");
        }
        scanner.close();
    }
}
