let header = document.getElementById("header_title");
// let container = document.getElementsByClassName("container");
console.log(header);
// console.log(container);

// let items = document.getElementsByName("list-group-item");
// for (item of items) {
//   console.log(item);
// }
let li = document.getElementsByTagName("li");

let arr = Array.prototype.slice.call(li, 1, 3);

for (item of arr) {
  console.log(item);
}

let selectId = document.querySelector("b.selectClass");
let tagName = document.querySelectorAll('font[color="blue"]');
console.log(tagName);

function showChange() {
  let change = "change the text";
  document.getElementById("myChange").innerHTML = change;
}
