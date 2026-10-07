package TugasTugasPemdasrSmester1;
public class MenghitungUangJajanAndi {
    public static void main(String[] args) {
        String mahasiswa = "Andi";
        int ayam = 15000;
        int air = 5000;
        int bayar = 50000;
        
        int ayamTotal = ayam *2;
        int airTotal = air *2;
        int totalBelanja = ayamTotal + airTotal;
        int uangKembali = bayar - totalBelanja;
        
        System.out.println("Total 2 porsi ayam " + mahasiswa + " adalah: Rp" + ayamTotal);
        System.out.println("dan Total 2 air mineral Andi adalah: Rp" + airTotal);
        System.out.println("Jika " + mahasiswa + " membayar dengan uang Rp" + bayar + ", dan total yang dibayarkan adalah Rp" + totalBelanja);
        System.out.println("Maka kembalian dari uang " + mahasiswa  + " adalah Rp" + uangKembali);
    }
    
}
