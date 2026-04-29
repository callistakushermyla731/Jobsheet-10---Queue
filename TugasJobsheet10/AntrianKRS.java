package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa04[] data;
    int front, rear, size, max;
    int sudahProses = 0;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa04[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa04 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;

            System.out.println(mhs.nama + " sudah masuk ke dalam antrian");
        }
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Dipanggil:");
        for (int i = 0; i < 2; i++) {
            data[front].tampil();

            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            sudahProses++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int i = front;
        for (int j = 0; j < size; j++) {
            data[i].tampil();
            i = (i + 1) % max;
        }
    }

    public void peek2Depan() {
        if (size < 2) {
            System.out.println("Kurang dari 2 antrian");
            return;
        }
        data[front].tampil();
        data[(front + 1) % max].tampil();
    }

    public void peekBelakang() {
        if (isEmpty()) {
            System.out.println("Kosong");
            return;
        }
        data[rear].tampil();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahProses() {
        System.out.println("Sudah proses: " + sudahProses);
    }

    public void sisaBelumProses() {
        System.out.println("Belum proses: " + (30 - sudahProses));
    }
}
