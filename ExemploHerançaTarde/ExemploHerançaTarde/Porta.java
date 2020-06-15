public class Porta extends Esquadria {

    private String tipoDeDobradica;
    
    public Porta() {
        super(); //construtor da classe pai
    }

    public Porta(String descricao, String tipoDeDobradica) {
        //3 maneiras....
        //primeira maneira
        //super(descricao);
        //segunda maneira
        //this.setDescricao(descricao);
        //terceira maneira
        this.descricao = descricao; //só se estiver protected
        this.tipoDeDobradica = tipoDeDobradica;
    }
    
    public String getTipoDeDobradica() {
        return this.tipoDeDobradica;
    }
    
    public void setTipoDeDobradica(String tipoDeDobradica) {
        this.tipoDeDobradica = tipoDeDobradica;
    }   
    
    @Override
    public String toString() {
        return "TOSTRING PORTA"
             + "\nPorta: " + this.descricao
             + "\nTipo de dobradiça: " + this.tipoDeDobradica;
    }
    
}