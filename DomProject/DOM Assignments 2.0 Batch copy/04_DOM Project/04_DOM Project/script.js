

let text = document.getElementsByClassName("one-third");
clashtext = [...text];


let cardSelector = document.querySelectorAll(".clash-card__unit-stats ");
cards = [...cardSelector];


clashtext.forEach(element => {
    element.style.color = "#ffffff"
});


cards.forEach(element => {
 
    let cardClasses = Array.from(element.classList)
    if (cardClasses.includes("clash-card__unit-stats--barbarian")) {
        element.style.backgroundColor = "#ec9b3b";
    } else if (cardClasses.includes("clash-card__unit-stats--archer")) {
        element.style.backgroundColor = "#ee5487";
    } else if (cardClasses.includes("clash-card__unit-stats--giant")) {
        element.style.backgroundColor = "#f6901a";
    } else if (cardClasses.includes("clash-card__unit-stats--goblin")) {
        element.style.backgroundColor = "#82bb30";
    } else if (cardClasses.includes("clash-card__unit-stats--wizard")) {
        element.style.backgroundColor = "#4facff";
    }
    });