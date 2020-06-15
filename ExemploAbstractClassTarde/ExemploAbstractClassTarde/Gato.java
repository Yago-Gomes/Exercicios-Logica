public class Gato extends Pet {

    @Override
    public String comunicar() {
        return "Miauuuu";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nComunicaçao: " + this.comunicar();
    }

}