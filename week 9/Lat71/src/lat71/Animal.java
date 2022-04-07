/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat71;

/**
 *
 * @author jovan
 */
public class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}

/*
Jawaban:
Cat dan horse sama-sama merupakan subclass dari Animal. Ketika terdapat method
yang di override, maka method yang akan dijalankan adalah method yang telah di
override walaupun dilakukan polymorphism ke Animal. Polymorphism dilakukan
ketika runtime karena program tidak mengetahui sebelumnya apakah object cat akan
diubah bentuk menjadi Animal
*/