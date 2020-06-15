public class Main {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Animal animal = new Animal("Frida", 3);
        System.out.println(animal);
        
        Dog dog = new Dog("Sophie", 7, "Yorkshire", "Calm", 12);
        System.out.println(dog);
        
        Cat cat = new Cat("Miah", 8, "Persian", "Long hair", 4);
        System.out.println(cat);
    }
}