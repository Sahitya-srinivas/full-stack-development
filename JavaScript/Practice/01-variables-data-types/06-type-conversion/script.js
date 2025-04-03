let amount = 'hello';

/* Convert a string to number (results NaN if the string is not a number)
1) Using parseInt() :
    amount = parseInt(amount);
2) Using Unary Operatory (+)
    amount = +amount;
3) Using Number method
    amount = Number(amount);
*/

/* Convert a number to string
1) Using toString():
    amount = amount.toString();
2) Using String method
    amount = String(amount);
*/

/* Convert a string to decimal
1) Using parseFloat()
    amount = parseFloat(amount);
*/

/* Convert a number to boolean
1) Using Boolean():
    amount = Boolean(amount);
*/

/* NaN(Not a Number) examples
console.log(Math.sqrt(-1));
console.log(1 + NaN);
console.log(undefined + undefined);
console.log('hello'/5);
console.log(Number('Hi'));
*/

console.log(amount, typeof amount);
