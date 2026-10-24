import java.util.Scanner;

public class ForLoopPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 0;

        System.out.println("Masukan angka untuk mengkalikan dengan 0 sampai 10 : ");
        int b = input.nextInt();
        while (a <= 10) {
            int hasil = a * b;
            System.out.println(a + " x " + b + " = " + hasil);
            a++;
        }
    }
}