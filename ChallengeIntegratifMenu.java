import java.util.Scanner;
public class ChallengeIntegratifMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    for(int i=1;i<=5;i++){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();}
                    break;
                case 2:
                    for(int i=5;i>=1;i--){for(int j=1;j<=i;j++)System.out.print("*");System.out.println();}
                    break;
                case 3:
                    for(int i=1;i<=5;i++){for(int j=1;j<=5;j++)System.out.print("*");System.out.println();}
                    break;
                case 4:
                    for(int i=1;i<=5;i++){for(int j=5;j>i;j--)System.out.print(" ");for(int j=1;j<=2*i-1;j++)System.out.print("*");System.out.println();}
                    break;
                case 5:
                    for(int i=1;i<=5;i++){for(int j=5;j>i;j--)System.out.print(" ");for(int j=1;j<=2*i-1;j++)System.out.print("*");System.out.println();}
                    for(int i=4;i>=1;i--){for(int j=5;j>i;j--)System.out.print(" ");for(int j=1;j<=2*i-1;j++)System.out.print("*");System.out.println();}
                    break;
                case 6: System.out.println("Program selesai."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 6);
        input.close();
    }
}
