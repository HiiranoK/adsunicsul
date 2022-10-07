const input = require('readline-sync')

const numero_sorteado = 5;

let numero = Number( input.question("Escolha um numero: "))

while(numero !== numero_sorteado){
    console.log("Você errou, tente novamente...")
    numero = Number( input.question("Escolha um numero: "))
}
console.log("Isso ae numero correto!");
