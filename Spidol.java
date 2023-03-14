/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP1 
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

// Class Spidol
public class Spidol {

    // Attribut Private
    private String merk;
    private String warna;

    // COnstructor kosong
    public Spidol() {
        this.merk = "";
        this.warna = "";
    }
    
    // Constructor dengan parameter
    public Spidol(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    // Setter dan getter
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
