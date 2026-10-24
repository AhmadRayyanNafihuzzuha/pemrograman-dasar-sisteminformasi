import java.util.Scanner;
public class ChallengeDynamicPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        for (int i=1;i<=tinggi;i++){
            for (int j=tinggi;j>i;j--) System.out.print(" ");
            for (int j=1;j<=2*i-1;j++) System.out.print("*");
            System.out.println();
        }
        input.close();
    }
}
