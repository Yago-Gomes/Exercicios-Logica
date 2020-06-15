public class Main {
    
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Customer customer = new Customer("Yago", "Video Editor", 00001);
        System.out.println("Name: " + customer.getName()
                         + "\nOccupation: " + customer.getOccupation()
                         + "\nCustomer Code: " + customer.getCustomerCode()
                         + "\n");
                         
        LegalEntity legalEntity = new LegalEntity("Yago", "Video Editor", 00001, "Fantazy LTDA", "12.123.1213/1234-12", 20150115, 15750.99);
        System.out.println(legalEntity);
        
        NaturalPerson naturalPerson = new NaturalPerson();
        naturalPerson.setName("Andre");
        naturalPerson.setOccupation("Video Editor");
        naturalPerson.setCustomerCode(00002);
        naturalPerson.setMaritalStatus("Single");
        naturalPerson.setCPF("123.123.123-12");
        naturalPerson.setDateOfBirth("25/02/1999");
        System.out.println(naturalPerson);
    }
}