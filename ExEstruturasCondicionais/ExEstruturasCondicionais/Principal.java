
/*1 - Refazer o exercicio do aluno.
Inserindo os seguintes métodos de teste:

verificar aprovacao EM RELACAO SOMENTE A MÉDIA: se for maior ou igual a 6 aprovado
senao reprovado.

verificar aprovacao média e frequencia: 
se for maior ou igual a 6 e frequencia >=75 aprovado, 
caso contrario reprovado.

verificar conceito: 

10 - 9 = A
8.9 - 7 = B
6.9 - 6 = C
0 - 5.9 = D

2 - Receba um número relacionado a um mês,
e retorne o nome do mês.
Crie classe de teste com todas as possibilidade de teste.*/

public class Principal {
   public static void main(String args[]) {
   
       System.out.println("\f");
       
       Pessoa pessoa = new Pessoa();
       
       pessoa.setNome("Thiago");
       pessoa.setIdade(64);
       System.out.println(pessoa);
       
       System.out.println(pessoa.verificarPorParametro(1));
       
       /*int opcao = 1;
       switch(opcao) {
            case 1: 
                System.out.println("é o 1");
                break;
            case 2:
                System.out.println("é o 2");
                break;
            
            default:
                System.out.println("não sei qual é esse número");
                break;
        }*/
       
   }
}
