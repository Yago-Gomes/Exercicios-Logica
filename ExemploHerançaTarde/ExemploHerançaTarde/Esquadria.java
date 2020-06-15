public class Esquadria {

    protected String descricao;

    public Esquadria() {
    }
    
    public Esquadria(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
 
    @Override
    public String toString() {
        return "TOSTRING ESQUADRIA"
             + "\nDescrição: " + this.descricao;
    }
} 