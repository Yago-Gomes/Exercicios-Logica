public class Pessoa {

    String nome;
    String sobrenome;
    
    @Override
    public String toString() {
        return "Seu nome é: " + this.nome + " " + this.sobrenome;
    }
    
}