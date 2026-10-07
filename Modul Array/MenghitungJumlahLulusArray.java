package MateriArray;
public class MenghitungJumlahLulusArray {
    public static void main(String[] args){
        int[] nilaiMahasiswa = {90, 92, 85, 75, 64, 55, 100};
        int jumlahLulus = 0;
         
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] >= 75) {
                jumlahLulus++;
            }
        }
        System.out.print("Nilai yang di peroleh mahasiswa adalah : ");
        for (int n : nilaiMahasiswa) {
            System.out.print(n + ", ");
        }
        System.out.println(" ");
        System.out.println("Dengan rata rata nilai 75, maka yang lulus : " + jumlahLulus);
        
    }
}
