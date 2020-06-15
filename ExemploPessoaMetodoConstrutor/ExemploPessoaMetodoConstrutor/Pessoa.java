public class Pessoa {

    private String nome;
    private int idade;
         
    public Pessoa() {
    }

    public Pessoa(String nome) {
        setNome(nome);
    }
    
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = (nome.length()>1) ? nome : "Nome não definido";
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public void setIdade(int idade) {
        this.idade = (idade>0) ? idade : 0;
    }
    
}