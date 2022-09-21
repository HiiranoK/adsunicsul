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
        String[] frutas_cliente= new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i>=frutas_cliente.length;i++){
            System.out.println("Informe a"+ i+1 + "ª fruta da sua lista");
            String fruta = sc.nextLine();
            frutas_cliente[i]= fruta;
        }
        System.out.println(frutas_cliente);
        System.out.println("Informe uma fruta");
        String fruta = sc.nextLine();
        sc.close();
        fruta = fruta.toLowerCase();
        System.out.println(fruta);
        boolean lista = false;
        for(int i = 0; i < frutas.length; i++){
            if(fruta.equalsIgnoreCase(frutas[i])){
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
