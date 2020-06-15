/**
 * @author Yago Gomes
 * @version 1.0
 * @since 27-05-2020 11:58PM 
 */
public class Aluno {

    protected String nome;
    protected double nota1;
    protected double nota2;
    protected double numeroAulas;
    protected double numeroPresencas;
    
    public Aluno() {
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
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNumeroAulas() {
        return this.numeroAulas;
    }
    
    public void setNumeroAulas(double numeroAulas) {
        this.numeroAulas = numeroAulas;
    }
    
    public double getNumeroPresencas() {
        return this.numeroPresencas;
    }
    
    public void setNumeroPresencas(double numeroPresencas) {
        this.numeroPresencas = numeroPresencas;
    }
    
    /**
     * @return Retorna a frequencia do aluno em porcentagem.
     */
    public double calcularFrequencia() {
        return (this.numeroPresencas/this.numeroAulas) * 100;
    }
    
    /**
     * @return Retorna a media das notas do aluno.
     */
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2
             + "\nNumero de Aulas: " + this.numeroAulas
             + "\nNumero de Presencas: " + this.numeroPresencas
             + "\nPorcentagem de Frequencia: " + this.calcularFrequencia() + "%"
             + "\nMedia Final: " + this.calcularMedia()
             + "\n";
    }
}