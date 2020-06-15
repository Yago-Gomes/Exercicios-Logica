/**
 * @author Thiago Cury
 * @version 1.0
 * @since 27/05/2020 - 10:12
 * @category Model
 */
public class Pessoa {

    private String nome;
    private int idade;
    
    /**
     * Explicação sobre o construtor
     */
    public Pessoa() {
    }
    
    /**
     * @param Recebe o nome da pessoa
     * @param Recebe a idade da pessoa
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
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
     * @param Recebe o expoente para elevar na base
     * @return Retorna a idade elevada ao expoente
     */
    public double calcularIdadeAoExpoente(int expoente) {
        return Math.pow(this.idade, expoente);
    }    
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nIdade em meses: " + this.calcularIdadeMeses();
    }
}