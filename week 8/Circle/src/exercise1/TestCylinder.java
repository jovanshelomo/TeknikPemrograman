package exercise1;

/**
 *
 * @author jovan
 */
public class TestCylinder {

    public static void main(String args[]) {
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());
        
        System.out.println(c1);
        System.out.println(c2);
        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
    }
}

/*
Jawaban:
1.1
menambahkan variable color dengan private String color
Menambahkan constructor Circle(double radius, String color)
Menambahkan getter dan setter untuk color: getColor, setColor
1.2
Melakukan Override getArea dengan annotation @Override kemudian diikuti dengan
method yang akan di override
Menggunakan super.getArea pada getVolume sehingga tetap menggunakan getArea dari parent
1.3
Menambahkan method toString dengan melakukan Override
*/