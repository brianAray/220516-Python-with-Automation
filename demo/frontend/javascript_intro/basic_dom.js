let header = document.querySelector("h1")

let div = document.querySelector("#div_id")

console.log(header)
console.log(div)


let nameArray = ["Brian", "Greg", "James"]

let nameDiv = document.createElement("div")

function createHeader(name){
    let nameHeader = document.createElement("h1")
    nameHeader.innerText = name
    return nameHeader
}

for (element of nameArray){
    let header = createHeader(element)
    nameDiv.append(header)
}

let body = document.querySelector("body")
body.append(nameDiv)
