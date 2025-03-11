public class WardenCafe {
    public int jmlPesanan;
    public String namaPemesan;
    public String namaMenu;
    public int hargaMenu;
    public int hargaTotal;

    void riwayatPesanan(int i) {
        System.out.println("Pesanan ke-" + (i + 1));
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Jumlah Pesanan: " + jmlPesanan);
        System.out.println("Harga Menu: Rp." + hargaMenu);
        System.out.println("Harga Total: Rp." + jmlPesanan * hargaMenu);
        System.out.println();
    }

    static int hitungTotalPendapatan(int jmlPesanan, int hargaMenu) {
        return jmlPesanan * hargaMenu;
    }

    public WardenCafe(int jmlPesanan, String namaPemesan, String namaMenu, int hargaMenu) {
        this.jmlPesanan = jmlPesanan;
        this.namaPemesan = namaPemesan;
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
    }
}
