package mdarrayjava;

/**
 *
 * @author jovan
 */
public class MDArrayJava {

    public static void main(String[] args) {
        //One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
        //Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
            thirdArray};
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
            sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
            ninthArray};
        //Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1,
            twoDimensionalArray2, twoDimensionalArray3};

        for(int i = 0; i < threeDimensionalArray.length; i++){
            System.out.print("{");
            for(int j = 0; j < twoDimensionalArray1.length; j++){
                System.out.print("{");
                for(int k = 0; k < fisrtArray.length; k++){
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.print("} ");
            }
            System.out.println("}");
        }
    }
}

/*
Jawaban:
Array 3 dimensi dapat di print dengan menggunakan for di dalam for di dalam for
For terluar berfungsi untuk menampilkan dimensi ketiga, for di dalam nya berfungsi
untuk menampilkan dimensi kedua, dan for terdalam berfungsi untuk menampilkan
dimensi kesatu
*/