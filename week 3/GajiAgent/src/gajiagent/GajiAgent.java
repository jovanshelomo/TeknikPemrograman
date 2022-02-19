package gajiagent;
import java.util.Scanner;
/**
 *
 * @author jovan
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int gaji = 500000;
        final int hargaItem = 50000;
        
        int penjualan = sc.nextInt();

        if(penjualan > 80){
            gaji += penjualan * hargaItem * 35 / 100;
        }else if(penjualan >= 40){
            gaji += penjualan * hargaItem * 25 / 100;
        }else if(penjualan < 15){
            gaji -= ((15-penjualan)*hargaItem) * 15 / 100;
        }else{
            gaji += penjualan * hargaItem * 10 / 100;
        }
        
        System.out.println(gaji);
    }
    
}

/*
Jawaban:
Program akan menerima berapa banyak jumlah penjualan yang diraih oleh agent
Pertama, jika penjualan di atas 80, maka gajinya akan ditambahkan sebanyak 35%
untuk setiap item nya
Kedua, jika penjualan tidak di atas 80 namun setidaknya menjual 40, maka gajinya
ditambahkan sebanyak 25% untuk setiap itemnya
Ketiga, jika penjualan kurang dari 15, maka gaji akan dikurangi sebanyak 15%
untuk setiap item yang tidak mencapai target penjualan 15 item
Keempat, jika penjualan di antara 15 dan 40, maka gajinya ditambahkan sebanyak
10% untuk setiap itemnya
*/