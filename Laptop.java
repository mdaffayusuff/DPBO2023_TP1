public class Laptop {
    private String merk;
    private String tipe;
    private String no_model;

    public Laptop() {
        this.merk = "";
        this.tipe = "";
        this.no_model = ""; 
    }
    
    public Laptop(String merk, String tipe, String no_model) {
        this.merk = merk;
        this.tipe = tipe;
        this.no_model = no_model; 
    }

    public void set_merk(String merk) {
        this.merk = merk;
    }

    public void set_tipe(String tipe) {
        this.tipe = tipe;
    }

    public void set_no_model(String no_model) {
        this.no_model = no_model;
    }

    public String get_merk(String merk) {
        return this.merk;
    }
    
    public String get_tipe() {
        return this.tipe;
    }

    public String get_no_model() {
        return this.no_model;
    }

}
