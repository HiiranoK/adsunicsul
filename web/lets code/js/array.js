let arr = ["Richard", 27, 1.75, true]

for(let i = 0; i < arr.length; i++){
    console.log(arr[i])
}

for(let elemento of arr){
    console.log(elemento)
}

for(let indice in arr){
    console.log(indice, arr[indice])
}
console.clear()
// PARTE 2
// metodos verificar no MDN...
const arr1 = [30,12,45,34,29,12];
let arr2 = []
//Fatiando o array: Slice (valor_inicio, até valor_final (excludente))
console.log("fatiando o array com o slice ", arr1.slice(0,2))

//Adicionando Elementos: push(final) | unshift(começo)
arr2.push(25)
arr2.push(30)
arr2.unshift(10,20)
console.log("push adiciona ao fim e o unshift no inicio.", arr2)

//Removendo elementos: pop | shift

let ultimo_elemento = arr2.pop()
console.log("O array atual: ",arr2, "O elemento removido(ultimo da lista) ", ultimo_elemento)
let primeiro_elemento = arr2.shift()
console.log("O array atual: ",arr2, "O elemento removido(primeiro da lista) ", primeiro_elemento)

// Concatenando arrays: concat

console.log(arr1.concat(arr2))

// Buscando elementos no array: indexOf | lastIndexOf
// vai buscar o elemento da esquerda para a direita e retornar o indice, se não encontrar, retorna -1.
let indiceDoElemento1 = arr1.indexOf(30)

console.log(indiceDoElemento1)

// lastIndexOf faz o processo da direita para a esquerda. 
console.log(arr1.lastIndexOf(12))

// Verificar a existencia do elemento no Array (retorna booleano): includes
console.log(arr1.includes(12))

// Invertendo arrays: reverse 
console.clear()
console.log("arr1:          ", arr1)
const arr1Invertido = arr1.reverse()
console.log("arr1 invertido:", arr1Invertido)