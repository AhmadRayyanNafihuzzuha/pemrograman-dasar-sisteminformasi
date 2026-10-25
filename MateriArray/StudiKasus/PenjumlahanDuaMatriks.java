package MateriArray.StudiKasus;
public class PenjumlahanDuaMatriks {
    public static void main(String[] args) {
        int[][] satu = {{1,2}, {3,4}};
        int[][] dua = {{5,6}, {7,8}};
        int[][] tiga = new int[2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                tiga[i][j] = satu[i][j] + dua[i][j]; 
            }
        }
        
        for (int[] baris : tiga) {
            for (int nilai : baris) {
                System.out.print(nilai + " ");
            }
            System.out.println();
        }
    }
}
