package MateriArray;

public class NilaiMaxArray {
    public static void main(String[] args) {
        int[] nilaiMahasiswa = {90, 80, 55, 66, 84, 75, 73, 90};
        
        int nilaiMax = nilaiMahasiswa[0];
        int nilaiMin = nilaiMahasiswa[0];
        
        for (int i = 1; i < nilaiMahasiswa.length; i++){
            if (nilaiMahasiswa[i] > nilaiMax) {
                nilaiMax = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiMin) {
                nilaiMin = nilaiMahasiswa[i];
            }
        }
        System.out.println("Nilai Terbesar dari Array tersebut adalah : " + nilaiMax);
        System.out.println("Nilai Terkecil dari Array tersebut adalah : " + nilaiMin);
    }
}
