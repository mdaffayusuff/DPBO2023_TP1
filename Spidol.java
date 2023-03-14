public class Spidol {
    private String merk;
    private String warna;

    public Spidol() {
        this.merk = "";
        this.warna = "";
    }
    
    public Spidol(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public void set_merk(String merk) {
        this.merk = merk;
    }

    public void set_warna(String warna) {
        this.warna = warna;
    }

    public String get_merk() {
        return this.merk;
    }
    
    public String get_warna() {
        return this.warna;
    }

}
