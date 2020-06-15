/**
 * @author Yago
 * @version 1.0
 * @since 07/06/2020 - 5:44 PM
 * @category Model
 */
public class Funcionario {

    private String nome;
    private String lista;
    private String email;
    private int idade;
    private double salario;

    public Funcionario() {
    }

    /**
     * @param nome retorna o nome do funcionario
     * @param idade retorna a idade do funcionario
     * @param email retorna o email do funcionario
     * @param salario retorna o salario do funcionario
     */
    public Funcionario(String nome, int idade, String email, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return Retorna o salario do funcionario com a adição do FGTS
     */
    public double calcularAdicaoFGTS() {
        return this.salario * 1.08;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome
             + "\nIdade = " + idade
             + "\nEmail = " + email
             + "\nSalario = R$ " + salario
             + "\nSalario + FGTS = R$ " + calcularAdicaoFGTS()
             +"\n";
    }

}