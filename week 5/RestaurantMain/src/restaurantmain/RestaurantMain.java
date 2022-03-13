package restaurantmain;

/**
 *
 * @author jovan
 */
public class RestaurantMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        menu.tampilMenuMakanan();

        System.out.println("\npesan makanan: Bala-Bala 5 buah");
        System.out.println(menu.pesanMakanan("Bala-Bala", 5) + "\n");

        menu.tampilMenuMakanan();
        
        System.out.println("\npesan makanan: Ubi Goreng 10 buah");
        System.out.println(menu.pesanMakanan("Ubi Goreng", 10)+ "\n");
        
        menu.tampilMenuMakanan();

        System.out.println("\npesan makanan: Tahu 10 buah");
        System.out.println(menu.pesanMakanan("Tahu", 10) + "\n");

        menu.tampilMenuMakanan();
    }
}

/*
Jawaban:
1. Beberapa hal pada Restaurant.java masih belum mengikuti konspe OOP yang benar
   - Semua variable public diubah enkapsulasinya menjadi private
     Dalam pembuatan class yang baik, variable member dari class tersebut haruslah private,
     kecuali sangat-sangat dibutuhkan untuk dijadikan public. Ketika variable dijadikan private,
     maka akan terjadi lebih sedikit bug yang mungkin terjadi karena flow dari setiap data dapat
     diverifikasi oleh class tersebut, selain itu juga dengan mengubah enkapsulasi menjadi private
     dapat menjaga isi variable agar tidak diubah secara sembarangan oleh pihak yang tidak seharusnya
     mengakses hal tersebut. Selain itu, dengan adanya private dapat meningkatkan abstraksi dari data
     sehingga data-data yang tidak diperlukan untuk diakses dari luar dapat disembunyikan
   - Mengganti nextId menjadi di dalam tambahMenuMakanan sehingga menu akan tertambah secara otomatis
     Dalam pembuatan class yang benar, abstraksi harus dipikirkan secara matang sehingga tidak
     merepotkan pemanggil objek tersebut
   - mengubah id dari static menjadi non-static agar setiap objek yang dibuat memiliki id mulai dari 0
     variable static digunakan untuk kasus-kasus tertentu dimana setiap objek dapat mengakses variable
     yang sama, namun dalam hal ini, id berupa jumlah makanan di dalam menu harusnya non-static karena
     ketika kita ingin membuat menu lain, penambahan menu pada objek tersebut akan kembali dimulai dari
     0 dan juga penambahan menu di beberapa class tidak akan menimbulkan bug.
   - Menambahkan getter dan setter sesuai dengan keperluan, tidak membuka akses secara keseluruhan
     Getter dan setter diperlukan agar variable private dapat diakses secara terbatas dan pengubahan
     serta pembacaannya dapat tervalidasi oleh method yang memberikan aksesnya tersebut sehingga tidak
     akan menimbulkan bug

   Pemanbahan fitur pemesanan makanan dengan desain yang sudah ada tidak terlalu sulit untuk dilakukan
   karena semua data-data yang diperlukan sudah tersedia dan juga pengurangan stok makanan dapat dilakukan
   secara mudah. Namun, dengan desain yang telah saya modifikasi, pengaksesan nama makanan dan stok
   makanan dapat dilakukan melalui method dan membuat desain menjadi lebih rapi
*/

