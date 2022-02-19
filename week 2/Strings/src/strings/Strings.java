package strings;
import java.util.Scanner;
/**
 * This program prints:
 * - sum of length of 2 strings
 * - a lexicographically greater than b
 * - a and b separated by space with first letter of each word uppercased
 * @author jovan
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b;
        a = sc.next();
        b = sc.next();
        
        //print sum of length
        System.out.println(a.length() + b.length());
        
        //print whether a lexicographically greater than b
        System.out.println(a.compareTo(b)>0?"Yes":"No");
        
        //print a and b with both first letter uppercased separated by space
        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(a + " " + b);
    }
}

/*
Jawaban:
Untuk menjumlahkan kedua panjang huruf dapat menggunakan a.length() + b.length()

Untuk mengecek apakah a lexicographically lebih besar dari b dapat menggunakan
method yang sudah tersedia dari string itu sendiri, yaitu compareTo yang akan
menghasilkan integer, jika > 0 maka lexicographically lebih besar, jika = 0 maka
string tersebut sama, jika < 0 maka lexicographically lebih kecil.

Untuk memprint kedua kata digabungkan dengan spasi dengan masing-masing kata
menggunakan huruf kapital pada depannya, mengingat string pada java merupakan
variable yang immutable, artinya huruf tidak dapat dimutasi langsung, tetapi hanya
dapat di replace, kita dapat mengakalinya dengan menggunakan substring huruf pertama
yang dijadikan huruf kapital ditambah dengan sisa huruf tersebut untuk kedua
string a dan b. Kemudian untuk menggabungkannya dengan spasi dapat menggunakan
a + " " + b
*/