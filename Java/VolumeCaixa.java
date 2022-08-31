package Java;

import java.util.Scanner;

public class VolumeCaixa {
    
    public static void main(String[] args) {
        int altura, comprimento, profundidade;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor da altura (em cm)");
        altura = sc.nextInt();
        System.out.println("informe o valor do comprimento (em cm)");
        comprimento = sc.nextInt();
        System.out.println("informe o valor da profundidade (em cm)");
        profundidade = sc.nextInt();
        sc.close();
        System.out.println("O volume da caixa em metros é: " + CalculaVolume(altura,comprimento,profundidade) + "m³");
    }

    public static int CalculaVolume( int alt,int larg, int prof){
        int volume =(alt*larg*prof)/100;
        return volume;
    }
}
 // sempre lembrar de deixar uma linha ao final dos códigos, pode ajudar dependendo do projeto.