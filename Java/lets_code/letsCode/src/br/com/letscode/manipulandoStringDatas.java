package br.com.letscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class manipulandoStringDatas {
    public static void main(String[] args) {
        String nome = "Richard";
        String outroNome = "Bellinha";
        System.out.println(nome.equalsIgnoreCase(outroNome));
        // ISO 8601 = representação de data
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");
        //System.out.println(hoje);
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        //System.out.println(diaDaSemana);
        LocalDateTime agora = LocalDateTime.now();
        String saudacao;
        if(agora.getHour() >= 0&& agora.getHour()<12){
            saudacao = "Bom dia";
        }else if(agora.getHour() >=12 && agora.getHour()<18){
            saudacao = "Boa tarde";
        }else{
            saudacao = "boa noite";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.%n",nome,diaDaSemana,saudacao.toLowerCase());
        System.out.println("hhh");
    }
}
