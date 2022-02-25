package upinipin;

/**
 *
 * @author jovan
 */
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}

/*
Jawaban:
Pada file Item ini terdapat 2 buah constructor overloading. constructor pertama
adalah constructor tanpa parameter yang langsung mengubah isi dari variable name
menjadi "Ipin", namun constructor satu lagi yang memiliki argumen String hanya
menampilkan this.name sehingga tidak terdapat pengubahan name sama sekali.
Cara agar constructor tanpa argumen tersebut terpanggil melalui salah satu
constructor overloadingnya, cukup memanggil this() pada constructor dengan parameter
String sehingga constructor yang tanpa argument dapat terpanggil juga.
*/