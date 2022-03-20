package association;
import java.util.*;
/**
 *
 * @author jovan
 */

//membuat class person
class Person {
    private String name;
    private int age;
    private Handphone hp;

    Person(String name, int age, Handphone hp) {
        this.name = name;
        this.age = age;
        this.hp = hp;
    }

    public Handphone getHandphone() {
        return hp;
    }
}

//person memiliki handphone
class Handphone {
    private String brand;
    private String phoneNumber;
    private int ram;
    private int storage;

    Handphone(String brand, String phoneNumber, int ram, int storage) {
        this.brand = brand;
        this.phoneNumber = phoneNumber;
        this.ram = ram;
        this.storage = storage;
    }
    
    @Override
    public String toString(){
        return "Brand: " + this.brand + ", phone number: " + this.phoneNumber + ", ram: " + this.ram + ", storage: " + this.storage;
    }

}

public class Association {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handphone hp = new Handphone("Samsul", "+62 888 888 888", 12, 512);
    
        Person p = new Person("Udin", 23, hp);
        System.out.println(p.getHandphone().toString());
    }

}

/*
Jawaban:
Association adalah sebuah relationship yang menjelaskan hubungan mengenai 2 class
dimana satu class dengan lainnya dapat berdiri sendiri dan juga tidak akan rusak walaupun
salah satu tidak ada

pada kasus ini, seseorang mempunyai handphone yang keterkaitannya hanya sebatas
asosiasi
*/