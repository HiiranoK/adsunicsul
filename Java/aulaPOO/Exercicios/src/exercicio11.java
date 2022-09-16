import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        int valor = sc.nextInt();
        sc.close();
        if(valor %2 == 0){
            System.out.println("O numero informado é par");
        }else{
            System.out.println("O numero informado é impar");
        }
    }
}
