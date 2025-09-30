package main.java.br.com.exemplo;

public class strings {
    public static void main(String[] args) {
        /*
         * Característica impostante das Strings em Java: Imutabilidade
         * 
         * Fundionalidades:
         * Concatenação de strings: Usando o operador '+' ou o método 'concat()'.
         * Obtenção do comprimento: 'length()' retorna o número de caracteres.
         * Divisão em substrings: 'split()' divide a string com base em um delimitador.
         * Busca por substrings: 'indexOf()' e 'lastIndexOf()' encontram a posição de uma substring.
         * Extração de caracteres individuais: 'charAt()' retorna o caractere em uma posição específica.
         * Conversão entre maiúsculas e minúsculas: 'toUpperCase()' e 'toLowerCase()'.
         * Comparação de strings: 'equals()' e 'equalsIgnoreCase' para comparar valores.
         * 
         * No sistema de cadastro, você precisa criar uma solução personalizada para o cliente, informando o nome
         * completo em letras maiúsculas, o número de caracteres no nome, verificar se o nome digitado é igual
         * ao de um clieente já cadastrado, ignorando o formato da escrita.
         * Além disso, vamos fazer a separação do nome e sobrenome, a exibição da primeira letra do nome e a
         * posição do sobrenome.
         */
            String nomeDigitado = "Crislei Jenuino";
            String nomeCadastrado = "crislei jenuino";

            // Comparação dos nomes
            boolean nomesIguais = nomeDigitado.equals(nomeCadastrado);   
            System.out.println("Os nomes são exatamente iguais? " + nomesIguais);

            // Comparação ignorando maiusculas e minusculas
            boolean nomesIguasIgnorandoMaiusculas = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
            System.out.println("Os nomes são iguais ignorando maiúsculas? " + nomesIguasIgnorandoMaiusculas);

            //Converter para letras maiúsculas
            String nomesMaiusculo = nomeDigitado.toUpperCase();
            System.out.println("Nome em maiúsculas: " + nomesMaiusculo);

            // Converter para letras minusculas
            String nomesMinusculo = nomeDigitado.toLowerCase();
            System.out.println("Nome em minúsculas: " + nomesMinusculo);

            // Obter o tamanho da string
            int tamanhoNome = nomeDigitado.length();
            System.out.println("O nome contém " + tamanhoNome + " caracteres." );

            // Saudação Personalizada
            String saudacao = "Bem Vindo(a), ".concat(nomesMaiusculo).concat("!");
            System.out.println(saudacao);

            // Obter a primeira letra do nome
            char primeiraLetra = nomeDigitado.charAt(0);
            System.out.println("A primeira letra do nome é: " + primeiraLetra);

            // Encontrar a posição do sobrenome jenuino usando indexOf
            int posicaoSobrenome = nomeDigitado.indexOf("Jenuino");
            if(posicaoSobrenome != -1) {
                System.out.println("O sobrenome 'Jenuino' começa na posição: " + posicaoSobrenome);
            } else {
                System.out.println("Sobrenome 'Jenuino' não encontrado.");
            }
        } 
    }
    
