public class Main {

    public static void main(String args[]) {
    
        System.out.println("\f");
        
        System.out.println(new Person("Yago","Gomes","yagofdq@gmail.com","12/01/2000"));
        System.out.println(new Person("Noe","Nascimento","noeneto123@gmail.com","04/08/1997"));
        
        Student student = new Student(); //Estudante sem email so para testar.
        student.setName("Matheus");
        student.setLastName("Weingartner");
        student.setDateOfBirth("25/02/1999");
        student.setGrade1(9.5);
        student.setGrade2(5.7);
        System.out.println(student);
        
        Teacher teacher = new Teacher();
        teacher.setName("Deverly");
        teacher.setLastName("Gomes");
        teacher.setEmail("devinha.s2@gmail.com");
        teacher.setDateOfBirth("25/06/1968");
        teacher.setRegistrationNumber(201710138);
        teacher.setNumberOfHoursWorked(45);
        teacher.setHourValue(15);
        System.out.println(teacher);
        
        Employee employee = new Employee();
        employee.setName("Alexandro");
        employee.setLastName("Anselmo");
        employee.setEmail("alexandro.anselmo2008@gmail.com");
        employee.setDateOfBirth("03/04/1975");
        employee.setRegistrationNumber(23801435);
        employee.setMainSalary(4500);
        System.out.println(employee);
    }
}