package bukatutupjalan;
import java.util.Scanner;
/**
 *
 * @author jovan
 */
public class BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String gabungan = sc.nextLine();
        gabungan = gabungan.replace(" ", "");
        long converted = Long.parseLong(gabungan);
        if(converted%5 == 0){ //(converted-999999)%5 == 0 menghasilkan jawaban terbalik dari sample output
            System.out.println("berhenti");
        }else{
            System.out.println("jalan");
        }
    }
    
}

/*
Jawaban:
Ketika plat nomor digabungkan, maka jumlah angka maksimumnya adalah 16 digit
sehingga tipe data yang paling cocok untuk digunakan adalah long karena dapat
menampung hingga 19 digit.
Untuk pengecekan hasil sisa dibagi 5 dapat menggunakan operator modulo yang
tujuannya untuk mendapatkan hasil sisa bagi
*/