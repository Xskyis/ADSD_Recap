package Tugas;

import java.util.Scanner;

public class PelayananMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KmhsQueue queue = new KmhsQueue();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Mahasiswa Terakhir");
            System.out.println("5. Cek Antrian Kosong");
            System.out.println("6. Cek Antrian Penuh");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Tampilkan Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Tampilkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");

            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa baru");
                    } else {
                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String name = sc.nextLine();
                        System.out.print("Masukkan Jenis Layanan: ");
                        String jnsLayanan = sc.nextLine();

                        Kmhs Kmhs = new Kmhs(nim, name, jnsLayanan);
                        queue.enqueue(Kmhs);
                    }
                    break;

                case 2:
                    Kmhs called = queue.dequeue();
                    if (called != null) {
                        System.out.println("Mahasiswa yang dipanggil: " + called);
                    }
                    break;

                case 3:
                    Kmhs front = queue.getFront();
                    if (front != null) {
                        System.out.println("Mahasiswa terdepan dalam antrian: " + front);
                    }
                    break;

                case 4:
                    Kmhs rear = queue.getRear();
                    if (rear != null) {
                        System.out.println("Mahasiswa terakhir dalam antrian: " + rear);
                    }
                    break;

                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 6:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }
                    break;

                case 7:
                    queue.clear();
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.size);
                    break;

                case 9:
                    queue.displayQueue();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Layanan Unit Kemahasiswaan");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);
    }
}
