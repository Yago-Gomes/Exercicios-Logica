public class Rectangle {
    
    private double height;
    private double base;
    
    public Rectangle() {
    }
    
    public Rectangle(double height, double base) {
        setHeight(height);
        setBase(base);
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = (height>1) ? height : 0;
    }
    
    public double getBase() {
        return this.base;
    }
    
    public void setBase(double base) {
        this.base = (base>1) ? base : 0;
    }
    
    public double calculateArea() {
        return this.base * this.height;
    }
    
    public double calculatePerimeter() {
        return 2 * (this.base + this.height); 
    }
    
    @Override
    public String toString() {
        return "Height: " + this.height
              + "\nBase: " + this.base
              + "\nArea: " + this.calculateArea()
              + "\nPerimeter: " + this.calculatePerimeter();
    }
}