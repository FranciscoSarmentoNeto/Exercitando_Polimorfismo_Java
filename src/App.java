public class App {

    /*
     * 2 - Atividade B - Polimorfismo
     * Crie uma classe base chamada "Animal" com um método "emitirSom". Em seguida,
     * crie uma subclasse chamada "Cachorro"
     * que herda de "Animal" e substitua o método "emitirSom" para que o cachorro
     * emita um som específico. Crie um método chamado
     * "fazerAnimalEmitirSom" que recebe um objeto do tipo "Animal" como parâmetro e
     * chama o método "emitirSom" desse objeto.
     * Crie instâncias de "Animal" e "Cachorro" e passe-as como argumentos para
     * "fazerAnimalEmitirSom" para demonstrar o polimorfismo.
     */

    public static void fazerAnimalEmitirSom(Animal animal) {
        animal.emitirSom();
    }

    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Animal Qualquer");
        Cachorro cachorro = new Cachorro("Cachorrão");
        fazerAnimalEmitirSom(animal);
        fazerAnimalEmitirSom(cachorro);
    }
}
