algoritmo AreaTriangulo
    real valorBase, valorAltura, area;
    início
        escreva("Informe a base do triangulo");
        leia(valorBase);//4.3
        escreva("Agora informe a altura dele");
        leia(valorAltura);//5.7
        area((valorBase*valorAltura)/2); //(4.3*5.7)/2 -> 24.51 /2 -> 
        escreva("A area do triangulo é igual a: " + area + "cm²");   //12.255
    fim