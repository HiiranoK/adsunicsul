import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int totalNotas = 0;
        for(int i = 1; i<=5;i++){
            totalNotas += 1;
            System.out.println("Informe o valor da " + i + "ª nota");
            double valor = sc.nextDouble();
            total += valor;
        }
        sc.close();
        total /= totalNotas;
        System.out.println("O total é:" + total);
        if(total > 6){
            System.out.println("Você está aprovado");
        }else{
            System.out.println("Você está reprovado");
        }
    }
}
