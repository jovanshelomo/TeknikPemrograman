package datatypes;
import java.util.Scanner;
/**
 * <h1>check possible data types</h1>
 * This program will check whether a given input is
 * a valid number type (byte, short, int, long)
 * and show the result in the console.
 * @author jovan
 * @version 1.0
 * @since 2022-02-10
 */
public class DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String inputs[] = new String[T];
        for(int i = 0; i < T;i++){
            inputs[i] = sc.next();
        }
        for(int i = 0; i < T; i++){
            System.out.print(inputs[i]);
            try{
                Long converted = Long.parseLong(inputs[i]);
                System.out.println(" can be fitted in:");
                //if number in byte range
                if(converted >= Byte.MIN_VALUE && converted <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                //if number in short rage
                if(converted >= Short.MIN_VALUE && converted <= Byte.MAX_VALUE){
                    System.out.println("* short");
                }
                //if number in integer range
                if(converted >= Integer.MIN_VALUE && converted <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                //number must be in long range
                System.out.println("* long");
            }catch(Exception e){
                System.out.println(" can't be fitted anywhere.");
            }
        }
    }
}

/*
Jawaban:
Pertama, testcase akan di scan menggunakan nextInt dari scanner
Kemudian, dilakukan loop sebanyak testcase yang  akan mengambil input berbentuk string
kemudian dimasukkan kedalam array of string
Setelah setiap case telah di scan, dilakukan looping kembali untuk output sebanyak testcase
Pada output, hal pertama yang  dilakukan adalah print angka yang  telah di scan ke layar
kemudian di dalam block try catch dicobakan apakah Long.parseLong dapat dilakukan
kepada string yang telah di scan, jika bisa maka  akan lanjut dengan print
" can be fitted in:". Setelah itu, dilakukan pengecekan setiap limit dari masing-masing
tipe data apakah di dalam range atau diluar range. Jika di dalam range maka print,
jika diluar range maka lanjut ke baris selanjutnya
Terakhir adalah print "* long" karena setiap angka yang dapat di convert ke long
pasti akan muat di dalam long.
Catch block akan terjadi jika angka yang diinputkan tidak sesuai atau berada di luar
range dari long yang selanjutnya akan dilakukan print " can't be fitted anywhere."
*/