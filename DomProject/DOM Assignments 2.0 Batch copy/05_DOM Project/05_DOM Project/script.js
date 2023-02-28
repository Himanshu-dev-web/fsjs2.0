
let pdiv = document.querySelectorAll(".nav-center div");

let createa = document.createElement("a");
createa.innerText = "Pro Subscription"
createa.classList.add("btn");

pdiv[2].appendChild(createa);

let RecipiesList = document.querySelector(".tags-container div");

let newli = document.createElement("a");
newli.innerText = "Chineses(7)"

RecipiesList.appendChild(newli);
