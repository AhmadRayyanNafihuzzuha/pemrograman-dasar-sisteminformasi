package PraktikumModul2.PolaBintang;

public class PiramidaBintang {
    public static void main(String[] args) {
        // kondisi-->perintah-->kegiatannya
        // untuk membuat berapa baris atau jarak
        for (int bintang = 1; bintang <= 5; bintang++) {
            // untuk membuat spasinya
            for (int spasi = 5; spasi > bintang; spasi--) {
                System.out.print(" ");
            }
            //untuk membuat bintangnya
            for (int  spasi= 1; spasi <= (2 * bintang - 1); spasi++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}