package Praktikum;

public class PencatatanStock {
    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},   
            {6, 11, 9, 12},   
            {2, 10, 10, 5}, 
            {5, 7, 12, 9}     
        };

        int[] hargaBunga = {75000, 50000, 60000, 10000};

        tampilkanPendapatan(stockBunga, hargaBunga);

        tampilkanTotalStock(stockBunga);
    }

    // Fungsi untuk menampilkan pendapatan setiap cabang
    public static void tampilkanPendapatan(int[][] stock, int[] harga) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stock[i].length; j++) {
                totalPendapatan += stock[i][j] * harga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
        System.out.println();
    }

    // Fungsi untuk menampilkan total stock setiap jenis bunga di semua cabang
    public static void tampilkanTotalStock(int[][] stock) {
        int[] totalStock = new int[stock[0].length];

        // Menjumlahkan stok tiap jenis bunga
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                totalStock[j] += stock[i][j];
            }
        }

        // Menampilkan hasil
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("Total Stock Bunga di Semua Cabang:");
        for (int i = 0; i < totalStock.length; i++) {
            System.out.println(namaBunga[i] + ": " + totalStock[i] + " bunga");
        }
    }
}
