package exercise2;

/**
 *
 * @author jovan
 */
public class Shape {

    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String c, boolean f) {
        this.color = c;
        this.filled = f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + (this.filled ? "filled" : "not filled");
    }
}
