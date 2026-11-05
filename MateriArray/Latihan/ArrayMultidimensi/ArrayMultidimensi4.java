package MateriArray.Latihan.ArrayMultidimensi;

import java.util.Scanner;

public class ArrayMultidimensi4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran matriks persegi: ");
        int ukuran = input.nextInt();
        int[][] matriks = new int[ukuran][ukuran];

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print("Nilai baris " + (i + 1) + ", kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("\nMatriks (elemen diagonal utama ditandai dengan [ ]):");
        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                if (i == j) {
                    System.out.print("[" + matriks[i][j] + "]\t");
                } else {
                    System.out.print(matriks[i][j] + "\t");
                }
            }
            System.out.println();
        }

        int jumlahDiagonal = 0;
        for (int i = 0; i < ukuran; i++) {
            jumlahDiagonal += matriks[i][i];
        }

        System.out.println("Jumlah elemen diagonal utama: " + jumlahDiagonal);
        input.close();
    }
}