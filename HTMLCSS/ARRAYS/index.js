// FOR LOOP
let arr = [1, 2, 3];
let newArr = [];
for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
  newArr.push(arr[i]);
}

console.log(newArr);

// FOR EACH
arr.forEach(function (i) {
  console.log(i);
});

arr.forEach((i) => console.log(i));

// MAP
let newMap = arr.map(function (val) {
  return val * 2;
});

console.log(newMap);

// FILTER

let filterArray = ["Spray", "Can", "Limit", "Apple", "Eye", "Me"];

let result = filterArray.filter(function (word) {
  return filterArray.indexOf(word) % 2 == 0;
  //   return word.length > 4;
});

console.log(result);

let newResult = filterArray
  .map((i) => {
    return i;
  })
  .filter((val) => {
    return val.length >= 4;
  });

console.log(newResult);
