package MateriArray.StudiKasus;
import java.util.*;
public class ArrayMultiDataMahasiswa {

    //Method untuk memasukan jumlah prodi, kelas, dan mahasiswa
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

    // Method untuk menginput nama mahasiswa
    static void inputData(Scanner input, String[][][] mahasiswa, String[] prodi) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Prodi: " + prodi[i]);

            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("Kelas " + (char)('A' + j));

                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.print("Nama mahasiswa ke-" + (k + 1) + ": ");

                    mahasiswa[i][j][k] = input.nextLine().trim();
                }
            }
        }
    }

    //Method untuk menampilkan data dalam bentuk matriks
    static void tampilkanData(String[][][] mahasiswa, String[] prodi) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Prodi: " + prodi[i]);

            //saya juga memodifikasi dengan menambahkan syntak untuk perataan kolom
            System.out.printf("%-10s", "Kelas");

            for (int k = 0; k < mahasiswa[i][0].length; k++) {
                System.out.printf("| %-18s", "Mahasiswa " + (k + 1));
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

    //method untuk melakukan operasi string, seperti pencarian nama mahasiswa
    //menampilkan nama mahasiswa dalam huruf kapital, dan menampilkan prodi serta kelasnya
    static void operasiString(Scanner input, String[][][] mahasiswa, String[] prodi) {

        System.out.println("=== OPERASI STRING ===");

        System.out.print("Masukkan nama untuk dicari: ");
        String cari = input.nextLine().trim();

        boolean ditemukan = false;

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                for (int k = 0; k < mahasiswa[i][j].length; k++) {

                    String nama = mahasiswa[i][j][k];

                    //Mengubah nama menjadi huruf kapital
                    String namaKapital = nama.toUpperCase();

                    //Pencarian tanpa membedakan huruf besar/kecil
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
        //jika tidak ditemukan, sistem akan menampilkan pesan bahwa nama mahasiswa tidak ditemukan
        if (!ditemukan) {
            System.out.println("Nama mahasiswa tidak ditemukan.");
        }
    }

    //eksekutor method utama
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PENDATAAN MAHASISWA ===");

        int jumlahProdi = inputUkuran(input, "Jumlah prodi: ");

        int jumlahKelas = inputUkuran(input, "Jumlah kelas per prodi: ");

        int jumlahMahasiswa = inputUkuran(input, "Jumlah mahasiswa per kelas: ");

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

/*Mohon maaf sebelumnya bu, Saya dalam pengerjaan Studi Kasus ini juga dibantu oleh AI dan beberapa teman saya untuk menyelesaikannya.
Namun, saya tetap berusaha untuk memahami setiap baris kode yang saya tulis dan memastikan bahwa saya dapat menjelaskan logika di baliknya. Terima kasih atas pengertiannya.*/