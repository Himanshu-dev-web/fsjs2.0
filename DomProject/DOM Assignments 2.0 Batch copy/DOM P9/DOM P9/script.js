

const maintitle = document.querySelector(".caption > .title");

maintitle.style.color = "#dc143c";

const addtocartbtn = document.querySelector(".add-to-cart");


addtocartbtn.addEventListener("mouseenter", (event) => {
    addtocartbtn.style.backgroundColor = "#dc143c";
});

addtocartbtn.addEventListener("mouseleave", (event) => {
    addtocartbtn.style.backgroundColor = "hsl(157, 37%, 20%)";
});