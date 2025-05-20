package Tugas2;

import java.util.Scanner;

public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void tambahDataAwal(Film film) {
        Node newNode = new Node(film);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void tambahDataAkhir(Film film) {
        Node newNode = new Node(film);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void tambahDataIndeksTertentu(Film film, int indeks) {
        if (indeks < 0 || indeks > size) {
            System.out.println("Indeks tidak valid!");
            return;
        }

        if (indeks == 0) {
            tambahDataAwal(film);
            return;
        }

        if (indeks == size) {
            tambahDataAkhir(film);
            return;
        }

        Node current = head;
        for (int i = 0; i < indeks - 1; i++) {
            current = current.next;
        }

        Node newNode = new Node(film);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void hapusDataPertama() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat dihapus!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void hapusDataTerakhir() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat dihapus!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void hapusDataTertentu(int indeks) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat dihapus!");
            return;
        }

        if (indeks < 0 || indeks >= size) {
            System.out.println("Indeks tidak valid!");
            return;
        }

        if (indeks == 0) {
            hapusDataPertama();
            return;
        }

        if (indeks == size - 1) {
            hapusDataTerakhir();
            return;
        }

        Node current = head;
        for (int i = 0; i < indeks; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat ditampilkan!");
            return;
        }

        System.out.println("\nCetak Data");
        System.out.println("======================");
        Node current = head;
        while (current != null) {
            System.out.println("ID: " + current.data.id);
            System.out.println("Judul Film: " + current.data.judul);
            System.out.println("Rating: " + current.data.rating);
            System.out.println();
            current = current.next;
        }
    }

    public Film cariID(String id) {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada data yang dapat dicari!");
            return null;
        }

        Node current = head;
        while (current != null) {
            if (current.data.id.equals(id)) {
                return current.data;
            }
            current = current.next;
        }

        return null;
    }

    public void urutRatingDescending() {
        if (isEmpty() || size == 1) {
            return;
        }

        boolean swapped;
        Node current;
        Node last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.rating < current.next.data.rating) {
                    // Swap data
                    Film temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }
}

class FilmManager {
    private DoubleLinkedList filmList;
    private Scanner scanner;

    public FilmManager() {
        filmList = new DoubleLinkedList();
        scanner = new Scanner(System.in);
    }

    public void tampilkanMenu() {
        System.out.println("\nDATA FILM LAYAR LEBAR");
        System.out.println("======================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.print("Pilihan: ");
    }

    // Method untuk input data film
    public Film inputDataFilm() {
        System.out.print("Masukkan ID Film: ");
        String id = scanner.nextLine();

        System.out.print("Masukkan Judul Film: ");
        String judul = scanner.nextLine();

        double rating = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Masukkan Rating Film (0-10): ");
                rating = Double.parseDouble(scanner.nextLine());
                if (rating >= 0 && rating <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Rating harus antara 0-10!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid! Masukkan angka.");
            }
        }

        return new Film(id, judul, rating);
    }

    // Method untuk memulai aplikasi
    public void mulaiAplikasi() {
        int pilihan = 0;
        String id;
        Film film;
        int indeks;

        do {
            tampilkanMenu();
            try {
                pilihan = Integer.parseInt(scanner.nextLine());

                switch (pilihan) {
                    case 1:
                        System.out.println("\nTambah Data Film Posisi Awal");
                        film = inputDataFilm();
                        filmList.tambahDataAwal(film);
                        System.out.println("Data berhasil ditambahkan di awal list!");
                        break;

                    case 2:
                        System.out.println("\nTambah Data Film Posisi Akhir");
                        film = inputDataFilm();
                        filmList.tambahDataAkhir(film);
                        System.out.println("Data berhasil ditambahkan di akhir list!");
                        break;

                    case 3:
                        System.out.println("\nTambah Data Film Posisi Tertentu");
                        film = inputDataFilm();

                        System.out.print("Masukkan indeks: ");
                        indeks = Integer.parseInt(scanner.nextLine());

                        filmList.tambahDataIndeksTertentu(film, indeks);
                        System.out.println("Data berhasil ditambahkan pada indeks " + indeks + "!");
                        break;

                    case 4:
                        System.out.println("\nHapus Data Pertama");
                        filmList.hapusDataPertama();
                        System.out.println("Data pertama berhasil dihapus!");
                        break;

                    case 5:
                        System.out.println("\nHapus Data Terakhir");
                        filmList.hapusDataTerakhir();
                        System.out.println("Data terakhir berhasil dihapus!");
                        break;

                    case 6:
                        System.out.println("\nHapus Data Tertentu");
                        System.out.print("Masukkan indeks: ");
                        indeks = Integer.parseInt(scanner.nextLine());

                        filmList.hapusDataTertentu(indeks);
                        System.out.println("Data pada indeks " + indeks + " berhasil dihapus!");
                        break;

                    case 7:
                        filmList.cetak();
                        break;

                    case 8:
                        System.out.println("\nCari Data Film berdasarkan ID");
                        System.out.print("Masukkan ID Film: ");
                        id = scanner.nextLine();

                        film = filmList.cariID(id);

                        if (film != null) {
                            System.out.println("\nData Film ditemukan:");
                            System.out.println("ID: " + film.id);
                            System.out.println("Judul Film: " + film.judul);
                            System.out.println("Rating: " + film.rating);
                        } else {
                            System.out.println("Film dengan ID " + id + " tidak ditemukan!");
                        }
                        break;

                    case 9:
                        System.out.println("\nMengurutkan Data Film berdasarkan Rating (Descending)");
                        filmList.urutRatingDescending();
                        System.out.println("Data berhasil diurutkan!");
                        filmList.cetak();
                        break;

                    case 10:
                        System.out.println("\nTerima kasih telah menggunakan program ini!");
                        break;

                    default:
                        System.out.println("\nPilihan tidak valid! Silakan pilih menu 1-10.");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInput tidak valid! Masukkan angka.");
                pilihan = 0;
            }
        } while (pilihan != 10);
    }
}
