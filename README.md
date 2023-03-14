# **DPBO TP1**
### **NIM : 2100543**
### **Nama : Muhammad Daffa Yusuf Fadhilah**

Saya **_Muhammad Daffa Yusuf_** Fadhilah dengan **_NIM 2100543_** mengerjakan evaluasi **_TP1_**
dalam mata kuliah **_Design Pemrograman Berorientasi Objek 2023_**
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti
yang telah dispesifikasikan. Aamiin.

## **Struktur Kelas**

![DiagramClass](https://github.com/mdaffayusuff/DPBO2023_TP1/blob/main/TP1.jpg?raw=true)

### **Kelas-kelas Aksesoris (Spidol, Buku, dan Laptop)**
Kelas-kelas aksesoris ini dibentuk utnuk menimpan data aksesoris sebagai objek. Pembuatan 3 kelas ini derdasarkan keterangan barang yang dibawa oleh Mahasiswa dan/atau Dosen pada soal

### **Kelas Mahasiswa**
Kelas **Mahasiswa** merupakan kelas objek yang menyimpan data seterti nim, nama , jenis kelamin dan atribut lainnya yang dibutuhkan oleh mahasiswa. Mahasiswa juga menggunakan class lain (**Buku dna Laptop**) sebagai penanda bahwa mahasiswa memiliki dan membawa barang tersebut seperti keterangan pada soal

### **Kelas KEC**
Kelas **KEC** merupakan kelas yang menyimpan data KEC seperti materi pembelajaran, proker yang dilakukan, dan anggota yang mana menggunakan kelas **Mahasiswa** sebagai objek data yang ditampung

### **Kelas BEM**
Sama seperti kelas **KEC**, kelas **BEM** merupakan kelas yang menyimpan data BEM seperti rencana proker `proker_plan`, proker yang dijakankan `proker_do`, proker yang dievaluasi `eval`, dan anggota yang mana sama seperti kelas **KEC**, menggunakan kelas **Mahasiswa** sebagai obejk data yang ditampung

### **Kelas Asdos**
Kelas **Asdos** merupakan kelas yang menjadi kumpulan data asdos dari seorang dosen dimana berisikan materi pembelajaran, tugas yang diberikan, dan anggota tim asdos yang sama seperti kelas **KEC dan BEM**, menggukana kelas **Mahasiswa** untuk objek data yang ditampung

### **Kelas Dosen**
Kelas **Dosen** merupakan kelas yang menyimpan attribut dosen yang umum seperti NIP, Nama, jenis kelamin, dan lain-lain. Selain attribut tersebut, Dosen juga menggunkana kelas-kelas lain untuk menunjukan kepemilikian seperti kelas **Laptop, Spidol, Mahasiswa, dan Asdos**. Dengan kelas **Mahasiswa dan Asdos** dicomposite pada kelas **Dosen**, maka kita dapat mengakses mahasiswa diajar suatu dosen dan asdos yang membentu suatu dosen dengan hanya mengakses data dosen tersebut

## **Eksekusi**
Untuk eksekusi, saya menambahkan 2 kelas yang mana hanya digunakan untuk memproses data agar lebih mudah dan tidak berantakan. 
- Kelas **Main** diaman ini merupakan tempat program diinisalisasikan. 
- Kelas **theProcess** menampung data Mahasiswa, Dosen, Asdos, BEM, dan KEC, sehingga dapat lebih mudah diakses oleh kelas **Main**. Proses seperti memasukan mahasiswa kedalam data dosen, memasukan objek mahasiswa kedalam objek kelas lain dan sebagainya akan melalui kelas **theProcess** ini

## **Hasil Eksekusi**
![Output](https://github.com/mdaffayusuff/DPBO2023_TP1/blob/main/output.png?raw=true)
catatan : untuk materi, proker dan tugas belum ditambahkankedalam inputan yang menyebabkan bagian tersebut kosong

## **Fitur tambahan lain**
Terdapat fitur-fitur tambahan yang dibuat dalam kelas **theProcess** yaitu :
- Otomatis menambahkan mahasiswa kedalam list keseluruhan mahasiswa (jika belum ada pada list tersebut) ketika mahasiswa tersebut dimasukan kedalam class Dosen, Asdos, BEM, dan KEC.
- Mencek terlebih dahulu apakah mahasiswa sudah dimasukan sedalam list anggota/mahasiswa/tim_asdos sehingga tidak ada redundansi data maahsiswa pada suatu list.
- Untuk kelas **BEM**, tidak dapat menambahkan proker yang sedang dijalankan `proker_do` jika proker itu tidak terdapat pada proker yang direncanakan `proker_plan`. Dan tidak dapat menambhkan proker yang dievaluasi `eval` jika proker tersebut belum ada pada proker yang dijakankan `proker_do`.
- Nilai total/akhir dari mahasiswa tidak dapat diubah selama nilai_praktikum masih 0