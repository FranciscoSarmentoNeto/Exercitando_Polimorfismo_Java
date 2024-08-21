public class Cachorro extends Animal {

    public Cachorro(String nomeDoAnimal) {
        super(nomeDoAnimal);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNomeDoAnimal() + " faz: AUAUAU!!!");
    }

}
