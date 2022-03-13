package narutoanime;

/**
 *
 * @author jovan
 */
public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    
    void printDojutsu(){
        //menambah super.printDojutsu agar dojutsu dari Itachi juga terpanggil
        super.printDojutsu();
        System.out.println(this.Dojutsu);
    }
}