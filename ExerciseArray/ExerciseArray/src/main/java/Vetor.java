/**
 * @author John
 * @version 0.0.1
 */
public class Vetor {


    private String nome;
    private String lista;
    private int idade;
    private double soma;

    public Vetor() {
    }

    /**
     * @param nome o nome é retornado como nome
     * @param idade a idade é retornada como idade
     */
    public Vetor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * @return nome set nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome set nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return idade get idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade set idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return lista - get lista
     */
    public String getLista() {
        return lista;
    }

    /**
     * @param lista - set lista
     */
    public void setLista(String lista) {
        this.lista = lista;
    }

    /**
     * @return calcula a idade em meses, com o uso de 12 (12 meses = 1 ano)
     */
    public int calcularIdadeMeses() {
        return this.idade * 12;
    }

    /**
     * @return faz a idade em semanas, com o uso de * 52
     */
    public int calcularIdadeSemanas() {
        return this.idade * 52;
    }

    /**
     * @param opcao -verificar a idade de acordo com o case
     * @return
     */
    public String verificarOpcao(int opcao) {
        switch(opcao) {
            case 1: return "em meses: " + this.calcularIdadeMeses();
            case 2: return "em semanas: " + this.calcularIdadeSemanas();
            case 3: return "\nem meses: " + this.calcularIdadeMeses()
                    + "\nem semanas: " + this.calcularIdadeSemanas();
            case 4: System.exit(0);
                return null;
            default:
                System.exit(0);
                return null;
        }
    }

    /**
     *
     * @param opcao - vai verificar o que foi digitado de idade dentro da opcao, pra fazer o calculo da idade
     * @return em meses, em semanas a idade
     */
    public String verificarOpcaoString(String opcao) {
        if(opcao.equals("meses")) {
            return "em meses: " + this.calcularIdadeMeses();
        } else if(opcao.equals("semanas")) {
            return "em semanas: " + this.calcularIdadeSemanas();
        } else if(opcao.equals("osdois")) {
            return "\nem meses: " + this.calcularIdadeMeses()
                    + "\nem semanas: " + this.calcularIdadeSemanas();
        } else if(opcao.equals("sair")) {
            System.exit(0);
            return null;
        }
        System.exit(0);
        return null;
    }

    /**
     * @return o Nome, idade; em meses e semanas.
     */
    @Override
    public String toString() {
        return " " + "\nNome: " + nome
                + "\nIdade: " + idade
                + "\nIdade em meses: " + this.calcularIdadeMeses()
                + "\nIdade em semanas: " + this.calcularIdadeSemanas();
    }
}


