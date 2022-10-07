"use strict";
let media = Number(prompt("Digite a média"));

if(media >= 0 && media <= 10){
    if(media >= 5.75){
        alert("Aprovado");
    }else if(media <0.75){
        alert("Reprovado");
    }else{
        alert("Faça a AF");
    }
}else{
    alert("error");
}
