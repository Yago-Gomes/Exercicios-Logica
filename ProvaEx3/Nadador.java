/**
 * @author Yago Gomes
 * @version 1.0
 * @since 02/06/2020 - 03:05 PM
 * @category Model
 */
public class Nadador {
    
    private String nome;
    private int idade;
    
    public Nadador() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = (nome.length()>1) ? nome : "Nome Invalido";
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = (idade>0) ? idade : 0;
    }
    
    /**
     * @return Retorna a categoria do nadador conforme a idade inserida pelo usuário.
     */
    public String verificarCategoria() {
        if(this.idade >= 18) {
            return "Adulto";
        } else if(this.idade <= 17 && this.idade >= 11) {
            return "Juvenil";
        } else if(this.idade <= 10 && this.idade >= 8) {
            return "Infantil";
        }
        return "Não pode ser nadador. Mínimo oito anos.";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade + " ano(s)"
             + "\nCategoria: " + this.verificarCategoria();
    }
}