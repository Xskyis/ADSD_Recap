package LatihanPraktikum;

import java.util.Scanner;

public class MainSurat03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat03 stack = new StackSurat03(10); 

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan Jenis Izin (S/I): ");
                    char jenisIzin = sc.next().charAt(0);
                    System.out.print("Masukkan Durasi Izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 

                    Surat03 surat = new Surat03(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat03 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat diproses:");
                        System.out.println("ID: " + suratDiproses.idSurat);
                        System.out.println("Nama: " + suratDiproses.namaMahasiswa);
                        System.out.println("Kelas: " + suratDiproses.kelas);
                        System.out.println("Jenis Izin: " + (suratDiproses.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                        System.out.println("Durasi: " + suratDiproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat03 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println("ID: " + suratTerakhir.idSurat);
                        System.out.println("Nama: " + suratTerakhir.namaMahasiswa);
                        System.out.println("Kelas: " + suratTerakhir.kelas);
                        System.out.println("Jenis Izin: " + (suratTerakhir.jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                        System.out.println("Durasi: " + suratTerakhir.durasi + " hari");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    if (stack.search(namaCari)) {
                        System.out.println("Surat atas nama " + namaCari + " ditemukan.");
                        System.out.println("Detail surat:");
                        for (int i = 0; i <= stack.top; i++) {
                            if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(namaCari)) {
                                System.out.println("ID: " + stack.stack[i].idSurat);
                                System.out.println("Kelas: " + stack.stack[i].kelas);
                                System.out.println("Jenis Izin: " + (stack.stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                                System.out.println("Durasi: " + stack.stack[i].durasi + " hari");
                            }
                        }
                    } else {
                        System.out.println("Surat atas nama " + namaCari + " tidak ditemukan.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}