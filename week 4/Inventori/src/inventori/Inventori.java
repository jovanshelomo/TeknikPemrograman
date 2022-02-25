package inventori;

/**
 *
 * @author jovan
 */
public class Inventori {
    Barang[] barangs;
    
   void initBarang(){
       barangs = new Barang[2];
       barangs[0] = new Barang("001", "Baju", 10);
       barangs[1] = new Barang("002", "Celana", 20);
   }
   
   void showBarang(){
       System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
       System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
   }
   
   void pengadaan(){
       initBarang();
       
//       barangs[0].stok += 20;
//       barangs[0].stok -= 30; //Bisa juga dikurangi dong?
//       barangs[0].stok *= 30; //dikali juga bisa dong??
       barangs[0].tambahStok(20);
       showBarang();
   }
   
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
    
}

/*
Jawaban:
Cara agar suatu variable tidak dapat diubah-ubah secara sembarangan dari luar
adalah dengan mengubah access modifier variable stok yang tadinya default menjadi
private sehingga tidak bisa di akses oleh class lain selain class nya sendiri.
Selain itu, perlu juga dilakukan enkapsulasi agar value tetap dapat dimanipulasi
namun terbatas hanya oleh method class itu sendiri. Pada kasus ini, stok hanya
bisa ditambah dan tidak dapat dilakukan operasi aritmatika lainnya. Caranya adalah
dengan membuat suatu method yang bernama tambahStok sehingga method tersebut hanya
dapat menambahkan stok sesuai dengan argumen yang diminta
*/