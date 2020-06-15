import java.util.List;

/**
 * @author Yago
 * @version 1.0
 * @since 07/06/2020 - 4:35 PM
 * @category Model
 */
public interface BancoArrayInterface {

    public void cadastrar(Funcionario funcionario);
    public List<Funcionario> buscar();
    public void remover(int index);
    public void alterar(int index, Funcionario funcionario);
    public Funcionario filtrar(Funcionario funcionario, int filtro);
    public int verificarQuantidade();
    public void apagarLista();

}