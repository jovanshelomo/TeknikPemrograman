/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat72;

/**
 *
 * @author jovan
 */
public class MethodOverloading {
    public static void main(String[] args) {
        Overload Obj = new Overload();
        double result;
        Obj.demo(10);
        Obj.demo(10,20);
        result = Obj.demo(5.5);
        System.out.println("O/P : " + result);
    }
}

/*
Jawaban:
Method overloading dapat juga dikatakan sebagai static polymorphism dikarenakan
setiap pemanggilan method telah dilakukan binding kepada method yang bersangkutan
*/