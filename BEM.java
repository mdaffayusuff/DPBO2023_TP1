import java.util.ArrayList;

public class BEM {
    private ArrayList<String> proker_plan;
    private ArrayList<String> proker_do;
    private ArrayList<String> eval;
    private ArrayList<Mahasiswa> anggota;

    public BEM() {
        this.proker_plan = new ArrayList<String>();
        this.proker_do = new ArrayList<String>();
        this.eval = new ArrayList<String>();
        this.anggota = new ArrayList<Mahasiswa>();
    }
    
    public BEM(ArrayList<String> proker_plan, ArrayList<String> proker_do, ArrayList<String> eval, ArrayList<Mahasiswa> anggota) {
        this.proker_plan = proker_plan;
        this.proker_do = proker_do;
        this.eval = eval;
        this.anggota = anggota;
    }

    public void set_proker_plan(ArrayList<String> proker_plan) {
        this.proker_plan = proker_plan;
    }

    public void add_proker_plan(String proker_plan) {
        this.proker_plan.add(proker_plan);
    }

    public void set_proker_do(ArrayList<String> proker_do) {
        this.proker_do = proker_do;
    }

    public void add_proker_do(String proker_do) {
        this.proker_do.add(proker_do);
    }

    public void set_eval(ArrayList<String> eval) {
        this.eval = eval;
    }
    
    public void add_eval(String eval) {
        this.eval.add(eval);
    }
    
    public void set_anggota(ArrayList<Mahasiswa> anggota) {
        this.anggota = anggota;
    }
    
    public void add_anggota(Mahasiswa anggota) {
        this.anggota.add(anggota);
    }

    public ArrayList<String> get_proker_plan() {
        return this.proker_plan;
    }
    
    public ArrayList<String> get_proker_do() {
        return this.proker_do;
    }

    public ArrayList<String> get_eval() {
        return this.eval;
    }

    public ArrayList<Mahasiswa> get_anggota() {
        return this.anggota;
    }

}
