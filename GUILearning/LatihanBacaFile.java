/**
 * Nama : Ahmad Rayyan Nafihuzzuha
 * NIM  : 09020626043
 * Kelas: H6Z.1
 */
package GUILearning;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanBacaFile {

    public static void main(String[] args) {

        try {

            FileReader file =
                    new FileReader("dataMahasiswa.txt");

            BufferedReader reader =
                    new BufferedReader(file);

            String baris;

            while ((baris = reader.readLine()) != null) {

                System.out.println(baris);

            }

            reader.close();

        } catch (IOException e) {

            System.out.println(
                    "Gagal membaca file: " + e.getMessage()
            );

        }
    }
}
