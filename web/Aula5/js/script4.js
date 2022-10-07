"use stricts"

let continuar = true;
let linhas = 0;
while (continuar) {
    let verifica = parseInt(prompt("desaja sair? Digite 1 pra não e 0 pra sim"))
    if(verifica == 1){
        linhas++;
        continue
    }else{
        console.log(linhas)
        continuar=false;
    }
}