package MateriArray;

public class UjiCobaArray1D {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {80, 75, 90, 85, 70};
        
        System.out.println("Jumlah panjang nilai Array : " + nilaiMahasiswa.length);
        
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " adalah " + nilaiMahasiswa[i]);
        }
    }
}
