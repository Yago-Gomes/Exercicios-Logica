public class Animal {

    protected String name;
    protected int age;
    
    public Animal() {
        super();
    }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String Name) {
        this.name = name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nAge: " + this.age
             + "\n";
    }
}