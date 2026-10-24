package MateriMethod;

public class methodSatu {
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    static double luasSegitiga(double panjang, double lebar){
        return 0.5 * panjang * lebar;
    }
    static void cetakHasil(String namaBangun, double hasil){
        System.out.println("Luas " + namaBangun + " adalah : " + hasil);
    }
    
    public static void main(String[] args) {
        
        double luasPersegiPanjang = luasPersegiPanjang(5, 250);
        double luasSegitiga = luasSegitiga(4, 5);
        cetakHasil("Persegi panjang", luasPersegiPanjang);
        cetakHasil("Segitiga", luasSegitiga);
    }
}
