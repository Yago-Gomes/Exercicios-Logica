/**
 * @author Yago Gomes
 * @version 1.0
 * @since 01/06/2020 - 01:41 PM
 * @category Model
 */
public class Abastecimento {
    
    private double litrosAbastecidos;
    private int tipoCombustivel;
    
    public Abastecimento() {
    }
    
    public double getLitrosAbastecidos() {
        return this.litrosAbastecidos;
    }
    
    public void setLitrosAbastecidos(double litrosAbastecidos) {
        this.litrosAbastecidos = litrosAbastecidos;
    }
    
    public int getTipoCombustivel() {
        return this.tipoCombustivel;
    }
    
    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    
    /**
     * @param Recebe a quantidade abastecida em litros e multiplica pelo preço do devido combustivel.
     * @return Retorna o valor do abastecimento.
     */
    public double calcularPrecoAbastecimento() {
        if(this.tipoCombustivel == 1){
            return (4.49 * this.litrosAbastecidos);
        } else if(this.tipoCombustivel ==  2) {
            return (3.68 * this.litrosAbastecidos);
        } else if(this.tipoCombustivel ==  3) {
            return (3.71 * this.litrosAbastecidos);
        } else if(this.tipoCombustivel == 4) {
            return (4.49 * this.litrosAbastecidos);
        }   
        return 0;
    }
    
    @Override
    public String toString() {
        return "Valor do abastecimento: R$ " + this.calcularPrecoAbastecimento();
    }
}