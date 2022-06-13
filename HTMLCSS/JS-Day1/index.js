var nameOne = "Cooper";
var numberOne = 3424;
var bool = true;
let nameTwo = "Cooper";
let numberTwo = 4561.152;
const middleName = "Stanton";
nameTwo = "Fiedler";
console.log("Name One is", nameOne);
console.log("Name Two is" + nameTwo);

function newMessage(num) {
  for (let i = 0; i < num; i++) {
    console.log(i);
  }
}

function add(numberOne, numberTwo) {
  let result = numberOne + numberTwo;
  return result;
}

newMessage(5);

let result = add(5, 3);
console.log(result);

let person = {
    first_name: 'Luke',
    last_name: 'Skywalker',
    job: 'Jack of all trades'
}

console.log(person.job);


function printSomething(p){
    for(let i in p){
        console.log(i + ":", p[i])
    }
}

printSomething(person)

let name = "1";

console.log(name);

console.log("Hello" - " World");




var a = "Per Scholas";
var results = a.substring(4, 5);

console.log(results);

var date = new Date("Thu Jan 29 2009 17:31:44");
var now = new Date("2019-01-24 18:31:44");

console.log(now.getMonth() === date.getMonth());

var data = "1+2, 2+3, 3+4, 4+5, 5 + 1 ".split(/\s*,\s*/).reverse(); 

console.log(data[1][0]+data[1][2]);