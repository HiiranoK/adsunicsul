import java.util.Scanner;

public class Mercado {
    public static void main(String[] args) {
        String[] frutas ={
            "banana",
            "maça",
            "abacate",
            "uva",
            "melao"
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uma fruta");
        String fruta = sc.nextLine();
        sc.close();
        fruta = fruta.toLowerCase();
        System.out.println(fruta);
        boolean lista = false;
        for(int i = 0; i < frutas.length; i++){
            if(fruta.equals(frutas[i])){
                lista = true;
            }
        }
        if(lista == true){
            System.out.println("A fruta " + fruta + " está na promoção");
        }else{
            System.out.println("A fruta não está na promoção");
        }
    }
}
