package br.com.letscode;

public class App {
    public static void main(String[] args) throws Exception {
        boolean fimDeSemana = false;

        //operador ternario
        //mensagem recebe o valor de fimDeSemana, se for verdadeiro, a 1ª string é impressa, se falso a 2ª é impressa.
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        //                  termo1          termo 2               termo3
        System.out.println(mensagem);

        int nota = -140;

        if(nota<0 || nota>100){
            System.out.println("Nota inválida");
        }else if(nota >=90){
            System.out.println("Graduação A");
        }else if(nota >=80){
            System.out.println("Graduação B");
        }else if(nota >=70){
            System.out.println("Graduação C");
        }else if(nota >=60){
            System.out.println("Graduação D");
        }else{
            System.out.println("Graduação E");
        }
        
    }
}
