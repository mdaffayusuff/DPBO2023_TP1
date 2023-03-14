import java.util.ArrayList;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private char jenis_kelamin;
    private ArrayList<Buku> buku2;
    private Laptop laptopmhs;
    private int nilai_praktikum;
    private int nilai_total;

    public Mahasiswa() {
        this.NIM = "";
        this.nama = "";
        this.jenis_kelamin = '-';
        this.buku2 = new ArrayList<>();
        this.laptopmhs = new Laptop();
        this.nilai_praktikum = 0;
        this.nilai_total = 0;
    }
    
    public Mahasiswa(String NIM, String nama, char jenis_kelamin, ArrayList<Buku> buku, Laptop laptopmhs, int nilai_praktikum, int nilai_total) {
        this.NIM = NIM;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.buku2 = buku;
        this.laptopmhs = laptopmhs;
        this.nilai_praktikum = nilai_praktikum;
        this.nilai_total = nilai_total;
    }

    public void set_NIM(String NIM) {
        this.NIM = NIM;
    }

    public void set_nama(String nama) {
        this.nama = nama;
    }

    public void set_jenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public void set_buku2(ArrayList<Buku> buku) {
        this.buku2 = buku;
    }
    
    public void add_buku2(Buku buku) {
        this.buku2.add(buku);
    }
    
    public void set_laptopmhs(Laptop laptopmhs) {
        this.laptopmhs = laptopmhs;
    }

    public void set_nilai_praktikum(int nilai_praktikum) {
        this.nilai_praktikum = nilai_praktikum;
    }

    public void set_nilai_total(int nilai_total) {
        this.nilai_total = nilai_total;
    }

    public String get_NIM(String NIM) {
        return this.NIM;
    }
    
    public String get_nama() {
        return this.nama;
    }

    public char get_jenis_kelamin() {
        return this.jenis_kelamin;
    }

    public ArrayList<Buku> get_buku2() {
        return this.buku2;
    }

    public Laptop get_laptopmhs() {
        return this.laptopmhs;
    }

    public int get_nilai_praktikum() {
        return this.nilai_praktikum;
    }

    public int get_nilai_total() {
        return this.nilai_total;
    }

}
