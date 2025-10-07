package Animais;

public class Cachorro {

    public String nome;

    public String cor;

    public int altura;

    public double peso;

    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    public void comer() {}

    public void latir() {
        System.out.println("Au Au");
    }

    public String pegar() {
        return "O cachorro pegou a bolinha!";
    }

    public String interagir(String acao){

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz!"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo!"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste!"; break;       
            default: this.estadoDeEspirito = "neutro!"; break;
        }
        return this.estadoDeEspirito;
    }

}
