public class Calculadora {
    
    double numero1;
    double numero2;
 
    public double somar() {
        return this.numero1 + this.numero2;
    }
    
    public double subtrair() {
        return this.numero1 - this.numero2;
    }    
    
    public double dividir() {
        return this.numero1 / this.numero2;
    }    
    
    public double multiplicar() {
        return this.numero1 * this.numero2;
    }
    
    public double calcularRaizQuadradaNumero1() {
        return Math.sqrt(this.numero1);
    }
    
    public double calcularPotenciaNumero1() {
        return Math.pow(this.numero1, 2);
    }    
    
    public double calcularPotenciaNumero2(double expoente) {
        return Math.pow(this.numero2, expoente);
    }        
}