package exercise2;

/**
 *
 * @author jovan
 */
public class Main {
    public static void main(String[] args) {
       Shape s;
       s = new Shape();
        System.out.println(s.getColor());
        s.setColor("red");
        System.out.println(s.getColor());
        System.out.println(s.isFilled());
        s.setFilled(false);
        System.out.println(s.isFilled());
        System.out.println(s);
    }
  
}
