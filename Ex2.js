

let input1 = document.getElementById("txtVal1");
let input2 = document.getElementById("txtVal2");
let result = document.getElementById("result");
let btnAdd = document.getElementById("btnAdd");
let btnSubtract = document.getElementById("btnSubtract");
let btnMultiply = document.getElementById("btnMultiply");
let btnDivide = document.getElementById("btnDivide");


function isValidNumber(input){
    return !isNaN(input) && isFinite(input);
}

function handleEvent(event) {
// retrieve the user input from two input fields, parse them into floating-point numbers, and store them in variables for further processing.
    isValidNumber(input1);
    isValidNumber(input2);

    let val1 = (input1.value);
    let val2 = (input2.value);


    if(event.target === btnAdd){
        result = val1 + val2;
    }else if(btnDivide.onclick){
        if(val2 !== 0){
            result =  val1 / val2;
        }
    }else if(btnSubtract.onclick){
        result = val1 - val2;
    }else if(btnMultiply.onclick){
        result = val1 * val2;
    }

    console.log(result);
}


btnAdd.addEventListener("click", handleEvent);
btnMultiply.addEventListener("click", handleEvent);
btnSubtract.addEventListener("click", handleEvent);
btnDivide.addEventListener("click", handleEvent);








