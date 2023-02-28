
//Task 1

let lang = document.querySelectorAll(".main__languages > a")

let languages = [...lang];

languages.forEach(elem => {
    if (elem.innerText.includes("2.0")) {
        elem.style.display = "none"
    }
})




let forminp  = document.querySelector("form input");
forminp.disabled = false
let formbtn  = document.querySelector("form button");
formbtn.disabled = false


let form  = document.querySelector("form");

form.addEventListener("submit", (event) => {
    event.preventDefault();
    languages.forEach(elem => {
        if (elem.innerText.includes("2.0")) {
            elem.style.display = "inline"
        }
    })
})