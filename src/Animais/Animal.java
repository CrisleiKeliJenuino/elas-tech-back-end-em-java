package Animais;

public abstract class Animal {

    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal() {}

    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer() {}

    protected void dormir() {}

    public abstract void soar();


}
