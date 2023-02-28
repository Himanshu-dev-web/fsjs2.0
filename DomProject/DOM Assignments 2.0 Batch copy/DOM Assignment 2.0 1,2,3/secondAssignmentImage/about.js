//Task

let element =  document.querySelector(".accordian-wrapper");
let newdiv = document.createElement("div");
let h3 = document.createElement("h3");
let p = document.createElement("p");

newdiv.classList.add("accordian");
h3.innerText="Skills";
p.innerText="I have Very good commmand over fullstack technologies like Mean and Mern";
newdiv.appendChild(h3)
newdiv.appendChild(p);

element.appendChild(newdiv);

