public class Cat extends Animal {

    protected String race;
    protected String hairType;
    protected double weight;
    
    public Cat() {
        super();
    }
    
    public Cat (String name, int age, String race, String hairType, double weight) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.hairType = hairType;
        this.weight = weight;
    }
    
    public String getRace() {
        return this.race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    public String getHairType() {
        return this.hairType;
    }
    
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
    
    public double getWeight() {
        return this.weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double calculateAgeInDays() {
        return this.age * 365;
    }
    
    public double calculateWeightInTons() {
        return this.weight / 1000;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nAge: " + this.age
             + "\nRace: " + this.race
             + "\nHair Type: " + this.hairType
             + "\nWeight: " + this.weight
             + "\nAge in Days: " + this.calculateAgeInDays()
             + "\nWeight in Tons: " + this.calculateWeightInTons()
             + "\n";
    }
}
