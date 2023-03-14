/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP1
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

// Class Laptop
public class Laptop {

    // Attribut private
    private String merk;
    private String tipe;
    private String no_model;

    // Constructor kosong
    public Laptop() {
        this.merk = "";
        this.tipe = "";
        this.no_model = "";
    }
    
    // Constructor dengan parameter
    public Laptop(String merk, String tipe, String no_model) {
        this.merk = merk;
        this.tipe = tipe;
        this.no_model = no_model;
    }

    // Setter dan getter
    public void set_merk(String merk) {
        this.merk = merk;
    }

    public void set_tipe(String tipe) {
        this.tipe = tipe;
    }

    public void set_no_model(String no_model) {
        this.no_model = no_model;
    }

    public String get_merk() {
        return this.merk;
    }
    
    public String get_tipe() {
        return this.tipe;
    }

    public String get_no_model() {
        return this.no_model;
    }

}
