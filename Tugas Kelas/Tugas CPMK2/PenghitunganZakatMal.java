package TugasTugasPemdasrSmester1;
public class PenghitunganZakatMal {
    public static void main(String[] args) {
        
        double harta = 150000000;
        double nisab = 2500000*85;
        
        System.out.println("==========PENGHITUNG ZAKAT MAL==========");
        System.out.println("");
        System.out.println("Jumlah Harta Yang Dimiliki : Rp" + harta);
        System.out.println("Jumlah Nisab Wajib Zakat Saat Ini : Rp" + nisab);
        System.out.println("----------------------------------------");
        if (harta >= nisab) {
            double zakat = harta*0.025;
            System.out.println("Nasobah Wajib Berzakat Sebesar : Rp" + zakat);
        }
        else {
            System.out.println("Nasobah Belum Wajib Zakat");
        }
        System.out.println("");
        System.out.println("=========================================");
        
        
        int harta2 = 250000000;
        int nisab2 = 2500000*85;
        
        System.out.println("==========PENGHITUNG ZAKAT MAL==========");
        System.out.println("");
        System.out.println("Jumlah Harta Yang Dimiliki : Rp" + harta2);
        System.out.println("Jumlah Nisab Wajib Zakat Saat Ini : Rp" + nisab2);
        System.out.println("----------------------------------------");
        if (harta2 >= nisab2) {
            double zakat2 = harta2*0.025;
            System.out.println("Nasobah Wajib Berzakat Sebesar : Rp" + zakat2);
        }
        else {
            System.out.println("Nasobah Belum Wajib Zakat");
        }
        System.out.println("");
        System.out.println("=========================================");
    }
}
