public class NaturalPerson extends Customer {
    
    protected String maritalStatus;
    protected String CPF;
    protected String dateOfBirth;
    
    public NaturalPerson() {
        super();
    }
    
    public NaturalPerson(String name, String occupation, int customerCode, String maritalStatus, String CPF, String dateOfBirth) {
        this.name = name;
        this.occupation = occupation;
        this.customerCode = customerCode;
        this.maritalStatus = maritalStatus;
        this.CPF = CPF;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getMaritalStatus() {
        return this.maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public String getCPF() {
        return this.CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nOccupation: " + this.occupation
             + "\nCustomer Code: " + this.customerCode
             + "\nMarital Status: " + this.maritalStatus
             + "\nCPF: " + this.CPF
             + "\nDate of Birth: " + this.dateOfBirth
             + "\n";
    }
}