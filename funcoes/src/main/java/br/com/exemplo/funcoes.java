package main.java.br.com.exemplo;

public class funcoes {
    public static void main(String[] args) {
        System.out.println("Funções em Java");

        /*
         * CARACTERÍSTICAS IMPORTANTES DE MÉTODOS EM JAVA
         * 
         * - MODULARIDADE: Métodos permitem dividir o código em partes menores e gerenciáveis, 
         * facilitando a leitura e manutenção.
         * - REUTILIZAÇÃO DE CÓDIGO: Uma vez que um método é definido, ele pode ser chamado várias 
         * vezes em diferentes partes do programa.
         * - ABSTRAÇÃO: Métodos permitem ocultar a complexidade do código, expondo apenas a funcionalidade necessária.
         * - PARÂMETROS E RETORNO: Métodos podem aceitar parâmetros de entrada e retornar valores, 
         * permitindo a passagem de dados e resultados entre diferentes partes do programa.
         * VISIBILIDADE E ESCOPO: Métodos podem ter diferentes níveis de visibilidade (público, privado, protegido)
         * e escopo, controlando onde e como eles podem ser acessados.
         */

         int resultado = soma(5,3);
        System.out.println("O resultado da soma é: " + resultado);
    }
    public static int soma(int a, int b) {
        return a + b;
    }  

    public static double soma(double a, double b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }
}
