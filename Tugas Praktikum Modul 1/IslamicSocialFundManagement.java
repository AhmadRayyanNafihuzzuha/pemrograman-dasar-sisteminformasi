package PraktikumModul1;
import java.util.Scanner;
 
public class IslamicSocialFundManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Nama pengelola : ");
        String namaPengelola = input.nextLine();
        System.out.print("Dana awal : Rp");
        double danaAwal = input.nextDouble();
        System.out.print("Jumlah infaq : Rp");
        double infaq = input.nextDouble();
        System.out.print("Jumlah penerima : ");
        int jumlahPenerima = input.nextInt();
 
        if (jumlahPenerima == 0) {
            System.out.println("\nError: Jumlah penerima tidak boleh 0.");
            input.close();
            return;
        }
 
        double sisaDana = danaAwal - infaq;
        double danaPerPenerima = sisaDana / jumlahPenerima;
 
        System.out.println("\n=== HASIL PENGELOLAAN DANA SOSIAL ===");
        System.out.println("Pengelola      : " + namaPengelola);
        System.out.println("Sisa dana      : Rp" + sisaDana);
        System.out.println("Dana/penerima  : Rp" + danaPerPenerima);
 
        if (sisaDana >= 500000) {
            System.out.println("Status dana    : Dana masih mencukupi");
        } else {
            System.out.println("Status dana    : Dana perlu dikelola kembali");
        }
 
        if (jumlahPenerima > 20) {
            System.out.println("Skala program  : Program skala besar");
        }
 
        if (danaPerPenerima < 50000) {
            System.out.println("Evaluasi       : Perlu evaluasi distribusi");
        } else {
            System.out.println("Evaluasi       : Distribusi memenuhi target minimum");
        }
 
        input.close();
    }
}
