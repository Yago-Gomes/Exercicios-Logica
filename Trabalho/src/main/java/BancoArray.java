import java.util.ArrayList;
import java.util.List;

/**
 * @author Yago
 * @version 1.0
 * @since 07/06/2020 - 5:07 PM
 * @category Model
 */
public class BancoArray implements BancoArrayInterface {

    List<Funcionario> lista;

    public BancoArray() {
        lista = new ArrayList<>();
    }

    @Override
    public void cadastrar(Funcionario funcionario) {
        this.lista.add(funcionario);
    }

    @Override
    public List<Funcionario> buscar() {
        return this.lista;
    }

    @Override
    public void remover(int index) {
        this.lista.remove(index);
    }

    @Override
    public void alterar(int index, Funcionario funcionario) {
        this.lista.add(index, funcionario);
    }

    @Override
    public Funcionario filtrar(Funcionario funcionario, int filtro) {
        switch(filtro) {
            case 1:
                for(Funcionario funcionarioAuxiliar : this.lista) {
                    if(funcionarioAuxiliar.getNome().contains(funcionario.getNome())) {
                        return funcionarioAuxiliar;
                    }
                }
                break;
            case 2:
                for(Funcionario funcionarioAuxiliar : this.lista) {
                    if(funcionarioAuxiliar.getIdade() == funcionario.getIdade()) {
                        return funcionarioAuxiliar;
                    }
                }
                break;
            default:
                return null;
        }
        return null;
    }

    @Override
    public int verificarQuantidade() {
        return this.lista.size();
    }

    @Override
    public void apagarLista() {
        this.lista.clear();
    }
}