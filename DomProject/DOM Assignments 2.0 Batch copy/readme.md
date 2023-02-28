# Dom Assignment 1 

# _Task 1_
> The user has to append a new element in the navigation bar name 'hire me ' after the projects 

## After Update
![alt text](./DOM%20Assignment%202.0%201%2C2%2C3/firstAssignmentImage/task1Output.png)

## Solution of task 1 :


```sh
let  element = document.createElement('li');
element.innerHTML=`<a>Hire Me</a>`;
const menu = document.querySelector('.h-ul');
menu.appendChild(element);
```


# _Task 2_
> The user has to change the placeholder to in the navbar searchbar to 'Search My Project'

## After Update
![alt text](./DOM%20Assignment%202.0%201%2C2%2C3/firstAssignmentImage/task2Output.png)

## Solution of task 2 :


```sh
var input = document.querySelector(".search-field input");
input.placeholder = "Search my Project";

```

# _Task 3_
> The user has to change the user information "freelancer" to "An Employee" and "National And Intenational client" to "Ineuron Intelligence Pvt Limited ".

## After Update
![alt text](./DOM%20Assignment%202.0%201%2C2%2C3/firstAssignmentImage/task3Output.png)

## Solution of task 3 :


```sh

let item = document.querySelectorAll(".hero-left-section p span");
item[1].innerText= "An Employee";
item[2].innerText= "Ineuron Intelligence Private Limited ";

```


# _Task 4_
> The user need to change the "avator" image with the image of "Hitesh Master".

## After Update
![alt text](./DOM%20Assignment%202.0%201%2C2%2C3/firstAssignmentImage/task4Output.png)

## Solution of task 4 :


```sh

let img = document.querySelector(".hero-right-section img");
img.src="https://yt3.googleusercontent.com/ytc/AL5GRJUyTXpRBuqZYPgLhRJvWBXCj8TLx6w6WX2k6y_B8A=s900-c-k-c0x00ffffff-no-rj";

```

# _Task 5_
> The user need to add one more button with chat with me button.

## After Update
![alt text](./DOM%20Assignment%202.0%201%2C2%2C3/firstAssignmentImage/task5Output.png)

## Solution of task 5 :


```sh
let btn  = document.createElement('button');
btn.innerText="Support Me";
let parent = document.querySelector(".hero-right-section-btns");
parent.appendChild(btn);
```



#
# Dom Assignment 2


# _Task _
> The user need to add one more section "Skils" in about page .

## After Update
![alt text](../DOM%20Assignments%202.0%20Batch%20copy/DOM%20Assignment%202.0%201%2C2%2C3/secondAssignmentImage/task1Output.png)

## Solution of task  :


```sh
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
```



#
# Dom Assignment 3


# _Task _
> The user need to change the placeholder in contack us page as given in output image.

## After Update
![alt text](../DOM%20Assignments%202.0%20Batch%20copy/DOM%20Assignment%202.0%201%2C2%2C3/thirdAssignmentImage/task1Output.png)

## Solution of task  :


```sh
function changePlaceholder (element,value){
    element.placeholder = value;
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




```


#
# Dom Assignment 4


# _Task _
> The user need to change the footer part color.

## After Update
![alt text](../DOM%20Assignments%202.0%20Batch%20copy/04_DOM%20Project/04_DOM%20Project/Output/DOM%20P1%20SS.png)

## Solution of task  :


```sh
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
```


#
# Dom Assignment 5


# _Task1 _
> The user need to add one more button in navbar section adjacent to contact.

## After Update
![alt text](./05_DOM%20Project/05_DOM%20Project/Output/DOM%20P2%20SS.png)

## Solution of task1  :


```sh
let pdiv = document.querySelectorAll(".nav-center div");
let createa = document.createElement("a");
createa.innerText = "Pro Subscription"
createa.classList.add("btn");
pdiv[2].appendChild(createa);
```
# _Task 2 _
> The user need to add one more recipe item in list "chinese"
## After Update
![alt text](./05_DOM%20Project/05_DOM%20Project/Output/DOM%20P2%20SS.png)

## Solution of task 2 :


```sh
let RecipiesList = document.querySelector(".tags-container div");
let newli = document.createElement("a");
newli.innerText = "Chineses(7)"
RecipiesList.appendChild(newli);
```




#
# Dom Assignment 6


# _Task 1 _
> The user main logo to ineuron logo.

## After Update
![alt text](./06_DOM%20Project/06_DOM%20Project/Output/DOM%20P3%20SS-1.png)

## Solution of task1  :


```sh
const logo = document.querySelector("header  img")
logo.src = "./assets/ineuron-logo.png"

```

# _Task 2 _
> The user needs to change the price to 10$.

## After Update
![alt text](./06_DOM%20Project/06_DOM%20Project/Output/DOM%20P3%20SS-2.png)

## Solution of task 2  :


```sh
const appPrice = document.querySelector(".app_price span");
appPrice.innerText = "$10";
```


#
# Dom Assignment 7


# _Task 1 _
> The user needs to remove every language that includes 2.0 in their name.

## After Update
![alt text](./DOM%20P7/DOM%20P7/ass7.1-after.png)

## Solution of task1  :


```sh
let lang = document.querySelectorAll(".main__languages > a")

let languages = [...lang];

languages.forEach(elem => {
    if (elem.innerText.includes("2.0")) {
        elem.style.display = "none"
    }
})

```


# _Task 2 _
> The user needs use js to write something in the input box and submit the form and the language in the left card should come back.

## After Update
![alt text](./DOM%20P7/DOM%20P7/ass7.2-after.png)

## Solution of task 2  :


```sh


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
```



#
# Dom Assignment 8


# _Task 1 _
> The user needs to add scroller bar.

## After Update
![alt text](./DOM%20P8/DOM%20P8/ass8.1-after.png)

## Solution of task1  :


```sh

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

```

# _Task 2 _
> The user needs to remove background image.

## After Update
![alt text](./DOM%20P8/DOM%20P8/ass8.2-after.png)

## Solution of task 2  :


```sh
document.body.style.backgroundImage = "none";

```

# _Task 3 _
> The user needs to add toggle functionality in navgation bar.

## After Update
![alt text](./DOM%20P8/DOM%20P8/ass8.3-after.png)

## Solution of task 3  :


```sh
const collapseNavbar = document.querySelector('.collapse');
const collapsebtn = document.querySelector('.navbar-toggler');

collapsebtn.addEventListener('click', function() {
    
    if(collapseNavbar.style.display === "block"){
        collapseNavbar.style.display = "none"
    }else{
        collapseNavbar.style.display = "block";
    }
    
})

```




#
# Dom Assignment 9


# _Task 1 _
> The user needs chagne colour of main title of page to red.

## After Update
![alt text](./DOM%20P9/DOM%20P9/ass9.1-after.png)

## Solution of task1  :


```sh
const maintitle = document.querySelector(".caption > .title");
maintitle.style.color = "#dc143c";
```

# _Task 2 _
> The user needs to adds hover functionality that changes colour on hover to red of add to card button.

## After Update
![alt text](./DOM%20P9/DOM%20P9/ass9.2-after.png)

## Solution of task 2  :


```sh
const addtocartbtn = document.querySelector(".add-to-cart")
addtocartbtn.addEventListener("mouseenter", (event) => {
    addtocartbtn.style.backgroundColor = "#dc143c";
});
addtocartbtn.addEventListener("mouseleave", (event) => {
    addtocartbtn.style.backgroundColor = "hsl(157, 37%, 20%)";
});
```