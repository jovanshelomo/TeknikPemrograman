/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dependence;

/**
 *
 * @author jovan
 */
public class Dependence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a = new Account();
        Customer c = new Customer();
        c.makeDeposit(a);
    }
    
}
