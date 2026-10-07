import java.util.Scanner;
public class TugasFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        long faktorial = 1;
        for (int i = 1; i <= n; i++) faktorial *= i;
        System.out.println(n + "! = " + faktorial);
        input.close();
    }
}
