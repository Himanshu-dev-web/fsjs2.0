
const buttons = document.querySelectorAll("button");
const screenDisplay = document.querySelector(".screen");

let calculation = [];
let accumulativeCalc;

function calc(button){
    const val = button.textContent;
    console.log(val);
    if(val === "Clear"){
        calculation = [];
        screenDisplay.textContent = '.';
    }
    else if(val === "="){
        screenDisplay.textContent = eval(accumulativeCalc);
    }
    else if(val === "Delete"){
        calculation.pop();
        accumulativeCalc = calculation.join('')
        screenDisplay.textContent = accumulativeCalc;
    }
    else{
        calculation.push(val);
        accumulativeCalc = calculation.join('')
        screenDisplay.textContent = accumulativeCalc;
    }
   
}

buttons.forEach(button => button.addEventListener('click',() =>  calc(button)));
