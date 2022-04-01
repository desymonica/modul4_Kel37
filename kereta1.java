package tugas;
public class kereta1 {
    static void tujuan() {
        String[] jurusan = {"1. Bisnis", "2. Ekonomi", "3. Eksekutif"};
        for (int i = 0; i < jurusan.length; i++) {
        }
    }


    public String dataHarga(int kelas,int price) {
        int[][] harga = {{200000,300000,150000,80000},{150000,150000,100000,40000},{100000,120000,75000,20000}};
        return "Harga tujuan dengan kelas ini : " +harga[kelas][price];
    }
}
