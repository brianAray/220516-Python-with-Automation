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


// console.log(funcString)