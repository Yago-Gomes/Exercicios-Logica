public class Main{
    public static void main(String args[]) {
    
    System.out.println("\f");
   
    
    Produto produto = new Produto();
    
    
    produto.descricao = "Celular";
    produto.fornecedor = "Fantazy";
    produto.valorCusto = 1200.99;
    produto.quantidade = 10;
    
    System.out.println("Descricao: " + produto.descricao
                      +"\nFornecedor: " + produto.fornecedor
                      +"\nValor custo: " + produto.valorCusto
                      +"\nQuantidade: " + produto.quantidade
                      +"\nValor estoque: " + produto.calcularValorEstoque()
                      +"\n65% Valor custo: " + produto.adicionar65PorCento());
    
    }
}