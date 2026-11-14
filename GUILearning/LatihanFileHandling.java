/**
 * Nama : Ahmad Rayyan Nafihuzzuha
 * NIM  : 09020626043
 * Kelas: H6Z.1
 */
package GUILearning;
import java.io.FileWriter;
import java.io.IOException;
public class LatihanFileHandling {
    public static void main(String[] args) {
        try {

            FileWriter writer =
                    new FileWriter("dataMahasiswa.txt");

            writer.write("001,Ahmad,Sistem Informasi,Laki-laki\n");
            writer.write("002,Budi,Informatika,Laki-laki\n");

            writer.close();

            System.out.println("Data berhasil disimpan!");

        } catch (IOException e) {

            System.out.println("Terjadi kesalahan: " + e.getMessage());

        }
    }
}
