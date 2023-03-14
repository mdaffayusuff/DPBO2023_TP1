/*Saya Muhammad Daffa Yusuf Fadhilah dengan NIM 2100543 mengerjakan evaluasi TP 1 
dalam mata kuliah Design Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin. */

// Class buku
public class Buku {

    // Attribut private
    private String judul;
    private String penulis;
    private String penerbit;

    // Constructor Kosong
    public Buku() {
        this.judul = "";
        this.penulis = "";
        this.penerbit = "";
    }
    
    // COnstructor dengan parameter
    public Buku(String judul, String penulis, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    // Setter dan getter
    public void set_judul(String judul) {
        this.judul = judul;
    }

    public void set_penulis(String penulis) {
        this.penulis = penulis;
    }

    public void set_penerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String get_judul() {
        return this.judul;
    }
    
    public String get_penulis() {
        return this.penulis;
    }

    public String get_penerbit() {
        return this.penerbit;
    }

}
