package bignumber;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author jovan
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
    
}

/*
Jawaban:
Untuk menggunakan BigInteger, pertama yang harus dilakukan adalah membuat objek
BigInteger yang constructornya diisi dengan string yang merepresentasikan integer.
String ini di scan melalui scanner next()
Setelah 2 buah angka di scan dan dijadikan menjadi BigInteger, hal selanjutnya
adalah menambahkan angka a dan angka b yaitu menggunakan method add yang terdapat
pada BigInteger dan juga untuk perkalian menggunakan method multiply yang semuanya
sudah tersedia ketika objek BigInteger dibuat.
*/