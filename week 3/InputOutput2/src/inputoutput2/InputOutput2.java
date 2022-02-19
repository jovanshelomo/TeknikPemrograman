package inputoutput2;
import java.util.Scanner;
/**
 *
 * @author jovan
 */
public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[3];
        int num[] = new int[3];
        for(int i = 0; i < 3; i++){
            str[i] = sc.next();
            num[i] = sc.nextInt();
        }
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-15s%03d\n", str[i], num[i]);
        }
        System.out.println("================================");
    }
}

/*
Jawaban:
Soal ini mengambil 3 baris input yang setiap barisnya mengambil 1 kata dan 1 angka.
Setiap kata yang diinput disimpan ke dalam array of string dan angka yang
diinput dimasukkan ke dalam array of int. Setelah semua input selesai, dengan
menggunakan for loop, angka-angka tersebut di print dengan menggunakan printf
yang berisi perintah "%-15s%03d\n" dengan argumen kata ke-i dan angka ke-i
-15s berfungsi untuk menampilkan string dengan panjang tepatnya 15 serta
     jika string tersebut kurang maka akan ditambahkan padding pada bagian kanannya
%03d berfungsi untuk menampilkan angka sebanyak tepatnya 3 digit yang akan
     ditambahkan padding "0" pada sebelah kirinya jika ternyata angka sebenarnya
     kurang dari 3 digit
*/