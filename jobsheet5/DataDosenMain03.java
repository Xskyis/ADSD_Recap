import java.util.Scanner;

public class DataDosenMain03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen03 data = new DataDosen03();
        int pilihan;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (data.idx < 10) {
                        System.out.print("Masukkan kode: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (true untuk Laki-laki, false untuk Perempuan): ");
                        boolean jk = sc.nextBoolean();
                        System.out.print("Masukkan usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine(); 

                        Dosen03 dsn = new Dosen03(kode, nama, jk, usia);
                        data.tambah(dsn);
                    } else {
                        System.out.println("Data penuh, tidak bisa menambahkan dosen baru.");
                    }
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);
        
        sc.close();
    }
}
