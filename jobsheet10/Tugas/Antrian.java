package Tugas;

public class Antrian {
    private Mahasiswa[] array;
    private int front;
    private int rear;
    private int max;
    private int maxProses;
    private int jumlahProses;

    public Antrian(int max, int maxProses) {
        this.max = max;
        this.array = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.maxProses = maxProses;
        this.jumlahProses = 0;
    }

    public boolean isEmpty() {
        return (rear == -1);
    }

    public boolean isFull() {
        return (rear == max - 1);
    }

    public void clear() {
        front = 0;
        rear = -1;
    }

    // Method untuk menambahkan mahasiswa ke antrian
    public void enqueue(Mahasiswa mahasiswa) {
        if (!isFull()) {
            rear++;
            array[rear] = mahasiswa;
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.getNim() + " ditambahkan ke antrian.");
        } else {
            System.out.println("Antrian penuh!");
        }
    }

    // Method untuk mengeluarkan mahasiswa dari antrian
    public Mahasiswa dequeue() {
        if (!isEmpty()) {
            Mahasiswa temp = array[front];

            // Menggeser elemen ke depan
            for (int i = front; i < rear; i++) {
                array[i] = array[i + 1];
            }

            rear--;
            return temp;
        } else {
            System.out.println("Antrian kosong!");
            return null;
        }
    }

    // Method untuk memproses KRS (2 mahasiswa sekaligus)
    public void processKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat diproses!");
            return;
        }

        if (jumlahProses >= maxProses) {
            System.out.println("Kuota KRS sudah penuh! Tidak dapat memproses lebih banyak mahasiswa.");
            return;
        }

        System.out.println("\n=== PROSES KRS ===");
        int count = 0;

        // Memproses maksimal 2 mahasiswa
        while (count < 2 && !isEmpty() && jumlahProses < maxProses) {
            Mahasiswa mhs = dequeue();
            if (mhs != null) {
                System.out.println("Mahasiswa ke-" + (jumlahProses + 1) + " diproses:");
                System.out.println(mhs.toString());
                System.out.println("-------------------------------");
                jumlahProses++;
                count++;
            }
        }

        System.out.println("Jumlah mahasiswa yang diproses: " + count);
        System.out.println("Total mahasiswa yang sudah diproses: " + jumlahProses);
    }

    // Method untuk menampilkan semua antrian
    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== DAFTAR ANTRIAN KRS ===");
        for (int i = front; i <= rear; i++) {
            System.out.println("Antrian ke-" + (i + 1) + ":");
            System.out.println(array[i].toString());
            System.out.println("-------------------------------");
        }
    }

    // Method untuk menampilkan 2 antrian terdepan
    public void displayFront2() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== 2 ANTRIAN TERDEPAN ===");
        int count = 0;
        for (int i = front; i <= rear && count < 2; i++) {
            System.out.println("Antrian ke-" + (i + 1) + ":");
            System.out.println(array[i].toString());
            System.out.println("-------------------------------");
            count++;
        }

        if (count < 2) {
            System.out.println("Hanya terdapat " + count + " mahasiswa dalam antrian.");
        }
    }

    // Method untuk menampilkan antrian paling akhir
    public void displayLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("\n=== ANTRIAN TERAKHIR ===");
        System.out.println("Antrian ke-" + (rear + 1) + ":");
        System.out.println(array[rear].toString());
        System.out.println("-------------------------------");
    }

    // Method untuk mendapatkan jumlah antrian
    public int getSize() {
        if (isEmpty()) {
            return 0;
        }
        return (rear - front + 1);
    }

    // Method untuk mendapatkan jumlah mahasiswa yang sudah proses KRS
    public int getJumlahProses() {
        return jumlahProses;
    }

    // Method untuk mendapatkan jumlah mahasiswa yang diinputkan
    public int getBelumProses() {
        return (max - jumlahProses);
    }
}
