import java.util.Scanner;

/**
 * @author Yago
 * @version 1.0
 * @since 07/06/2020 - 7:35 PM
 * @category View
 */
public class Principal {
    public static void main(String[] args) {

        System.out.println("Sistema Fantazy LDTA\n");

        Scanner scanner = new Scanner(System.in);

        BancoArray lista = new BancoArray();

        Funcionario funcionario = null;

        int opcao = 0;
        do {
            System.out.println("1-Cadastrar Funcionario\n2-Lista\n3-Deletar\n4-Filtrar\n5-Quantidade\n6-Deletar Lista\n0-Sair");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    funcionario = new Funcionario();
                    System.out.println("Digite o nome: ");
                    funcionario.setNome(scanner.next());
                    System.out.println("Digite a idade: ");
                    funcionario.setIdade(scanner.nextInt());
                    System.out.println("Digite o Email: ");
                    funcionario.setEmail(scanner.next());
                    System.out.println("Digite o salário: ");
                    funcionario.setSalario(scanner.nextDouble());
                    lista.cadastrar(funcionario);
                    System.out.println("Funcionario cadastrado com sucesso!\n");
                    break;
                case 2:
                    if(lista.verificarQuantidade() != 0) {
                        lista.buscar().forEach(System.out::println);
                    } else {
                        System.out.println("Não há funcionarios cadastrados!");
                    }
                    break;
                case 3:
                    System.out.println("Digite uma posição para excluir: ");
                    int index = scanner.nextInt();
                    lista.remover(index);
                    System.out.println("Funcionario apagado com sucesso!");
                    break;
                case 4:
                    funcionario = new Funcionario();
                    System.out.println("Digite o nome do funcionario que deseja filtrar: ");
                    funcionario.setNome(scanner.next());

                    funcionario = lista.filtrar(funcionario, 1);
                    System.out.println(funcionario != null ? funcionario : "Funcionario não encontrado!");
                    break;
                case 5:
                    System.out.println("Há " + lista.verificarQuantidade() + " funcionario(s)");
                    break;
                case 6:
                    lista.apagarLista();
                    System.out.println("Lista limpa!");
                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        } while(opcao!=0);

    }
}
