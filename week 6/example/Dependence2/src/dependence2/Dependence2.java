/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependence2;

/**
 *
 * @author jovan
 */
public class Dependence2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player p = new Player();
        Die d = new Die();
        p.TakeTurn(d);
    }
    
}
