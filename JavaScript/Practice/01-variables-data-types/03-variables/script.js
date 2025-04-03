// Ways to declare a variables -> var, let, const

let firstName ='Sahitya';
let lastName = 'Srinivas';

//console.log(firstName,lastName,age); // will give error due to age cannot access before initialization 

let age = 24;

console.log(age);

console.log(firstName,middleName,lastName);

var middleName = 'Priya'; // Will give undefined in the place of middleName

// Naming conventions 
// - Only start with letters, numbers, underscores and dollar signs
// - Can't start with a number

/*Mutli-Word Formatting
firstName = camelCase
first_name = underscore
FirstName = PascalCase
firstname = lowercase
*/

//Re-assigning variables
var number = 5
console.log(number);
number = 6;
console.log(number);

let score;
score = 1;
console.log(score);
if(true){
     score = score + 1;
}
console.log(score);

/*
const x = 100;
x = 20;
console.log(x);
This will give TypeError : Assignment to constant variable.
*/

const arr = [1,2,3,4];
console.log(arr);
arr.push(0);
console.log(arr);


const person = {
    name : 'Siva'
};
console.log(person);
person.name = 'Rama';
person.email = 'rama@gmail.com';
console.log(person);

// Declare multiple values at once
//let a, b, c;
console.log(a,b,c);
