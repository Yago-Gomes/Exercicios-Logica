
/**
 * Write a description of class Aluno here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 28/05/2020 - 14:11
 * @category Model
 */
public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    private double totalAulas;
    private double numeroPresencas;
    
    public Aluno() {
    }
    
    public Aluno(String nome, double nota1, double nota2, 
                    double totalAulas, double numeroPresencas) {
                        
       this.nome = nome;
       this.nota1 = nota1;
       this.nota2 = nota2;
       this.totalAulas = totalAulas;
       this.numeroPresencas = numeroPresencas;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    
    public double getTotalAulas() {
        return this.totalAulas;
    }
    
    public void setTotalAulas(double totalAulas) {
        this.totalAulas = totalAulas;
    }
    
    public double getNumeroPresencas() {
        return this.numeroPresencas;
    }

    public void setNumeroPresencas(double numeroPresencas) {
        this.numeroPresencas = numeroPresencas;
    }    
    
    /**
     * @return Retorna a média aritmetica. nota1+nota2 dividido por 2
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    /**
     * @return Retorna a frequência. (numeroPresencas/totalAulas) * 100
     */
    public double calcularFrequencia() {
        return (this.numeroPresencas / this.totalAulas) * 100;
    }    
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nTotal de aulas: " + this.totalAulas
             + "\nNúmero de presenças: " + this.numeroPresencas
             + "\nFrequencia: " + this.calcularFrequencia() + "%"
             + "\nMédia: " + this.calcularMediaAritmetica();
    }
}
