
public class whileloop {
    public static void main(String [] args) {
        int tinggiTangga = 5; 
        int bintang = 1; 

        while (bintang <= tinggiTangga) {
            int kolom = 1; 

            while (kolom <= bintang) {
                System.out.print("* ");
                kolom++; 
            }
            System.out.println();
            bintang++;  
        }
        
 
        int n = 5; // Jumlah baris bintang

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}