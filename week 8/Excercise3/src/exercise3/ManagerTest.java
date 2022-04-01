package exercise3;

/**
 *
 * @author jovan
 */
public class ManagerTest {

    public static void main(String[] args) {
        Manager[] staff = new Manager[3];
        staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) {
            staff[i].raiseSalary(5);
        }
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }

        Sortable.shell_sort(staff);
        System.out.println("\n");
        for (i = 0; i < 3; i++) {
            staff[i].print();
        }
    }
}


//jika manager ingin di sort, cast terlebih dahulu menjadi employee sebelum di sort


/*
Jawaban:
class Managers extends Employee extends sortable will not work karena aturan extends
pada java hanya dapat dilakukan dari satu parent class, tidak dapat dari 2 parent
class sekaligus. Namun, walaupun class Managers tidak meng extends Sortable, class
Managers tersebut tetap merupakan child dari Employee dimana class Emoloyee tersebut
merupakan child dari class Sortable, sehingga secara singkat bahwa class Manager
dapat dilakukan polymorphism ke Sortable tanpa perlu mengubah Sortable menjadi sebuah
interface.
*/