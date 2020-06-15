public class Customer {

    protected String name;
    protected String occupation;
    protected int customerCode;
    
    public Customer() {
        super();
    }
    
    public Customer(String name, String occupation, int customerCode) {
        this.name = name;
        this.occupation = occupation;
        this.customerCode = customerCode;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
    
    public int getCustomerCode() {
        return this.customerCode;
    }
    
    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nOccupation: " + this.occupation
             + "\nCustomer Code: " + this.customerCode
             + "\n";
    }
}