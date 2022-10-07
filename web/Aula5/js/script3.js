"use strict"

let valor = parseInt(prompt("Digite o numero que deseja a tabuada"));
for(let i=0;i<=10;i++){
    console.log(`${valor} x ${i} = ${valor*i}`);
}

let iteravel =0;
console.log("Tabuada com o while")
while(iteravel <= 10){
    console.log(`${valor} x ${iteravel} = ${valor*iteravel}`);
    iteravel++;
}