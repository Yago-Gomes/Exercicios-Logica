import java.text.DecimalFormat;

/**
 * The test class AlunoTest.
 *
 * @author  Thiago Cury
 * @version 1.0 
 * @since 28/05/2020 - 14:46
 * @category Utility
 */
public class Conversao {

    public double formatar(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(numero));
    }
    
    public String formatarString(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(numero);
    }    
}