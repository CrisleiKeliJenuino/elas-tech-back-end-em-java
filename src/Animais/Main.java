package Animais;

import Lojas.Petshop;

public class Main {
    
public static void main(String[] args) {
     
        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");

        Gato gato1 = new Gato("Felix", "Preto", 4.5);

        Passaro passaro1 = new Passaro("Frajola", "Amarelo", 0.5);

        // Métodos soar de cada animal
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
}
}
