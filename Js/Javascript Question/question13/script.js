


let date = new Date();

var dateStr1 =

( date.getFullYear() ) + "-" +
( "0" +(date.getMonth() + 1))+ "-" +
( date.getDate())+ " "+
( date.getHours()) + ":" +
( date.getMinutes())

console.log(dateStr1)  /// 2023-01-13 21:44


var dateStr2 =
( date.getDate()) + "-" +
("0" + (date.getMonth() + 1)) + "-" +
( date.getFullYear() )  + " " +
(date.getHours()) + ":" +
(date.getMinutes())


console.log(dateStr2);  //13-01-2023 21:47

var dateStr3 =
(+ date.getDate()) + "/" +
("0"+ (date.getMonth() + 1))  + "/" +
( date.getFullYear() )  + " " +
(+ date.getHours()) + ":" +
(+ date.getMinutes())


console.log(dateStr3);  //13/01/2023 21:47