# Dom Assignment 1 

# _Task 1_
> The user has to append a new element in the navigation bar name 'hire me ' after the projects 

## After Update
![task1Output](https://user-images.githubusercontent.com/55054295/221917530-c1a5d6c7-3e78-4724-847a-170899fe15c3.png)

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
![task2Output](https://user-images.githubusercontent.com/55054295/221917591-d1066b18-5fe4-46fb-813c-7cd10685657a.png)


## Solution of task 2 :


```sh
var input = document.querySelector(".search-field input");
input.placeholder = "Search my Project";

```

# _Task 3_
> The user has to change the user information "freelancer" to "An Employee" and "National And Intenational client" to "Ineuron Intelligence Pvt Limited ".

## After Update
![task3Output](https://user-images.githubusercontent.com/55054295/221917651-9d7624cc-7a55-4cca-858b-0f4323eeec19.png)


## Solution of task 3 :


```sh

let item = document.querySelectorAll(".hero-left-section p span");
item[1].innerText= "An Employee";
item[2].innerText= "Ineuron Intelligence Private Limited ";

```


# _Task 4_
> The user need to change the "avator" image with the image of "Hitesh Master"

## After Update
![Uploading task4Output.png…]()

## Solution of task 4 :


```sh

let img = document.querySelector(".hero-right-section img");
img.src="https://yt3.googleusercontent.com/ytc/AL5GRJUyTXpRBuqZYPgLhRJvWBXCj8TLx6w6WX2k6y_B8A=s900-c-k-c0x00ffffff-no-rj";

```

# _Task 5_
> The user need to add one more button with chat with me button.

## After Update
![task5Output](https://user-images.githubusercontent.com/55054295/221917836-8ec4ce5b-b68d-4b06-b01e-b9308e791b08.png)

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

## After 
![task2Output](https://user-images.githubusercontent.com/55054295/221918251-4dfb2bb2-9d6f-4c57-8cf5-a73420a7aa82.png)

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
![task1Output](https://user-images.githubusercontent.com/55054295/221918311-9a08c9f5-8ddb-4efd-94b1-489766b4ee9f.png)

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

![DOM P1 SS](https://user-images.githubusercontent.com/55054295/221918387-decbcda3-f282-4596-b32e-85b7d4e26dc0.png)


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
![DOM P2 SS](https://user-images.githubusercontent.com/55054295/221918443-51f63235-e155-4632-8a57-b084cd022695.png)

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
![DOM P3 SS-1](https://user-images.githubusercontent.com/55054295/221918510-8019bf9d-f7ce-406f-851e-474f92555d58.png)


## Solution of task1  :


```sh
const logo = document.querySelector("header  img")
logo.src = "./assets/ineuron-logo.png"

```

# _Task 2 _
> The user needs to change the price to 10$.

## After Update

![DOM P3 SS-2](https://user-images.githubusercontent.com/55054295/221918535-174a1765-1664-4676-8e99-ae99c91117ee.png)


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
![ass7 1-after](https://user-images.githubusercontent.com/55054295/221918614-7a58b1a2-d580-4797-9695-290cfcf4f2d6.png)


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

![ass7 2-after](https://user-images.githubusercontent.com/55054295/221918684-1998508b-6f4e-4009-9134-6353429a9f82.png)


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

<img width="770" alt="ass8 1-after" src="https://user-images.githubusercontent.com/55054295/221918754-1d482d7d-a465-4581-bf71-c5989ecd34ac.png">


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

![ass8 2-after](https://user-images.githubusercontent.com/55054295/221918805-9978f763-9ad1-4638-8ccb-4083842e4d4e.png)

## Solution of task 2  :


```sh
document.body.style.backgroundImage = "none";

```

# _Task 3 _
> The user needs to add toggle functionality in navgation bar.

## After Update


## Solution of task 3  :

![ass8 3-after](https://user-images.githubusercontent.com/55054295/221918840-d5684260-6dc5-4561-aba8-fe4df35cc398.png)


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
![ass9 1-after](https://user-images.githubusercontent.com/55054295/221918927-aa17675b-14ba-4dde-9276-a13c01732235.png)


## Solution of task1  :


```sh
const maintitle = document.querySelector(".caption > .title");
maintitle.style.color = "#dc143c";
```

# _Task 2 _
> The user needs to adds hover functionality that changes colour on hover to red of add to card button.

## After Update

![ass9 2-after](https://user-images.githubusercontent.com/55054295/221919009-4a3ffe9a-0bad-496f-b177-cb8212d7ad35.png)

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
