package MateriArray.StudiKasus;

import java.util.*;
public class ArrayMultiDataMahasiswa {

    // 1. Method untuk input ukuran array
    static int inputUkuran(Scanner input, String keterangan) {
        int ukuran;

        do {
            System.out.print(keterangan);
            ukuran = input.nextInt();

            if (ukuran <= 0) {
                System.out.println("Ukuran harus lebih dari 0!");
            }
        } while (ukuran <= 0);

        return ukuran;
    }

    // 2. Method untuk input nama mahasiswa
    static void inputData(
        Scanner input,
        String[][][] mahasiswa,
        String[] prodi
    ) {
        input.nextLine(); // Membersihkan sisa Enter

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nProdi: " + prodi[i]);

            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("Kelas " + (char)('A' + j));

                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.print(
                        "Nama mahasiswa ke-" + (k + 1) + ": "
                    );

                    mahasiswa[i][j][k] = input.nextLine().trim();
                }
            }
        }
    }

    // 3. Method untuk menampilkan data dalam bentuk matriks
    static void tampilkanData(
        String[][][] mahasiswa,
        String[] prodi
    ) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nProdi: " + prodi[i]);

            System.out.printf("%-10s", "Kelas");

            for (int k = 0; k < mahasiswa[i][0].length; k++) {
                System.out.printf("| %-18s", "Mhs " + (k + 1));
            }

            System.out.println();

            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.printf("%-10s", "Kelas " + (char)('A' + j));

                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.printf("| %-18s", mahasiswa[i][j][k]);
                }

                System.out.println();
            }
        }
    }

    // 4. Method untuk operasi string
    static void operasiString(
        Scanner input,
        String[][][] mahasiswa,
        String[] prodi
    ) {
        System.out.println("\n=== OPERASI STRING ===");

        System.out.print("Masukkan nama untuk dicari: ");
        String cari = input.nextLine().trim();

        boolean ditemukan = false;

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                for (int k = 0; k < mahasiswa[i][j].length; k++) {

                    String nama = mahasiswa[i][j][k];

                    // Mengubah nama menjadi huruf kapital
                    String namaKapital = nama.toUpperCase();

                    // Pencarian tanpa membedakan huruf besar/kecil
                    if (nama.equalsIgnoreCase(cari)) {
                        System.out.println("\nMahasiswa ditemukan!");
                        System.out.println("Nama       : " + nama);
                        System.out.println("Nama kapital: " + namaKapital);
                        System.out.println("Prodi      : " + prodi[i]);
                        System.out.println("Kelas      : " + (char)('A' + j));
                        ditemukan = true;
                    }
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Nama mahasiswa tidak ditemukan.");
        }
    }

    // 5. Method utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PENDATAAN MAHASISWA ===");

        int jumlahProdi = inputUkuran(
            input, "Jumlah prodi (3): "
        );

        int jumlahKelas = inputUkuran(
            input, "Jumlah kelas per prodi (3): "
        );

        int jumlahMahasiswa = inputUkuran(
            input, "Jumlah mahasiswa per kelas (5): "
        );

        String[][][] mahasiswa = new String
            [jumlahProdi][jumlahKelas][jumlahMahasiswa];

        String[] prodi = new String[jumlahProdi];

        input.nextLine();

        for (int i = 0; i < jumlahProdi; i++) {
            System.out.print("Nama prodi ke-" + (i + 1) + ": ");
            prodi[i] = input.nextLine().trim();
        }

        inputData(input, mahasiswa, prodi);
        tampilkanData(mahasiswa, prodi);
        operasiString(input, mahasiswa, prodi);

        input.close();
    }
}