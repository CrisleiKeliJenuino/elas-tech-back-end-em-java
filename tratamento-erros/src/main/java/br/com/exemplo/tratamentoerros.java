package main.java.br.com.exemplo;

public class tratamentoerros {
    public static void main(String[] args) {
        /*
         * TRATAMENTO DE ERROS
         * - Exceções
         * - Bloco try-catch
         * 
         * try {
         *      // Código que pode gerar uma exceção
         * }
         * catch (TipoDaExceção e) {
         *     // Código para tratar a exceção
         * }
         * finally {
         *    // Código que sempre será executado, independentemente de ocorrer ou não uma exceção
         * }
         */

         try {
            int resultado = dividir (10, 0);
            System.out.println("Resultado: " + resultado);
         } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
         } finally {
            System.out.println("Bloco finally sendo executado.");
         }
    }
    public static int dividir(int a, int b) {
        return a / b;
    }
}
