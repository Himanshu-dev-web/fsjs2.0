


function checkSeason(month){
    if(month == "September" || month == "October" || month == "November"){
        return "autumn";
    } else if (month === "December" || month === "January" || month === "February") {
        return "Winter";
    } else if (month === "March" || month === "April" || month === "May") {
        return "Spring";
    } else if (month === "June" || month === "July" || month === "August") {
        return "Summer";
    } else {
        return "Invalid month input";
    }
}



console.log(checkSeason("September")); // Output: Autumn
console.log(checkSeason("January")); // Output: Winter
console.log(checkSeason("May")); // Output: Spring
console.log(checkSeason("August")); // Output: Summer
console.log(checkSeason("Not a month")); // Output: Invalid month input