let bool1 = false
let bool2 = undefined
let bool3 = null
let bool4 = NaN

if(bool1 & bool2 & bool3 & bool4){
    console.log("This should not print out")
}
let string_empty = new String('')
console.log(typeof(string_empty))

if(string_empty){
    console.log("this will print out")
}
if([]){
    console.log("this may pritn out")
}




/*
    Variable Scopes
*/

/*  Functions
    code that exists on the page outside of a function
    Code that is inside a function within a function
*/

let aString = "Hello There"
printer()

function printer(){
    let funcString = "This is inside a function"
    console.log(aString)
    console.log(funcString)
    
    function printer2(){
        console.log(aString)
        console.log(funcString)
        let doubleFunc = "this is inside another function"
    }

    printer2()
}


{
    let y = 2
}

var x = 10

{
    let x = 2
}

console.log(x)

const a = 12
    
// a = "hello"

// Arrays

let cheeses = ['bleu', 'cheddar', 'parmesan']

console.log(cheeses)
console.log(cheeses[2])

console.log(cheeses.length)
cheeses[cheeses.length-1] = "american"
console.log(cheeses)
console.log(cheeses[cheeses.length-1])


let weirdArray = []
weirdArray[0] = "Duck"
weirdArray[weirdArray.length] = "Cat"

weirdArray.push('Person')
console.log(weirdArray)


let arr = [1,2,3,4,5,6,7,8,9]
arr.splice(2, 1)
console.log(arr)

for (let i =0; i <arr.length; i++){
    console.log(arr[i])
}

for (key in weirdArray){
    console.log(weirdArray[key])
}

for (element of weirdArray){
    console.log(element)
}


// Arrow functions

let hello = () => console.log("Hello World")
hello()

let sum = (a , b) => {
    let result = a + b
    return "Sum is: " + result
}

console.log(sum(3, 5))

let anon_func = function (){
    console.log("This is anonymous")
}

anon_func()

// Callback Functions
function funcRunner(functionToRun){
    functionToRun()
}

funcRunner(anon_func)
console.log(typeof(anon_func))

