package narutoanime;

/**
 *
 * @author jovan
 */
public class NarutoAnime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sasuke s = new Sasuke();
        s.printDojutsu();
        Itachi i = new Sasuke();
        i.printKekkeiGenkai();
    }
}

/*
Jawaban:
Pada class Itachi.java, pada method printDojutsu, di antara 2 buah System.out.println(this.Dojutsu);
ditambahkan setDojutsu() agar dijutsu berubah ketika print kedua kalinya

Pada class Sasuke.java, pada printDojutsu, sebelum System.out.println(this.Dojutsu);
ditambahkan super.printDojutsu() agar dojutsu pada itachi dapat dilakukan terlebih
dahulu sebelum dojutsu sharingan dilakukan

Sehingga, Rinnegan akan dikeluarkan oleh printDojutsu() pada Itachi.java, kemudian
dikarenakan adanya setDojutsu, maka dojutsu akan berubah menjadi Mangekyou Sharingan
yang kemudian di print kembali. Kemudian, printDojutsu pada Itachi.java dapat
dipanggil oleh Sasuke.java dengan menggunakan super.printDojutsu(). Dan akhirnya,
printDojutsu pada Sasuke.java akan dipanggil oleh NarutoAnime.java sehingga akan
mengoutputkan Rinnegan, Mangekyou Sharingan, dan Sharingan. Terakhir, karena adanya
polymorphism, objek Itachi dapat dibuat menggunakan Sasuke dan dapat dipanggil
printKekkeiGenkai untuk memprint Susanoo

*/