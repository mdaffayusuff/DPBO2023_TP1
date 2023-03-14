/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP1
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

import java.util.ArrayList;

// Class theProcess
public class theProcess {

    // Atteribut private yang merupakan composite dari class Dosen, Mahasiswa, KEC, dan BEM
    private ArrayList<Dosen> para_dosen;
    private ArrayList<Mahasiswa> para_mahasiswa;
    private KEC all_kec;
    private BEM all_bem;

    // Constructor kosong
    public theProcess() {
        this.para_dosen = new ArrayList<Dosen>();
        this.para_mahasiswa = new ArrayList<Mahasiswa>();
        this.all_kec = new KEC();
        this.all_bem = new BEM();
    }


    // Metode penambahan mahasiswa pada mahasiswa yang diajar dosen, tim asdos, KEC, dan BEM
    public void tambahMahasiswa(String NIP_dosen, Mahasiswa mahasiswaYangdiTambah) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), dosen)) {
                    dosen.add_para_mahasiswa(mahasiswaYangdiTambah);
                    if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), para_mahasiswa)) {
                        add_para_mahasiswa(mahasiswaYangdiTambah);
                    }
                    break;
                } else {
                    System.out.println("Mahasiswa sudah ada");
                }
            }
        }
    }

    public void tambahAsdos(String NIP_dosen, Mahasiswa mahasiswaYangdiTambah) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), dosen.get_tim_asdos())) {
                    dosen.get_tim_asdos().add_team(mahasiswaYangdiTambah);
                    if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), para_mahasiswa)) {
                        add_para_mahasiswa(mahasiswaYangdiTambah);
                    }
                    break;
                }
            } else {
                System.out.println("Asdos sudah ada");
            }
        }
    }

    public void tambahAnggotaBEM(Mahasiswa mahasiswaYangdiTambah) {
        if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), this.all_bem)) {
            this.all_bem.add_anggota(mahasiswaYangdiTambah);
            if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), para_mahasiswa)) {
                add_para_mahasiswa(mahasiswaYangdiTambah);
            }
        } else {
            System.out.println("Anggota sudah ada");
        }
    }

    public void tambahAnggotaKEC(Mahasiswa mahasiswaYangdiTambah) {
        if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), this.all_kec)) {
            this.all_kec.add_anggota(mahasiswaYangdiTambah);
            if (!cek_mahasiswa(mahasiswaYangdiTambah.get_NIM(), para_mahasiswa)) {
                add_para_mahasiswa(mahasiswaYangdiTambah);
            }
        } else {
            System.out.println("Anggota sudah ada");
        }
    }


    // MEtode penambahan string sebagai materi, tugas (baik dari dosen maupun asdos), dan proker(yang akan, sedang, dan sudah dilakukan)
    public void tambahMateridari(String NIP_dosen, String materiYangDitambahkan) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_listString(dosen.get_materi_belajar(), materiYangDitambahkan)) {
                    dosen.add_materi_belajar(materiYangDitambahkan);
                } else {
                    System.out.println("Materi sudah ada");
                }
                break;
            }
        }
    }

    public void tambahTugasdari(String NIP_dosen, String tugasYangDitambahkan) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_listString(dosen.get_tugas(), tugasYangDitambahkan)) {
                    dosen.add_tugas(tugasYangDitambahkan);
                } else {
                    System.out.println("Tugas sudah ada");
                }
                break;
            }
        }
    }

    public void tambahMateriAsdosdari(String NIP_dosen, String materiYangDitambahkan) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_listString(dosen.get_tim_asdos().get_materi_belajar(), materiYangDitambahkan)) {
                    dosen.get_tim_asdos().add_materi_belajar(materiYangDitambahkan);
                } else {
                    System.out.println("Materi sudah ada");
                }
                break;
            }
        }
    }

    public void tambahTugasAsdosdari(String NIP_dosen, String tugasYangDitambahkan) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                if (!cek_listString(dosen.get_tim_asdos().get_tugas(), tugasYangDitambahkan)) {
                    dosen.get_tim_asdos().add_tugas(tugasYangDitambahkan);
                } else {
                    System.out.println("Tugas sudah ada");
                }
                break;
            }
        }
    }

    public void tambahProkerKEC(String prokerYangDitambahkan) {
        if (!cek_listString(this.all_kec.get_proker(), prokerYangDitambahkan)) {
            this.all_kec.add_proker(prokerYangDitambahkan);
        } else {
            System.out.println("Proker sudah ada");
        }
    }

    public void tambahMateriKEC(String materiYangDitambahkan) {
        if (!cek_listString(this.all_kec.get_materi_belajar(), materiYangDitambahkan)) {
            this.all_kec.add_materi_belajar(materiYangDitambahkan);
        } else {
            System.out.println("Materi sudah ada");
        }
    }

    public void tambahProkerplan_BEM(String prokerYangDitambahkan) {
        if (!cek_listString(this.all_bem.get_proker_plan(), prokerYangDitambahkan)) {
            this.all_bem.add_proker_plan(prokerYangDitambahkan);
        } else {
            System.out.println("Proker sudah ada");
        }
    }

    public void lakukanProker_BEM(String prokerYangDilakukan) {
        if (cek_listString(this.all_bem.get_proker_plan(), prokerYangDilakukan)) {
            this.all_bem.add_proker_do(prokerYangDilakukan);
        } else {
            System.out.println("Proker tidak ada dalam rencana");
        }
    }

    public void evalProker_BEM(String prokerYangDievaluasi) {
        if (cek_listString(this.all_bem.get_proker_do(), prokerYangDievaluasi)) {
            this.all_bem.add_eval(prokerYangDievaluasi);
        } else {
            System.out.println("Proker belum dilakukan");
        }
    }


    // Pemberian nilai total/akhir dan nilai praktikum
    public void beriNilaiTotal(String NIP_dosen, String NIM_mahasiswa, int nilai) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                for (Mahasiswa mahasiswa : dosen.get_para_mahasiswa()) {
                    if (mahasiswa.get_NIM() == NIM_mahasiswa) {
                        if (mahasiswa.get_nilai_praktikum() != 0) {
                            mahasiswa.set_nilai_total(nilai);
                        } else {
                            System.out.println(NIM_mahasiswa + " belum mendapatkan nilai praktikum");
                        }
                    }
                }
            }
        }
    }

    public void beriNilaiPraktikum(String NIP_dosen, String NIM_mahasiswa, int nilai) {
        for (Dosen dosen : para_dosen) {
            if (dosen.get_NIP() == NIP_dosen) {
                for (Mahasiswa mahasiswa : dosen.get_para_mahasiswa()) {
                    if (mahasiswa.get_NIM() == NIM_mahasiswa) {
                        mahasiswa.set_nilai_praktikum(nilai);
                    }
                }
            }
        }
    }


    // Metode pengecekan mahasiswa dan string pada list
    public boolean cek_mahasiswa(String NIMyangDicek, ArrayList<Mahasiswa> listnya) {
        for (Mahasiswa mahasiswa : listnya) {
            if (mahasiswa.get_NIM() == NIMyangDicek) {
                return true;
            }
        }
        return false;
    }

    public boolean cek_mahasiswa(String NIMyangDicek, Dosen dosen) {
        for (Mahasiswa mahasiswa : dosen.get_para_mahasiswa()) {
            if (mahasiswa.get_NIM() == NIMyangDicek) {
                return true;
            }
        }
        return false;
    }

    public boolean cek_mahasiswa(String NIMyangDicek, Asdos asdos) {
        for (Mahasiswa mahasiswa : asdos.get_team()) {
            if (mahasiswa.get_NIM() == NIMyangDicek) {
                return true;
            }
        }
        return false;
    }

    public boolean cek_mahasiswa(String NIMyangDicek, KEC kec) {
        for (Mahasiswa mahasiswa : kec.get_anggota()) {
            if (mahasiswa.get_NIM() == NIMyangDicek) {
                return true;
            }
        }
        return false;
    }

    public boolean cek_mahasiswa(String NIMyangDicek, BEM bem) {
        for (Mahasiswa mahasiswa : bem.get_anggota()) {
            if (mahasiswa.get_NIM() == NIMyangDicek) {
                return true;
            }
        }
        return false;
    }

    public boolean cek_listString(ArrayList<String> listnya, String theString) {
        for (String setering : listnya) {
            if (setering == theString) {
                return true;
            }
        }
        return false;
    }


    // Setter dan getter
    public void set_para_dosen(ArrayList<Dosen> para_dosen) {
        this.para_dosen = para_dosen;
    }

    public void add_para_dosen(Dosen para_dosen) {
        this.para_dosen.add(para_dosen);
    }

    public void set_para_mahasiswa(ArrayList<Mahasiswa> para_mahasiswa) {
        this.para_mahasiswa = para_mahasiswa;
    }

    public void add_para_mahasiswa(Mahasiswa para_mahasiswa) {
        this.para_mahasiswa.add(para_mahasiswa);
    }

    public void set_all_kec(KEC all_kec) {
        this.all_kec = all_kec;
    }

    public void set_all_bem(BEM all_bem) {
        this.all_bem = all_bem;
    }

    public ArrayList<Dosen> get_para_dosen() {
        return this.para_dosen;
    }

    public KEC get_all_kec() {
        return this.all_kec;
    }

    public BEM get_all_bem() {
        return this.all_bem;
    }

    public ArrayList<Mahasiswa> get_para_mahasiswa() {
        return this.para_mahasiswa;
    }
}
