package restaurantmain;

import java.util.Arrays;

/**
 *
 * @author jovan
 */
public class Restaurant {
    // mengganti variable menjadi private
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    //variable static diubah menjadi non static
    private byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
        // nextId langsung dipanggil sesudah selesai menambah menu makanan
        nextId();
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String pesanMakanan(byte id, int jumlah) {
        if (id <= this.id) {
            if (getStok(id) < jumlah) {
                return "Maaf, " + nama_makanan[id] + " hanya tersisa " + getStok(id) + " buah";
            } else {
                stok[id] -= jumlah;
                return nama_makanan[id] + " x" + jumlah + " = Rp." + (getHarga(id) * jumlah);
            }
        }else{
            return "Maaf, makanan dengan id " + id + " tidak tersedia";
        }
    }

    public String pesanMakanan(String namaMakanan, int jumlah) {
        byte idMakanan = (byte)Arrays.asList(nama_makanan).indexOf(namaMakanan);
        if(idMakanan == -1){
            return "Maaf, makanan dengan nama " + namaMakanan + " tidak tersedia";
        }
        return pesanMakanan(idMakanan, jumlah);
    }

    public int getStok(byte id){
       return stok[id]; 
    }
    
    public double getHarga(byte id){
        return harga_makanan[id];
    }
    
    public void tambahStok(int id, int jumlah){
        stok[id] += jumlah;
    }

    public void nextId() {
        this.id++;
    }
}