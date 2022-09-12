let a = parseFloat(prompt("informe o valor de a"));
let b = parseFloat(prompt("informe o valor de b"));
let c = parseFloat(prompt("informe o valor de c"));

let delta = b**2 - 4*a*c;
let r1 = (-b + Math.sqrt(delta))/(2*a);
let r2 = (-b - Math.sqrt(delta))/(2*a);
alert(`R1: ${r1} R2: ${r2}`);