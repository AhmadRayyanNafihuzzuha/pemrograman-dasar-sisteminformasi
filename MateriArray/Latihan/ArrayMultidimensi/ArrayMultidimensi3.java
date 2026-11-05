package MateriArray.Latihan.ArrayMultidimensi;

import java.util.Scanner;

public class ArrayMultidimensi3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriks = new int[3][3];

        System.out.println("Masukkan nilai untuk matriks 3x3:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("Nilai baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        int nilaiTerbesar = matriks[0][0];
        int barisTerbesar = 0;
        int kolomTerbesar = 0;

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > nilaiTerbesar) {
                    nilaiTerbesar = matriks[i][j];
                    barisTerbesar = i;
                    kolomTerbesar = j;
                }
            }
        }

        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Posisi: baris " + (barisTerbesar + 1)
                + ", kolom " + (kolomTerbesar + 1));

        input.close();
    }
}