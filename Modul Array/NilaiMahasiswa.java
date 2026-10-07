package MateriArray;
import java.util.*;
public class NilaiMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nilaiMahasiswa  = new int[10];
        int total = 0;
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i+1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        int nilaiMax = nilaiMahasiswa[0];
        int nilaiMin = nilaiMahasiswa[0];
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
            
            if (nilaiMahasiswa[i] > nilaiMax) nilaiMax = nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] < nilaiMin) nilaiMin = nilaiMahasiswa[i];
        }
        
        double rataRata = total / nilaiMahasiswa.length;
        
        System.out.println("\n===== Hasil =====");
        System.out.println("Total nilai yang diperoleh : " + total);
        System.out.println("Rata Rata Nilai : " + rataRata);
        System.out.println("Nilai Tertinggi yang diperoleh : " + nilaiMax);
        System.out.println("Nilai Terendah yang diperoleh : " + nilaiMin);
    }
    
}
