package Animais;

public class Main {
    
public static void main(String[] args) {
     
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());


        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));        
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
}
}
