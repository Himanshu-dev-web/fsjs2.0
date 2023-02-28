

//Task 6


// let myform = document.querySelector("form");

// myform[1].addEeventListener("submit", (event) =>{
//     event.preventDefault();

//     let name = document.querySelector(".userName");
//     let email = document.querySelector(".userEmail");
//     let message = document.querySelector(".userMessage");


//     let setName = document.querySelector(".enterName");
//     let setEmail = document.querySelector(".enterMail");
//     let setMessage = document.querySelector(".enterMessage");

//     setName.value = name.value;
//     setEmail.value = email.value;
//     setMessage.value = message.value;

// })


function changePlaceholder (element,value){
    element.placeholder = value;
    console.log(element,value)
}

const userName = document.getElementsByClassName("userName")[0]
const userEmail = document.getElementsByClassName("userEmail")[0]
const userMessage = document.getElementsByClassName("userMessage")[0]
const enterName = document.getElementsByClassName("enterName")[0]
const enterEmail = document.getElementsByClassName("enterMail")[0]
const enterMessage = document.getElementsByClassName("enterMessage")[0]
changePlaceholder(userName,"FSJS 2.0")
changePlaceholder(userName,"FSJS 2.0")
changePlaceholder(userEmail,"fsjs@ineuron.ai")
changePlaceholder(enterEmail,"fsjs@ineuron.ai")
changePlaceholder(enterMessage,"Hello World")
changePlaceholder(userMessage,"Hello World")

