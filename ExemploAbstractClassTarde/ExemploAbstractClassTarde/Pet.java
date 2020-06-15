public abstract class Pet {

    protected String nome;
    protected int idade;
    
    public Pet() {
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
    
    public int calcularIdade() {
        return this.idade;
    }
    
    public abstract String comunicar();
    
}