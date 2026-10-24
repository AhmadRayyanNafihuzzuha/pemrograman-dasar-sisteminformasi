package MateriArray;
public class PencarianData {
    public static void main(String[] args) {
        int[] nilaiData = {80, 75, 90, 85, 70};
        int cariData = 90;
        boolean ditemukan = false;
        
        for (int i = 0; i < nilaiData.length; i++) {
            if (nilaiData[i] == cariData) {
                ditemukan = true;
                break;
            }
        }
        if (ditemukan){
            System.out.println("Data Ditemukan");
        }
        else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
