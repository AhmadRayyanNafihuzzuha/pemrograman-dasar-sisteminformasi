package MateriArray;

public class MenghitungRataArray {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {55, 69, 80, 98, 100};
        
        int total = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++){
            total += nilaiMahasiswa[1];
        }
        double rataRataNilai = total / nilaiMahasiswa.length;
        
        System.out.println("Total Nilai : " + total);
        System.out.println("Rata Rata Nilai Mahasiswa : " + rataRataNilai);
    }
}
