public class Animal {
    String nomeDoAnimal = "";

    public Animal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public void emitirSom() {
        System.out.println(getNomeDoAnimal() + " faz: " + "Som de animal emitido!!!");
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

}
