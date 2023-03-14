import java.util.ArrayList;

/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP1
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

public class Main {
    public static void main(String[] args) {
        theProcess startProcess = new theProcess();

        Spidol sapi = new Spidol("BonekaSalju", "hitam");
        Spidol pidol = new Spidol("BonekaSalju", "biru");
        Laptop lapdos = new Laptop("snsv", "clamshell", "AX-20653");
        Laptop lapmas1 = new Laptop("llep", "2-in-1", "XPS360");
        Buku sample1 = new Buku("Mimpi", "Susilo", "Gramed");

        ArrayList<Spidol> sp = new ArrayList<Spidol>();
        sp.add(sapi);
        sp.add(pidol);

        ArrayList<Buku> buk = new ArrayList<Buku>();
        buk.add(sample1);

        Asdos dosas = new Asdos();

        // Mahasiswa
        Mahasiswa pahri = new Mahasiswa("2109843", "Pahri", 'L', buk, lapmas1, 0, 0);
        Mahasiswa Mila = new Mahasiswa("2109756", "Mila", 'P', buk, lapmas1, 0, 0);
        Mahasiswa Getsbi = new Mahasiswa("2106544", "Getsbi", 'L', buk, lapmas1, 0, 0);
        Mahasiswa Angga = new Mahasiswa("2108845", "Angga", 'L', buk, lapmas1, 0, 0);

        // PEmasukan data
        startProcess.add_para_dosen(new Dosen("123456", "Rose", 'P', sp, lapdos, new ArrayList<>(), new ArrayList<>(),
                dosas, new ArrayList<>()));

        startProcess.tambahMahasiswa("123456", pahri);
        startProcess.tambahAnggotaBEM(pahri);

        startProcess.tambahMahasiswa("123456", Mila);
        startProcess.tambahAsdos("123456", Mila);

        startProcess.tambahMahasiswa("123456", Getsbi);
        startProcess.tambahMahasiswa("123456", Angga);
        startProcess.tambahAnggotaKEC(Getsbi);
        startProcess.tambahAnggotaKEC(Angga);

        
        // Print semua Mahasiswa

        System.out.println("List Semua Mahasiswa:");
        for (Mahasiswa maha : startProcess.get_para_mahasiswa()) {
            System.out.println(maha.get_NIM() + "| " + maha.get_nama() + "(" + maha.get_jenis_kelamin() + ")"
                    + "Nilai Akhir: " + maha.get_nilai_total() + ", Nilai Praktikum: " + maha.get_nilai_praktikum()
                    + "\n");
            System.out.println("      Buku yang dibawa :");
            for (Buku buku : maha.get_buku2()) {
                System.out.print("          - " + buku.get_judul() + "oleh: " + buku.get_penulis() + ", penerbit: "
                        + buku.get_penerbit());
            }
            System.out.println("\n      Laptop : " + maha.get_laptopmhs().get_merk() + " - "
                    + maha.get_laptopmhs().get_no_model() + "(" + maha.get_laptopmhs().get_tipe() + ")");
            System.out.println("");

        }

        // Print para dosen
        System.out.println("List para Dosen");
        for (Dosen dos : startProcess.get_para_dosen()) {
            System.out.println(dos.get_NIP() + "| " + dos.get_nama() + "(" + dos.get_jenis_kelamin() + ")"
                    + "\n");
            System.out.println("      Spidol yang digunakan:");
            for (Spidol s : dos.get_spidol2()) {
                System.out.println("        - " + s.get_merk() + " " + s.get_warna());
            }
            System.out.println("\n      Laptop : " + dos.get_laptopdsn().get_merk() + " - "
                    + dos.get_laptopdsn().get_no_model() + "(" + dos.get_laptopdsn().get_tipe() + ")");
            System.out.println("\n      Mahasiswa:");
            for (Mahasiswa m : dos.get_para_mahasiswa()) {
                System.out.println("        - " + m.get_NIM() + " | " + m.get_nama());
            }
            System.out.println("      Asdos:");
            for (Mahasiswa m : dos.get_tim_asdos().get_team()) {
                System.out.println("        - " + m.get_NIM() + " | " + m.get_nama());
            }

            System.out.println("\n      Materi:");
            for (String m : dos.get_materi_belajar()) {
                System.out.println("        -" + m);
            }

            System.out.println("\n      Tugas:");
            for (String m : dos.get_tugas()) {
                System.out.println("        -" + m);
            }
            System.out.println("");

        }

        // Print KEC
        System.out.println("KEC:");
        System.out.println("    Anggota:");
        for (Mahasiswa m : startProcess.get_all_kec().get_anggota()) {
            System.out.println("        - " + m.get_NIM() + " | " + m.get_nama());
        }
        System.out.println("\n    Materi:");
        for (String m : startProcess.get_all_kec().get_materi_belajar()) {
            System.out.println("        -" + m);
        }
        System.out.println("\n    Proker:");
        for (String m : startProcess.get_all_kec().get_proker()) {
            System.out.println("        -" + m);
        }

        // Print BEM
        System.out.println("BEM:");
        System.out.println("    Anggota:");
        for (Mahasiswa m : startProcess.get_all_bem().get_anggota()) {
            System.out.println("        - " + m.get_NIM() + " | " + m.get_nama());
        }
        System.out.println("\n    Rencana Proker:");
        for (String m : startProcess.get_all_bem().get_proker_plan()) {
            System.out.println("        -" + m);
        }
        System.out.println("\n    Proker Dijalankan:");
        for (String m : startProcess.get_all_bem().get_proker_do()) {
            System.out.println("        -" + m);
        }
        System.out.println("\n    Proker Dievaluasi:");
        for (String m : startProcess.get_all_bem().get_eval()) {
            System.out.println("        -" + m);
        }

    }
}
