package constants;

public class Constants {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
Jawaban:
1. output dari masing-masing class adalah sama, yaitu "Paper size in centimeters: 21.59 by 27.94".
2. Perbedaan pengggunaan final double dan public static final double adalah pada use case nya.
   Final double merupakan variable konstanta biasa yang angkanya tidak dapat diubah, sedangkan
   public static final double adalah variable yang dimiliki oleh class itu sendiri sehingga
   pengaksesannya tidak memerlukan pembuatan objek baru. Walaupun ada objek yang dibuat, variable
   static akan selalu sama di seluruh objek yang telah dibuat tersebut. 
   perbedaan dari penggunaan public static final dan public final adalah pada penggunaan memory
   dan bagaimana static bekerja. Sebenarnya, ketika keyword static dimasukkan kedalam sebuah final,
   tidak akan terlihat perbedaan yang terlalu mencolok, namun ketika static tersebut adalah
   variable biasa, variable ini mempertahankan valuenya di semua class, dan bahkan variabe ini
   juga dapat di akses walaupun objek dari class tidak dibuat. 
*/