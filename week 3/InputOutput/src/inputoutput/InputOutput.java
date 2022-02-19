package inputoutput;

import java.util.Scanner;

/**
 *
 * @author jovan
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine();
        String[] separated = temp.split("[ !,?._'@]");
        System.out.println(separated.length);
        for(String s: separated){
            System.out.println(s);
        }
    }
    
}

/*
Jawaban:
Soal ini menerima input sebuah kalimat dan memecahnya menjadi beberapa kata yang
dipisahkan dengan spasi, !, ,, ?, ., _, ', dan @
Pertama program akan meminta seluruh input dengan menggunakan scanner nextLine
kemudian program akan membagi kalimat tersebut dengan menggunakan split yang
didalamnya diisi dengan regex [ !,?._'@]. Regex ini berarti bahwa kalimat akan
dipisahkan setiap bertemu spasi, tanda seru, koma, tanda tanya, titik, underscore,
petik satu, dan at
*/