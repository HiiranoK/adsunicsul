let pessoa = {
    nome: "Richard",
    idade: 27,
}
console.log(pessoa)

console.log(pessoa.nome)
console.log(pessoa['nome'])
console.log(pessoa.idade)

pessoa.altura = 1.75

console.log(pessoa)

delete pessoa.altura

console.log(pessoa);

for ( let chave in pessoa){
    console.log(chave+":",pessoa[chave])
}