import java.util.ArrayList;

public class Asdos {
    private ArrayList<String> materi_belajar;
    private ArrayList<String> tugas;
    private ArrayList<Mahasiswa> team;

    public Asdos() {
        this.materi_belajar = new ArrayList<String>();
        this.tugas = new ArrayList<String>();
        this.team = new ArrayList<Mahasiswa>();
    }
    
    public Asdos(ArrayList<String> materi_belajar, ArrayList<String> tugas, ArrayList<String> eval, ArrayList<Mahasiswa> team) {
        this.materi_belajar = materi_belajar;
        this.tugas = tugas;
        this.team = team;
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
    
    public void set_team(ArrayList<Mahasiswa> team) {
        this.team = team;
    }
    
    public void add_team(Mahasiswa team) {
        this.team.add(team);
    }

    public ArrayList<String> get_materi_belajar() {
        return this.materi_belajar;
    }
    
    public ArrayList<String> get_tugas() {
        return this.tugas;
    }

    public ArrayList<Mahasiswa> get_team() {
        return this.team;
    }

}
