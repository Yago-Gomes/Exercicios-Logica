
/**
 * Write a description of class Aluno here.
 *
 * @author Thiago Cury
 * @version 1.0
 * @since 28/05/2020 - 09:10
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
     * @return Retorna a regra de três para o cálculo da frequência
     */
    public double calcularFrequencia() {
        return (this.numeroPresencas/this.totalAulas)*100;
    }
    
    /**
     * @return Retorna a média aritmética de nota1 por nota2.
     */
    public double calcularMediaAritmetica() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    /**
     * @return Retorna aprovado ou reprovado conforme a média aritmética
     */    
    public String verificarAprovacao() {
        if(this.calcularMediaAritmetica() >= 6) {
            return "Aprovado";
        }
        return "Reprovado";
    }
    
    /**
     * @return Retorna aprovado ou reprovado conforme a frequencia e média aritmética
     */    
    public String verificarAprovacaoMediaEFrequencia() {
        if(this.calcularMediaAritmetica() >= 6 && this.calcularFrequencia() >= 75) {
            return "Aprovado";
        }
        return "Reprovado";
    }    
    
    /**
     * @return Retorna o conceito conforme a média
     */    
    public String verificarConceito() {
        double media = this.calcularMediaAritmetica();
        if(media >= 9 && media <= 10) {
            return "A";
        } else if(media >= 8 && media <= 8.9) {
            return "B";
        } else if(media >= 6 && media <= 6.9) {
            return "C";
        }
        return "D";
    }    
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nNota 1: " + this.nota1
             + "\nNota 2: " + this.nota2             
             + "\nNúmero de presenças: " + this.numeroPresencas
             + "\nTotal de aulas: " + this.totalAulas
             + "\nMédia: " + this.calcularMediaAritmetica()              
             + "\nFrequência: " + this.calcularFrequencia();
    }
    
}