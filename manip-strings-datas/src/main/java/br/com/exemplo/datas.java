package main.java.br.com.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class datas {
    public static void main(String[] args) {
        /*
         * Funcionalidades
         * LocalDate: Represebta uma data, sem incluir informações de hora ou fuso horário. Armazena ano, mês e dia.
         * LocalTime: Representa uma hora do dia, semincluir informações de data ou fuso horário. 
         * Armazena horas, minutos, segundos e frações de segundo.
         * LocalDateTime: Combina data e hora, mas ainda sem informações de fuso horário.
         * ZonedDateTime: Inclui data, hora e fuso horário, permitindo representar momentos específicos em 
         * diferentes regiões.
         * Period: Representa um intervalo de tempo em termos de anos, meses e dias.
         * 
         * A empresa quer registrar a data de aniversário dos clientes para enviar ofertas especiais
         * em seus aniversários. Precisa-se verificar se a data do evento ocorre antes ou depois de uma data
         * específica, como a data de hoje.
         * Além de armazenar a data de nascimento do cliente, você precisa registrar a data e hora de cadastro
         * no sistema (incluindo o fuso horário). Também é necessário calcular o período até o próximo aniversário
         * do cliente para enviar uma mensagem personalizada. 
         */

         // Cadastro do cliente
         LocalDate dataNacimento = LocalDate.of(1990, 5, 15);
         System.out.println("Data de Nascimento do cliente: " + dataNacimento);

         // Data e hora do cadastro do cliente
            LocalDateTime dataHoraCadastro = LocalDateTime.now();
            System.out.println("Data e Hora do Cadastro: " + dataHoraCadastro);

            //Calcuoar o próximo aniversário do cliente
            LocalDate hoje = LocalDate.now();
            LocalDate proximoAniversario = dataNacimento.withYear(hoje.getYear());
            if(proximoAniversario.isBefore(hoje) || proximoAniversario.isEqual(hoje)) {
                proximoAniversario = proximoAniversario.plusYears(1);
            }
            System.out.println("Próximo Aniversário do cliente: " + proximoAniversario);

            // Calcular o período até o próximo aniversário
            Period periodoAteAniversario = Period.between(hoje, proximoAniversario);
            System.out.println("Faltam " + periodoAteAniversario.getMonths() + " meses e " + periodoAteAniversario.getDays() + 
            " dias para o próximo aniversário.");

            // Verificar se a data de nascimento é antes ou depois de uma data específica
            LocalDate dataEspecifica = LocalDate.of(2024, 10, 11);
            if (proximoAniversario.isBefore(dataEspecifica)){
                System.out.println("O próximo aniversário é antes de " + dataEspecifica);
            } else {
                System.out.println("O próximo aniversário é depois de " + dataEspecifica);
            }
    }
}