import java.util.Scanner;

public class SingleLinkedList03 {
    Node03 head;
    Node03 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node03 tmp = head;
            System.out.print("Isi Linked List:\n");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n====== Input Data Mahasiswa ======");
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        String ipk = sc.nextLine();
        
        Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
        
        System.out.println("\nPilih posisi penambahan data:");
        System.out.println("1. AddFirst");
        System.out.println("2. AddLast");
        System.out.println("3. InsertAfter");
        System.out.println("4. InsertAt");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); 
        
        switch (pilihan) {
            case 1:
                addFirst(mhs);
                System.out.println("Data berhasil ditambahkan di awal");
                break;
            case 2:
                addLast(mhs);
                System.out.println("Data berhasil ditambahkan di akhir");
                break;
            case 3:
                System.out.print("Masukkan nama mahasiswa yang menjadi acuan: ");
                String key = sc.nextLine();
                insertAfter(key, mhs);
                System.out.println("Data berhasil ditambahkan setelah " + key);
                break;
            case 4:
                System.out.print("Masukkan indeks: ");
                int index = sc.nextInt();
                insertAt(index, mhs);
                System.out.println("Data berhasil ditambahkan pada indeks " + index);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }

    public void addFirst(Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        Node03 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa03 input) {
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node03 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node03(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key) {
        Node03 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node03 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node03 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node03 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
    
}
