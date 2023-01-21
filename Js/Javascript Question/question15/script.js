



function assignGrade(score) {
    if (score >= 80 && score <=100) {
        return "A";
    } else if (score >= 70 && score <=89) {
        return "B";
    } else if (score >= 60 && score <=69) {
        return "C";
    } else if (score >= 50 && score <=59) {
        return "D";
    } else {
        return "F";
    }
}

console.log(assignGrade(95)); // Output: A
console.log(assignGrade(65)); // Output: D
console.log(assignGrade(55)); // Output: F