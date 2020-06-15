import java.util.ArrayList;
import java.util.List;

/**
 * @author John
 * @version 0.0.1
 */
public class BancoArray implements BancoArrayInterface {

    List<Vetor> lista;

    public BancoArray() {
        lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(Vetor vetor) {
        this.lista.add(vetor);
    }

    /**
     * @return lista
     */
    @Override
    public List<Vetor> buscar() {
        return this.lista;
    }

    /**
     * @param index
     */
    @Override
    public void remover(int index) {
        this.lista.remove(index);
    }

    /**
     * @param index
     * @param vetor
     */
    @Override
    public void alterar(int index, Vetor vetor) {
        this.lista.add(index, vetor);
    }

    /**
     * @param vetor
     * @param filtro
     * @return pessoaAuxiliar
     */
    @Override
    public Vetor filtrar(Vetor vetor, int filtro) {
        switch(filtro) {
            case 1: //nome
                for(Vetor pessoaAuxiliar : this.lista) {
                    if(pessoaAuxiliar.getNome().contains(vetor.getNome())) {
                        return pessoaAuxiliar;
                    }
                }
                break;
            case 2: //idade
                for(Vetor pessoaAuxiliar : this.lista) {
                    if(pessoaAuxiliar.getIdade() == vetor.getIdade()) {
                        return pessoaAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    /**
     * @return
     */
    @Override
    public int verificarQuantidade() {
        return this.lista.size();
    }

    /**
     *
     */
    @Override
    public void apagarLista() {
        this.lista.clear();
    }
}
