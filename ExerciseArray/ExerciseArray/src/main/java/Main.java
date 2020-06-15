import java.util.*;
import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

/**
 * @author John
 * @version 0.0.1
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Dorime's Exercise: ");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        BancoArray lista = new BancoArray();

        Vetor vetor = null;

        int opcao = 0;
        do {
            System.out.println("1-cadastrar\n2-ver lista\n3-remover\n4-filtrar\n5-ver quantidade\n6-esvaziar lista\n10-sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    vetor = new Vetor();
                    System.out.println("Digite o nome: ");
                    vetor.setNome(scanner.next());
                    System.out.println("Digite a idade: ");
                    vetor.setIdade(scanner.nextInt());
                    lista.cadastrar(vetor);
                    System.out.println("Contato cadastrado com sucesso!");
                    break;
                case 2:
                    if(lista.verificarQuantidade() != 0) {
                        lista.buscar().forEach(System.out::println);
                        System.out.println("\n");
                    } else {
                        System.out.println("Não há contatos!");
                    }

//                    for(Pessoa pessoaAuxiliar : agenda.buscar()) {
//                        System.out.println(pessoaAuxiliar.toString());
//                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição para excluir: ");
                    int index = scanner.nextInt();
                    lista.remover(index);
                    System.out.println("Contato apagado com sucesso!");
                    break;
                case 4:
                    vetor = new Vetor();
                    System.out.println("Digite o nome do contato que deseja filtrar: ");
                    vetor.setNome(scanner.next());

                    vetor = lista.filtrar(vetor, 1);
                    System.out.println(vetor != null ? vetor : "Contato não encontrado!");
                    break;
                case 5:
                    System.out.println("Há " + lista.verificarQuantidade() + " contato(s)");
                    break;
                case 6:
                    lista.apagarLista();
                    System.out.println("Lista limpa!");
                    break;
                case 10:
                    System.out.println("\nEncerrado com sucesso!");
                    System.exit(0);
                    break;

            }

        } while(opcao!=10);
    }

}
