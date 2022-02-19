package floatingpoint;

public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
    }
}

/*
Jawaban:
1. nilai nx setelah digunakan Math.round(x) adalah 93 karena method Math.round
   berfungsi untuk membulatkan angka ke bawah jika angka tersebut kurang dari 0.5
   dan untuk angka yang lebih atau sama dengan 0.5 akan dibulatkan angka ke atas.

2. cast dibutuhkan karena variable yang menjadi parameter pada Math.round adalah
   double. Perlu diketahui bahwa double merupakan tipe data yang valuenya dapat
   melebihi nilai dari integer, yaitu long dengan ukuran memori 8 byte. Sedangkan
   float adalah tipe data yang dapat menyimpan value sebesar 4 byte, sama seperti
   integer.
   Method dari Math.round merupakan salah satu contoh dari method overloading,
   yakni method yang dapat memproses lebih dari 1 tipe data yaitu float dan double.
   Ketika Math.round diisi dengan double, maka method tersebut akan mengembalikan nilai
   dalam bentuk long, sedangkan jika diisi dengan float, maka akan mengembalikan nilai
   int. Sehingga type cast diperlukan untuk mengconvert long ke int dikarenakan input
   dari Math.round adalah double yang mereturn long.
*/