public class Student extends Person {

    protected double grade1;
    protected double grade2;
    
    public Student() {
        super();
    }
    
    public Student(String name, String lastName, String Email, String dateOfBirth, Double grade1, Double grade2) {
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
        setGrade1(grade1);
        setGrade2(grade2);
    }
    
    public double getGrade1() {
        return this.grade1;
    }
    
    public void setGrade1(double grade1) {
        this.grade1 = (grade1>0) ? grade1 : 0;
    }
    
    public double getGrade2() {
        return grade2;
    }
    
    public void setGrade2(double grade2) {
        this.grade2 = (grade2>0) ? grade2 : 0;
    }
    
    public double calculateAverageGrade() {
        return (grade1 + grade2) / 2;
    }
    
    @Override
    public String toString() {
        return "**Student**\nName: " + this.name
             + "\nLast Name: " + this.lastName
             + "\nEmail: " + this.email
             + "\nDate of Birth: " + this.dateOfBirth
             + "\nGrade 1: " + this.grade1
             + "\nGrade 2: " + this.grade2
             + "\nAverage Grades: " + this.calculateAverageGrade()
             + "\n";
    }
}