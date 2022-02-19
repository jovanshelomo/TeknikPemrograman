package berhitung;
import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String operator = sc.next();
        int b = sc.nextInt();
        int result;
        
        switch(operator){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "%":
                result = a % b;
                break;
            default:
                result = 0;
        }
        System.out.println(result);
    }
}

/*
Jawaban:
Program ini menerima input sebuah angka a , operator, dan angka b.
Cara paling efisien untuk menghandle beberapa jenis operator adalah dengan
menggunakan switch case. Di dalam switch case hasilnya akan diolah dan dimasukkan
ke dalam variable bernama result sehingga setelah switch case selesai, hasilnya
dapat langsung ditampilkan pada layar
*/