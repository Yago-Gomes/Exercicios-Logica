public class Teacher extends Person {

    protected int registrationNumber;
    protected double numberOfHoursWorked;
    protected double hourValue;
    
    public Teacher() {
        super();
    }
    
    public Teacher(String name, String lastName, String Email, String dateOfBirth,int registrationNumber, double numberOfHoursWorked, double hourValue) {
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setRegistrationNumber(registrationNumber);
        setNumberOfHoursWorked(numberOfHoursWorked);
        setHourValue(hourValue);
    }
    
    public int getRegistrationNumber() {
        return registrationNumber;
    }
    
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = (registrationNumber>0) ? registrationNumber : 0;
    }
    
    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }
    
    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = (numberOfHoursWorked>0) ? numberOfHoursWorked : 0;
    }
    
    public double getHourValue() {
        return hourValue;
    }
    
    public void setHourValue(double hourValue) {
        this.hourValue = (hourValue>0) ? hourValue : 0;
    }
    
    public double calculateGrossSalary() {
        return numberOfHoursWorked * hourValue * 4;
    }
    
    public double calculateFGTS() {
        return calculateGrossSalary() * 1.08; 
    }
    
    @Override
    public String toString() {
        return "**Teacher**\nName: " + this.name
             + "\nLast Name: " + this.lastName
             + "\nEmail: " + this.email
             + "\nDate of Birth: " + this.dateOfBirth
             + "\nRegistration: @" + this.registrationNumber
             + "\nHours Worked per Week: " + this.numberOfHoursWorked
             + "\nHour Value: $ " + this.hourValue
             + "\nGross Salary: $ " + calculateGrossSalary()
             + "\nFGTS Addition: $ " + calculateFGTS()
             + "\n";
    }
}