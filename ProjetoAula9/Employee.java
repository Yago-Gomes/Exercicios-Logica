public class Employee extends Person {

    protected int registrationNumber;
    protected double mainSalary;
    
    public Employee() {
        super();
    }
    
    public Employee(String name, String lastName, String Email, String dateOfBirth,int registrationNumber, double mainSalary) {
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setRegistrationNumber(registrationNumber);
        setMainSalary(mainSalary);
    }
    
    public int getRegistrationNumber() {
        return this.registrationNumber;
    }
    
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber =(registrationNumber>0) ? registrationNumber : 0;
    }
    
    public double getMainSalary() {
        return this.mainSalary;
    }
    
    public void setMainSalary(double mainSalary) {
        this.mainSalary = (mainSalary>0) ? mainSalary : 0;
    }
    
    @Override
    public String toString() {
        return "**Employee**\nName: " + this.name
             + "\nLast Name: " + this.lastName
             + "\nEmail: " + this.email
             + "\nDate of Birth: " + this.dateOfBirth
             + "\nRegistration: @" + this.registrationNumber
             + "\nSalary: $ " + this.mainSalary
             + "\n";
    }
}