public class Buku {
    private String judul;
    private String penulis;
    private String penerbit;

    public Buku() {
        this.judul = "";
        this.penulis = "";
        this.penerbit = ""; 
    }
    
    public Buku(String judul, String penulis, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit; 
    }

    public void set_judul(String judul) {
        this.judul = judul;
    }

    public void set_penulis(String penulis) {
        this.penulis = penulis;
    }

    public void set_penerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String get_judul(String judul) {
        return this.judul;
    }
    
    public String get_penulis() {
        return this.penulis;
    }

    public String get_penerbit() {
        return this.penerbit;
    }

}
