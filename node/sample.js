
/*
//some == ||
var result1 = "172.316.1140.153"
  .split('.')
  .some(function(n){
      return !(n < 0 || n > 255);
  });

//every == &&
var result2 = "172.16.40.1531"
  .split('.')
  .every(function(n){
      return !(n < 0 || n > 255);
  });

console.log(result1);
*/

/*
var plus = function(a, b) {
  return a + b;
};

var mapdouble = function(n) {
  return n * 2;
};

var result = [0,1,2,3,4,5,6,7,8,9]
  .map(mapdouble)
  .reduce(plus);
*/
//使い捨ての関数はそのままかいてよし
/*
var result = [0,1,2,3,4,5,6,7,8,9]
  .map(function double2(x){return x * 2})
  .reduce(function plus(x,y){return x + y});

console.log(result);
*/

/*
var even = function(n) {
  return (n % 2) === 0;
};

var odd = function(n) {
  return (n % 2) === 0;
};

var over5 = function(n) {
  return (n > 5);
};

//filterはtrueの場合うごく
var result = [0,1,2,3,4,5,6,7,8,9]
  .filter(even)
  .filter(over5);

console.log(result);
*/

/*
var plus = function(a,b) {
  return a + b;
};

// (((((plus(plus(plus(plus(plus0 1) 2) 3) 4) 5) 6) 7) 8) 9)
var result = [0,1,2,3,4,5,6,7,8,9]
  .reduce(plus);

console.log(result);
*/

/*
var a1 = ['a', 'b', 'c'];
var result = ['d', 'e', 'f'].concat(a1);

console.log(result);
*/

//var result = [1,2,3].reverse();
//var result = [1,2,3].slice(0,2);
/*
var asc = function(a,b) {
  return a - b;
};
var desc = function(a, b) {
  return b - a;
};
var result = [1,2,3].sort(desc);
console.log(result);
*/

var word = "Hello";
var result = [
  "<li>"
  , word
  , "</li>"
].join('');
console.log(result);
