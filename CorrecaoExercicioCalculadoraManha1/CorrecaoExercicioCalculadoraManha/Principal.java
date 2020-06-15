import java.text.DecimalFormat;

public class Principal {

    public static void main(String args[]) {
        
        System.out.println("\f");
        
        //instancia de objeto
        Calculadora calculadora = new Calculadora();
        
        calculadora.numero1 = 10;   
        calculadora.numero2 = 5;
        
        //formatar a saída.
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); 
        
        System.out.println(
                "\nNumero 1: " + calculadora.numero1
              + "\nNumero 2: " + calculadora.numero2
              + "\nSoma: " + calculadora.somar()
              + "\nSubtração: " + calculadora.subtrair()
              + "\nDivisão: " + calculadora.dividir()
              + "\nMultiplicação: " + calculadora.multiplicar()
              + "\nRaiz quadrada do número 1: " + decimalFormat.format(calculadora.calcularRaizQuadradaNumero1())
              + "\nPotência número 1: " + calculadora.calcularPotenciaNumero1()
              + "\nPotência número 2: " + calculadora.calcularPotenciaNumero2(3));
    }
}