package convertdatatype;

public class ConvertDataType
{
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

/*
1. output nilai dari variable b adalah 10. Hal ini terjadi karena adanya precision
   loss (lossy convertion) ketika convert data yang memiliki presisi tinggi ke
   presisi rendah  (long menjadi float, desimal menjadi bilangan bulat) sehingga
   jika dilihat dari code ini, presisi sebenarnya mulai menghilang pada tahap
   casting double d ke float f, namun karna angkanya masih kecil sehingga
   kehilangan presisinya tidak terlihat oleh mata telanjang. Kemudian perbedaan
   yang sangat terlihat adalah ketika float f di cast menjadi long pada parameter
   karena long tidak support penyimpanan bilangan real.

2. Pertama 10.25d dari double d di cast menjadi float f yang hasilnya menjadi 10.25f,
   kemudian 10.25f tersebut di cast menjadi long sebagai parameter yang hasilnya
   mejadi 10, kemudian long tersebut masuk kedalam method methodOne dimana long
   tersebut di cast menjadi int i yang hasilnya menjadi 10,
   kemudian integer tersebut di cast menjadi short yang hasilnya tetap menjadi 10,
   kemudian short tersebut di return ke modul utama yang hasilnya di cast menjadi
   byte b yang hasilnya menjadi 10. kemudian variable b di print sehingga menghasilkan
   angka 10 pada stdout.
*/