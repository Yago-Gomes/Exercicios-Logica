public class Dog extends Animal {

    protected String race;
    protected String behavior;
    protected double weight;
    
    public Dog() {
        super();
    }
    
    public Dog(String name, int age, String race, String behavior, double weight) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.behavior = behavior;
        this.weight = weight;
    }
    
    public String getRace() {
        return this.race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    public String getBehavior() {
        return this.behavior;
    }
    
    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double calculateAgeInMonths() {
        return this.age * 12;
    }
    
    public double calculateWeightInGrams() {
        return this.weight * 1000;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nAge: " + this.age
             + "\nRace: " + this.race
             + "\nBehavior: " + this.behavior
             + "\nWeight: " + this.weight
             + "\nAge in Months: " + this.calculateAgeInMonths()
             + "\nWeight in Grams: " + this.calculateWeightInGrams()
             + "\n";
    }
}