package Tugas;

public class KmhsQueue {
    public Node front;
    public Node rear;
    public int size;
    public int MaxQueue = 100;

    public KmhsQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return size >= MaxQueue;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Kmhs mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak bisa menambahkan mahasiswa baru");
            return;
        }

        Node newNode = new Node(mhs);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Mahasiswa " + mhs.name + " berhasil ditambahkan ke antrian");
    }

    public Kmhs dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang dapat dipanggil");
            return null;
        }

        Kmhs mhs = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        System.out.println("Memanggil mahasiswa: " + mhs.name);
        return mhs;
    }

    public Kmhs getFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa di posisi terdepan");
            return null;
        }

        return front.data;
    }

    public Kmhs getRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa di posisi terakhir");
            return null;
        }

        return rear.data;
    }

    public int getSize() {
        return size;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("\n=== Daftar Antrian Mahasiswa ===");
        Node current = front;
        int position = 1;

        while (current != null) {
            System.out.println("Posisi " + position + " : " + current.data);
            current = current.next;
            position++;
        }
        System.out.println("Total mahasiswa dalam antrian: " + size);
    }
}
