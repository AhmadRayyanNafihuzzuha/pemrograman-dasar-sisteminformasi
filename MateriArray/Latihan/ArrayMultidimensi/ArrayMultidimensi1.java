package MateriArray.Latihan.ArrayMultidimensi;

public class ArrayMultidimensi1 {
    public static void main(String[] args) {
        int[][] nilaiMahasiswa = {
            {80, 85, 90, 75},
            {70, 88, 82, 90},
            {95, 80, 85, 88}
        };

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int totalNilai = 0;
            for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }

            double rataRata = (double) totalNilai / nilaiMahasiswa[i].length;
            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + rataRata);
        }
    }
}
