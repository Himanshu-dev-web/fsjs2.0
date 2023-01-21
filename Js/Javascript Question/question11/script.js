

let year  = new Date();


console.log(year.getFullYear()); // gives 2023

console.log(year.getMonth() +1);  // gives 1 as its january

console.log(year.getDate());  // gives 13 as a date

console.log(year.getDay()); // gives 5 as it is friday

console.log(year.getHours()); // gives 18 as its is 6 o clock

console.log(year.getMinutes()); // gives 54 as it is 6 o clock 54minutes



// Find out the numbers of seconds elapsed from January 1, 1970 to now.

var now = new Date(2023, 01, 01);
var bDay = new Date(1970, 01, 01);
var elapsedT = now - bDay;

console.log(elapsedT / 1000); // it gives 1672531200