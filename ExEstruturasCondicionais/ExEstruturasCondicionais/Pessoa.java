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
        this.idade = (idade > 0) ? idade : 0;
    }
    
    /**
     * @return adsfasd
     */
    public String verificarAdulto() {
        if(this.idade >= 18) {
            return "maior de idade";
        } else {
            return "menor de idade";
        }
    }
    
    /**
     * @return adsfasd
     */
    public String verificarAdultoo() {
        if(this.idade >= 18) {
            return "maior de idade";
        }
        return "menor de idade";
    }
    
    /**
     * @return adsfasd
     */
    public String verificarCategoria() {
        if(this.idade >= 60) {
            return "idoso";
        } else if(this.idade > 12) {
            return "juvenil";
        } else if(this.idade > 6) {
            return "infantil";
        } else {
            return "não se enquadra em nenhuma categoria";
        }
    }    
    
    /**
     * @return adfasdfadf
     */
    public String verificarNome() {
        if(this.nome.length() > 1) {
            return "Nome válido!";
        } else {
            return "Nome INválido!";        
        }
    }
    
    /**
     * @return adfasdfadf
     */
    public String verificarNoome() {
        return this.nome.length() > 1 ? "Nome válido!" : "Nome INválido!";
    }    
    
    /**
     * @return adfasdfadf
     */
    public boolean verificarNomee() {
        if(this.nome.length() > 1) {
            return true;
        } else {
            return false;        
        }
    }  
    
    /**
     * @return adfasdfadf
     */
    public String verificarNomeSwitch() {
        switch(this.nome) {
            case "thiago": 
            return "é o thiago";
            
            case "manuel":
            return "é o manuel";
            
            default:
            return "não sei quem é";
        }
    }  
    
    /**
     * @return adfasdfadf
     */
    public String verificarIdadeSwitch() {
        switch(this.idade) {
            case 36: 
            return "é o thiago";
            
            case 20:
            return "é o manuel";
            
            default:
            return "não sei quem é";
        }
    }      
    
    /**
     * @return adfasdfadf
     */
    public boolean verificarNomeee() {
        return this.nome.length() > 1;
    }     
    
    /**
     * @return adfasdfadf
     */
    public boolean verificarNomeeee() {
        if(this.nome.equals("thiago")) {
            return true;
        } else {
            return false;        
        }        
    }   
    
    /**
     * @return adfasdfadf
     */
    public boolean verificarNomeeeee() {
        return this.nome.equals("thiago");
    }     
    
    /**
     * @return adfasdfadf
     */
    public boolean verificarAcesso() {
        /* && -> e and      || -> ou or  */
        if(this.nome.equals("thiago") && this.idade == 36) {
            return true;
        } else {
            return false;        
        }        
    }       
    
    /**
     * @return adfasdfadf
     */
    public String verificarPorParametro(int opcao) {
        if(opcao == 1) {
            return "é um";
        } else if(opcao == 2) {
            return "é dois";            
        }
        return "nao sei";                    
    }  
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.idade
             + "\nVerificar nome: " + this.verificarNome()             
             + "\nVerificar adulto: " + this.verificarAdulto()
             + "\nVerificar categoria: " + this.verificarCategoria();
    }
}