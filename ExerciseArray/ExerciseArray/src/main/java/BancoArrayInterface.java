import java.util.List;

/**
 * @author John
 * @version 0.0.1
 */
public interface BancoArrayInterface {

    public void cadastrar(Vetor vetor);
    public List<Vetor> buscar();
    public void remover(int index);
    public void alterar(int index, Vetor vetor);
    public Vetor filtrar(Vetor vetor, int filtro);
    public int verificarQuantidade();
    public void apagarLista();

}

