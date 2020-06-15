/**
 * @author Thiago Cury
 * @version 1.0
 * @since 27/05/2020 - 11:01
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }    
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    /**
     * @return Retorna a idade em meses. x12.
     */
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }
    
    /**
     * @return Retorna a idade em semanas. x48.
     */
    public int calcularIdadeSemanas() {
        return this.idade * 48;
    }   
    
    /**
     * @return Retorna a idade em semanas. x48.
     */
    public double calcularIdadeMesesVirgula() {
        return this.idade * 12 * 1.0;
    }      
    
    /**
     * @return Retorna a idade em semanas. x48.
     */
    public String juntarNomeEIdade() {
        return this.nome + " " + this.idade;
    }    
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nIdade em meses: " + this.calcularIdadeMeses();
    }
}