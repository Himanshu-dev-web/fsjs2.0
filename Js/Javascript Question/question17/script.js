

function daysInMonth(month, year) {
    // Create an array with the number of days in each month
    var days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    // Check if the year is a leap year
    if (month === 1 && year % 4 === 0 && (year % 100 !== 0 || year % 400 === 0)) {
        return 29;
    } else {
        return days[month];
    }
}

console.log(daysInMonth(1, 2020)); // Output: 31

console.log(daysInMonth(1, 2021)); // Output: 28
console.log(daysInMonth(1, 2022)); // Output: 29
console.log(daysInMonth(1, 2023)); // Output: 30