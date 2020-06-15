/**
 * @author Thiago Cury
 * @since 02/06/2020 - 09:57
 * @version 1.0
 */
public class Pessoa {

    private String nome;
    private int idade;

    //CTRL + ENTER
    public Pessoa() {
    }

    /**
     *
     * @param nome Recebe o nome da pessoa
     * @param idade Recebe a idade da pessoa
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     *
     * @return Retorna a idade em mees. x12
     */
    public int calcularIdade() {
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return "\nNome = " + this.nome
             + "\nIdade = " + this.idade
             + "\nIdade em meses = " + this.calcularIdade();
    }
}