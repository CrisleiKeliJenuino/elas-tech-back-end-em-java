package main.java.br.com.exemplo;

public class operadores {
    public static void main(String[] args) {
        /*
         MATEMATICOS
            + somar
            - subtrair
            * multiplicar
            / dividir
            % resto da divisao
            
        RELACIONAIS
            == igual 
            != diferente
            > maior
            < menor
            >= maior ou igual
            <= menor ou igual

        LOGICOS
            && e (AND)
            || ou (OR)
            ! não (NOT)
         */

        int a = 10;
        int b = 20;

        int soma = a + b; // soma = 30
        int subtracao = b - a; // subtracao = 10
        int multiplicacao = a * b; // multiplicacao = 200   
        int divisao = b / a; // divisao = 2
        int resto = b % a; // resto = 0

        a += b; //30
        boolean resultado = (a == b); // false
        boolean resultado2 = (a != b); // true
        boolean resultado3 = (a > b); // true       
        boolean resultado4 = (a < b); // false
        boolean resultado5 = (a >= b); // true  
        boolean resultado6 = (a <= b); // false
        boolean resultado7 = (a >= 10 && b > 10); //true

    }
}
