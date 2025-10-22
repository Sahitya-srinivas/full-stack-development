// Primitive Values are stored on the stack
const name = 'Priya';
const age = '24';

//Reference values are stored on the heap
const person = {
    name : 'Sahitya',
    age : '25'
};

let newName = name;

console.log(name, newName);

let newPerson = person;
newPerson.name = 'Vani';

console.log(person);