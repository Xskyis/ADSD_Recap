
import java.util.Scanner;

public class WardenCafeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==Selamat datang di Warden Cafe==");
        System.out.print("Silahkan masukkan total pesanan anda: ");
        int ttlPesanan = sc.nextInt();
        sc.nextLine();

        System.out.println();

        WardenCafe pesanan[] = new WardenCafe[ttlPesanan];

        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("Pesanan ke-" + (i + 1));
            System.out.print("Masukkan nama pemesan: ");
            String namaPemesan = sc.nextLine();
            System.out.print("Masukkan nama menu: ");
            String namaMenu = sc.nextLine();
            System.out.print("Masukkan jumlah pesanan: ");
            int jmlPesanan = sc.nextInt();
            System.out.print("Masukkan harga menu: ");
            int hargaMenu = sc.nextInt();
            sc.nextLine();
            pesanan[i] = new WardenCafe(jmlPesanan, namaPemesan, namaMenu, hargaMenu);
            System.out.println();
        }

        for (int i = 0; i < pesanan.length; i++) {
            pesanan[i].riwayatPesanan(i);
        }

        int totalPendapatan = 0;

        for (WardenCafe pesanan1 : pesanan) {
            totalPendapatan += pesanan1.hitungTotalPendapatan(pesanan1.jmlPesanan, pesanan1.hargaMenu);
        }

        System.out.println("Total pendapatan: Rp." + totalPendapatan);

    }
}
