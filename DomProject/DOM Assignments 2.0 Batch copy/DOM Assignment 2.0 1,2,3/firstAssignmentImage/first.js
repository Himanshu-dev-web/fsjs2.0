


// Task 1 

let  element = document.createElement('li');
element.innerHTML=`<a>Hire Me</a>`;
const menu = document.querySelector('header nav ul');
menu.appendChild(element);


// Task 2
let input = document.querySelector(".search-field input");
input.placeholder = "Search my Project";


//Task 3

let item = document.querySelectorAll(".hero-left-section p span");
item[1].innerText= "An Employee";
item[2].innerText= "Ineuron Intelligence Private Limited ";


//Task 4

let img = document.querySelector(".hero-right-section img");
img.src="https://yt3.googleusercontent.com/ytc/AL5GRJUyTXpRBuqZYPgLhRJvWBXCj8TLx6w6WX2k6y_B8A=s900-c-k-c0x00ffffff-no-rj";



//Task 5


let btn  = document.createElement('button');
btn.innerText="Support Me";
let parent = document.querySelector(".hero-right-section-btns");
parent.appendChild(btn);
