package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso){
        super(nome, cor, 10, peso, "");
    }

    @Override
    public void soar() {    
        System.out.println("Piu Piu");
    }

}
