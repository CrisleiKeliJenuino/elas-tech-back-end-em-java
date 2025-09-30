package br.com.exemplo;

public class Estruturas {
    public static void main(String[] args){
        /*
          if (condição = v){
          execurar um bloco de código
          }
          else {
          executar outro bloco de código
          }
         */
        int nota = 8;
        if (nota >= 6) {
        System.out.println("Aluno está aprovado!");
        }
        else if (nota >= 5 && nota < 6) {
            System.out.println("O aluno está em prova final!");
        }
        else {
            System.out.println("O aluno está reprovado!");
        }
    }
}