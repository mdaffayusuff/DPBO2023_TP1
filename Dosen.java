/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP1
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

import java.util.ArrayList;

// Class Dosen
public class Dosen {

    // Attribut private
    private String NIP;
    private String nama;
    private char jenis_kelamin;
    private ArrayList<String> materi_belajar;
    private ArrayList<String> tugas;
    
    // dengan tambahan composition dari class Spidol, Lapotp, Asdos, dan Mahasiswa  
    private ArrayList<Spidol> spidol2;
    private Laptop laptopdsn;
    private Asdos tim_asdos;
    private ArrayList<Mahasiswa> para_mahasiswa;

    // Constructor kosong
    public Dosen() {
        this.NIP = "";
        this.nama = "";
        this.jenis_kelamin = '-';
        this.spidol2 = new ArrayList<Spidol>();
        this.laptopdsn = new Laptop();
        this.materi_belajar = new ArrayList<String>();
        this.tugas = new ArrayList<String>();
        this.tim_asdos = new Asdos();
        this.para_mahasiswa = new ArrayList<Mahasiswa>();
    }
    
    // Constructor dengan parameter
    public Dosen(String NIP, String nama, char jenis_kelamin, ArrayList<Spidol> spidol, Laptop laptopdsn,
            ArrayList<String> materi_belajar, ArrayList<String> tugas, Asdos tim_asdos,
            ArrayList<Mahasiswa> para_mahasiswa) {
        this.NIP = NIP;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.spidol2 = spidol;
        this.laptopdsn = laptopdsn;
        this.materi_belajar = materi_belajar;
        this.tugas = tugas;
        this.tim_asdos = tim_asdos;
        this.para_mahasiswa = para_mahasiswa;
    }
    
    // Setter, getter, dan adder(hanya untuk list)
    public void set_NIP(String NIP) {
        this.NIP = NIP;
    }

    public void set_nama(String nama) {
        this.nama = nama;
    }

    public void set_jenis_kelamin(char jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public void set_spidol2(ArrayList<Spidol> spidol) {
        this.spidol2 = spidol;
    }
    
    public void add_spidol2(Spidol spidol) {
        this.spidol2.add(spidol);
    }
    
    public void set_laptopdsn(Laptop laptopdsn) {
        this.laptopdsn = laptopdsn;
    }

    public void set_materi_belajar(ArrayList<String> materi_belajar) {
        this.materi_belajar = materi_belajar;
    }
    
    public void add_materi_belajar(String materi_belajar) {
        this.materi_belajar.add(materi_belajar);
    }
    
    public void set_tugas(ArrayList<String> tugas) {
        this.tugas = tugas;
    }
    
    public void add_tugas(String tugas) {
        this.tugas.add(tugas);
    }

    public void set_tim_asdos(Asdos tim_asdos) {
        this.tim_asdos = tim_asdos;
    }

    
    public void set_para_mahasiswa(ArrayList<Mahasiswa> para_mahasiswa) {
        this.para_mahasiswa = para_mahasiswa;
    }
    
    public void add_para_mahasiswa(Mahasiswa para_mahasiswa) {
        this.para_mahasiswa.add(para_mahasiswa);
    }

    public String get_NIP() {
        return this.NIP;
    }
    
    public String get_nama() {
        return this.nama;
    }

    public char get_jenis_kelamin() {
        return this.jenis_kelamin;
    }

    public ArrayList<Spidol> get_spidol2() {
        return this.spidol2;
    }

    public Laptop get_laptopdsn() {
        return this.laptopdsn;
    }

    public ArrayList<String> get_materi_belajar() {
        return this.materi_belajar;
    }

    public ArrayList<String> get_tugas() {
        return this.tugas;
    }

    public Asdos get_tim_asdos() {
        return this.tim_asdos;
    }

    public ArrayList<Mahasiswa> get_para_mahasiswa() {
        return this.para_mahasiswa;
    }


}
