"use strict"
let lista = []
while(true){
    let texto = prompt("Insira um nome: ");
    if(texto==null){
        break;
    }
    else{
        lista.push(texto)
    }
}
let tabela = "<table id='tabela' border='1'><tr><th>INDICE</th><th>NOME</th></tr>"
var indice = 1;
lista.forEach((item) => {
    tabela += "<tr>"
    tabela += "<td>"+indice+"</td><td>"+item+"</td>"
    tabela += "</tr>"
    indice +=1
});
tabela += "</table>"

document.querySelector("#area").innerHTML = tabela