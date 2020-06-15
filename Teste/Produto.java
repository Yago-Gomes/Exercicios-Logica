public class Produto {

    String descricao;
    String fornecedor;
    double valorCusto;
    int quantidade;
   
    public double calcularValorEstoque(){
        return this.valorCusto * this.quantidade;
    }    
    
    public double adicionar65PorCento(){
        return this.valorCusto * 1.65;
    }
    
}
