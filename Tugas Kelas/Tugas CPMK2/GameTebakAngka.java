package TugasTugasPemdasrSmester1;
import java.util.Scanner;
import java.util.Random;

public class GameTebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int angkaTebakan = random.nextInt(100) + 1;
        int maxTebakan = 7;
        int percobaan = 1;
        boolean menang = false;

        System.out.println("======= GAME TEBAK TEBAKAN. SING TENANG ADEKKK =======");
        System.out.println("Kamu memiliki " + maxTebakan + " kesempatanmu menebak angka dari 1 dan 100. Semoga Beruntung");

        while (percobaan <= maxTebakan) {
            System.out.print("Masukkan angka tebakanmu (Ini Percobaan " + percobaan + "): ");
            int tebakan = input.nextInt();

            if (tebakan < 1 || tebakan > 100) {
                System.out.println("Dikandani angka harus antara 1 dan 100. Coba lagi.");
                continue;
            }

            if (tebakan == angkaTebakan) {
                menang = true;
                break;
            } else if (tebakan < angkaTebakan) {
                System.out.println("Angka tebakanmu terlalu rendah.");
            } else {
                System.out.println("angka tebakanmu terlalu tinggi.");
            }

            percobaan++;
        }

        if (menang) {
            System.out.println("JosJis! Kamu berhasil menebak angka yang benar. Calon Peramal iki");
        } else {
            System.out.println("Maaf, kamu kehabisan kesempatan. Angka yang benar adalah: " + angkaTebakan);
        }

        input.close();
    }
}