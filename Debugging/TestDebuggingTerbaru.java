package Debugging;
import java.util.Scanner;

public class TestDebuggingTerbaru {
    static int formatNilai(Scanner input, int nomorNilai) {
        while (true) {
            System.out.print("Masukan nilai " + nomorNilai + " (0-100): ");

            if (!input.hasNextInt()) {
                input.next();
                System.out.println("Error: Input harus berupa bilangan bulat. Silakan coba lagi.");
                continue;
            }

            int nilai = input.nextInt();
            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0 sampai 100. Silakan coba lagi.");
                continue;
            }

            return nilai;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            int nilai1 = formatNilai(input, 1);
            int nilai2 = formatNilai(input, 2);
            int nilai3 = formatNilai(input, 3);

            double rataRata = (nilai1 + nilai2 + nilai3) / 3.0;

            System.out.println("Rata-rata: " + rataRata);

            if (rataRata >= 75) {
                System.out.println("Status: Lulus");
            } else {
                System.out.println("Status: Tidak Lulus");
            }
        } finally {
            input.close();
            System.out.println("Program Selesai");
        }
    }
}
