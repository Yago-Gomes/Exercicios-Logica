public class LegalEntity extends Customer {
    
    protected String businessName; // Razao social
    protected String CNPJ;
    protected int stateInscription; // Inscricao estadual
    protected double seedMoney; // Capital Inicial
    //razao social, CNPJ, inscricao estadual, capital inicial//
        
    public LegalEntity() {
        super();
    }
    
    public LegalEntity(String name, String occupation, int customerCode, String businessName, String CNPJ, int stateInscription, double seedMoney) {
        this.name = name;
        this.occupation = occupation;
        this.customerCode = customerCode;
        this.businessName = businessName;
        this.CNPJ = CNPJ;
        this.stateInscription = stateInscription;
        this.seedMoney = seedMoney;
    }
        
    public String getBusinessName() {
        return this.businessName;
    }
    
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    
    public String getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public int getStateInscription() {
        return this.stateInscription;
    }
    
    public void setStateInscription(int stateInscription) {
        this.stateInscription = stateInscription;
    }
    
    public double getSeedMoney() {
        return this.seedMoney;
    }
    
    public void setSeedMoney(double seedMoney) {
        this.seedMoney = seedMoney;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name
             + "\nOccupation: " + this.occupation
             + "\nCustomer Code: " + this.customerCode
             + "\nBusiness Name: " + this.businessName
             + "\nCNPJ: " + this.CNPJ
             + "\nState Inscription: " + this.stateInscription
             + "\nSeed Money: " + this.seedMoney
             + "\n";
    }
}