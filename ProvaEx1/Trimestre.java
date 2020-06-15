/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 01:06 PM
 * @category Model
 */
public class Trimestre {
    
    private int mes;
    
    public Trimestre() {
    }
    
    public int getMes() {
        return this.mes;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * @return Retornara o trimestre conforme a data de nascimento do usuario.
     */
    public String verificarTrimestre() {
        switch(this.mes) {
            case 1: return "Janeiro. Primeiro Trimestre";
            case 2: return "Fevereiro. Primeiro Trimestre";
            case 3: return "Março. Primeiro Trimestre";
            case 4: return "Abril. Primeiro Trimestre";
            case 5: return "Maio. Segundo Trimestre";
            case 6: return "Junho. Segundo Trimestre";
            case 7: return "Julho. Segundo Trimestre";
            case 8: return "Agosto. Segundo Trimestre";
            case 9: return "Setembro. Terceiro Trimestre";
            case 10: return "Outubro. Terceiro Trimestre";
            case 11: return "Novembro. Terceiro Trimestre";
            case 12: return "Dezembro. Terceiro Trimestre";
            default: return "Esse mês não existe!";
        }
    }
    
    @Override
    public String toString() {
        return this.verificarTrimestre();
    }
}