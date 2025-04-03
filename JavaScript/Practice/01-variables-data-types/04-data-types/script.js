// String
const firstName = 'Priya';
console.log(firstName, typeof firstName); //returns Priya string

// Number
const output = 30;
const floatingNumber = 12.5;
console.log(output, typeof output); //returns 30 'number'
console.log(floatingNumber, typeof floatingNumber); //returns 12.5 'number'

// Boolean
const isPass = true;
console.log(isPass, typeof isPass); //returns true 'boolean'

// Null
const aptNumber = null;
console.log(aptNumber, typeof aptNumber); // returns null 'object'

//Undefined
let score;
console.log(score, typeof score); // returns undefined 'undefined'

const text = undefined;
console.log(undefined, typeof undefined); //returns undefined 'undefined'

//Symbol
const id = Symbol('id');
console.log(id, typeof id); // returns Symbol(id) 'symbol'

//BigInt
const n = 9878478756n;
console.log(n, typeof n); // returns 9878478756n 'bigint'

//Refernece Types
//Arrays
const numbers = [1, 2, 3, 4, 5];
console.log(numbers, typeof numbers); // returns (5) [1, 2, 3, 4, 5] 'object'

//Object literal
const person = {
    name : "Priya",
};
console.log(person, typeof person); //returns {name: 'Priya'} 'object'

// function
function sayHello() {
    console.log("Hello");
}
console.log(sayHello, typeof sayHello); 
/* returns ƒ sayHello() {
    console.log("Hello");
} 'function'  */