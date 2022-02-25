/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelasdua;

/**
 *
 * @author jovan
 */
public class KelasDua {
    {
        System.out.println(5);
    }
    public static void main(String[] args) {
        System.out.println(6);
        KelasSatu satu = new KelasSatu();
        KelasSatu dua = new KelasSatu(10);
    }
    
}

/*
Jawaban:
Urutan dari hasil run adalan 6, 2, 11, 4, 11, 3. Dimana 6 berasal dari main, dan
2 hingga 3 berasal dari KelasSatu. Static initialization block (2) akan dijalankan
ketika class pertama kali di inisialisasi kemudian diikuti oleh initialization
block biasa (11). Setelah initialization block dijalankan, maka terakhir adalah
constructor yang dijalankan. Static initialization block hanya dijalankan tepat
sekali ketika class dimuat. Pembuatan object dari class yang sama tidak akan
memanggil kembali static initialization block, namun initialization block tetap
akan terpanggil pada setiap pembuatan object baru. Hal terakhir yang harus
diperhatikan adalah initialization block pada KelasDua tidak terpanggil, hal ini
disebabkan oleh tidak adanya pembuatan objek baru dari KelasDua, yang ada hanyalah
pemanggilan main sehingga initialization block pada KelasDua tidak jalan. Hal
tersebut akan jalan hanya jika ada pembuatan objek dari KelasDua atau digantinya
initialization block menjadi static initialization block
*/