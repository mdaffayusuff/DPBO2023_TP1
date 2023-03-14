import java.util.ArrayList;

public class KEC {
    private ArrayList<String> materi_belajar;
    private ArrayList<String> proker;
    private ArrayList<Mahasiswa> anggota;

    public KEC() {
        this.materi_belajar = new ArrayList<String>();
        this.proker = new ArrayList<String>();
        this.anggota = new ArrayList<Mahasiswa>();
    }
    
    public KEC(ArrayList<String> materi_belajar, ArrayList<String> proker, ArrayList<String> eval, ArrayList<Mahasiswa> anggota) {
        this.materi_belajar = materi_belajar;
        this.proker = proker;
        this.anggota = anggota;
    }

    public void set_materi_belajar(ArrayList<String> materi_belajar) {
        this.materi_belajar = materi_belajar;
    }

    public void add_materi_belajar(String materi_belajar) {
        this.materi_belajar.add(materi_belajar);
    }

    public void set_proker(ArrayList<String> proker) {
        this.proker = proker;
    }

    public void add_proker(String proker) {
        this.proker.add(proker);
    }
    
    public void set_anggota(ArrayList<Mahasiswa> anggota) {
        this.anggota = anggota;
    }
    
    public void add_anggota(Mahasiswa anggota) {
        this.anggota.add(anggota);
    }

    public ArrayList<String> get_materi_belajar() {
        return this.materi_belajar;
    }
    
    public ArrayList<String> get_proker() {
        return this.proker;
    }

    public ArrayList<Mahasiswa> get_anggota() {
        return this.anggota;
    }

}
