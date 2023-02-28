// Task 1


const newscontainer = document.getElementsByClassName('col-lg-4 new')[0];
newscontainer.style.overflow = "scroll";

const h2 = document.getElementsByClassName("new-head")[2];
const p = document.getElementsByClassName('new-p')[2];
const line = document.getElementsByClassName('hr-line')[1];

const newLine = line.cloneNode(true);
const newHeading = h2.cloneNode(true)
const newPara = p.cloneNode(true);

newHeading.innerText = "This is my custom  heading"


newPara.innerText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dignissim massa ut dui rutrum, vel hendrerit ipsum tempus. In purus ante, tincidunt id ornare quis, dignissim nec "

p.insertAdjacentElement('afterend', newLine).insertAdjacentElement('afterend', newHeading).insertAdjacentElement("afterend", newPara)


//task 2
document.body.style.backgroundImage = "none";



//task 3
const collapseNavbar = document.querySelector('.collapse');
const collapsebtn = document.querySelector('.navbar-toggler');

collapsebtn.addEventListener('click', function() {
    
    if(collapseNavbar.style.display === "block"){
        collapseNavbar.style.display = "none"
    }else{
        collapseNavbar.style.display = "block";
    }
    
})
