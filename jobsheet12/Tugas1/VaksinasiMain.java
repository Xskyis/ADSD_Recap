package Tugas1;

import java.util.Scanner;

public class VaksinasiMain {
    private Queue antrianVaksin;
    private Scanner scanner;

    public VaksinasiMain() {
        antrianVaksin = new Queue();
        scanner = new Scanner(System.in);
    }

    public void tampilkanHeader() {
        System.out.println("==============================");
        System.out.println("PROGRAM VAKSIN EXTRAVAGANZA");
        System.out.println("==============================");
    }

    public void tampilkanMenu() {
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
    }

    public void tambahData() {
        System.out.println("\n==============================");
        System.out.println("Tambah Data Penerima Vaksin");
        System.out.println("==============================");

        System.out.print("NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Prodi: ");
        String prodi = scanner.nextLine();

        antrianVaksin.enqueue(nim, nama, prodi);
        System.out.println("Data berhasil ditambahkan!");
    }

    public void hapusData() {
        System.out.println("\n==============================");
        System.out.println("Hapus Data Pengantri Vaksin");
        System.out.println("==============================");

        if (antrianVaksin.isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.print("NIM yang ingin dihapus: ");
        String nim = scanner.nextLine();

        Node removedNode = antrianVaksin.dequeue(nim);

        if (removedNode != null) {
            System.out.println(removedNode.nama + " Telah selesai di vaksinasi.");
        } else {
            System.out.println("Data dengan NIM " + nim + " tidak ditemukan!");
        }
    }

    public void daftarPenerima() {
        System.out.println();
        if (antrianVaksin.isEmpty()) {
            System.out.println("Daftar kosong!");
        } else {
            antrianVaksin.displayQueue();
        }
    }

    public void cetakData() {
        System.out.println("\n==============================");
        System.out.println("Cetak Data");
        System.out.println("==============================");
        System.out.println("Jumlah Antrian: " + antrianVaksin.size());
        System.out.println("==============================");
        daftarPenerima();
    }

    public void jalankan() {
        String pilihan;
        boolean isRunning = true;

        while (isRunning) {
            tampilkanHeader();
            tampilkanMenu();

            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahData();
                    break;
                case "2":
                    hapusData();
                    break;
                case "3":
                    cetakData(); 
                    break;
                case "4":
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            if (isRunning) {
                System.out.println("\nTekan Enter untuk melanjutkan...");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        VaksinasiMain app = new VaksinasiMain();
        app.jalankan();
    }
}