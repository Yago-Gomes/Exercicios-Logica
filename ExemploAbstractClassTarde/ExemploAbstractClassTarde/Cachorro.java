public class Cachorro extends Pet implements AnimalInterface {
    
    @Override
    public int calcularIdade() {
        return this.idade * 7;
    }
     
    @Override
    public String comunicar() {
        return "Au auu";
    }
    
    @Override
    public double calcularX() {
        return 0.0;
    }
    
    @Override
    public String calcularY() {
        return null;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome
             + "\nIdade: " + this.calcularIdade() + " ano(s)"
             + "\nComunicaçao: " + this.comunicar();
    }
}