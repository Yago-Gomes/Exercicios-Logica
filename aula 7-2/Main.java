public class Main {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
    
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setBase(3);
        System.out.println(rectangle);
        
        Rectangle rectangle2 = new Rectangle(4,6);
        System.out.println("\nHeight R2: " + rectangle2.getHeight()
                         + "\nBase R2: " + rectangle2.getBase());
                         
        //System.out.println(new Rectangle(4,6));
    }
}