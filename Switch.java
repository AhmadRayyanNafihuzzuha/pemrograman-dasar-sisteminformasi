
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        
        System.out.println("Masukan angka sari 1-7 untuk mengetahui ini hari apa:");
        Scanner input =new Scanner(System.in);
        int angka = input.nextInt();
        
        switch (angka) {
            case 1:
                System.out.println("Hari ini adalah hari Senin");
                break;
            case 2:
                System.out.println("Hari ini adalah hari Selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah hari Rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah hari Kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah hari Jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah hari Sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah hari Minggu");
                break;
            default:
                System.out.println("Tidak Ada dalam Jangkauan angak 1-7");
        }
        
    }
    
    
}
