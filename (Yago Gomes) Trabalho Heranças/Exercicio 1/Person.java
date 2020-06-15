public class Person {

    protected String name;
    protected String lastName;
    protected String email;
    protected String dateOfBirth;
    
    public Person() {
    }
    
    public Person(String name, String lastName, String email, String dateOfBirth) {
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = (name.length()>1) ? name : "Invalid Name";
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = (lastName.length()>1) ? lastName : "Invalid Last name";
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = (email.length()>1) ? email : "Your email is not valid";
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = (dateOfBirth.length()>1) ? dateOfBirth : "Your date of birth is not valid";
    }
    
    @Override
    public String toString() {
        return "**Student**\nName: " + this.name
             + "\nLast Name: " + this.lastName
             + "\nEmail: " + this.email
             + "\nDate of Birth: " + this.dateOfBirth
             + "\n";
    }
}