public class Pessoa {

    private String nome;
    
    public Pessoa() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome;
        
    }
}