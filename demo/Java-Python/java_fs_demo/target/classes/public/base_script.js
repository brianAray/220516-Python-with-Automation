let body = document.querySelector("body")

let search_container = document.querySelector("#supplier_search_container")
let information_container = document.querySelector("#information_container")

let number_input = search_container.children[0]
let button = number_input.nextElementSibling

button.addEventListener("click", readNumber)

function readNumber(){
    let supplier_id = number_input.value
    getSupplier(supplier_id)
}

function generateSupplierInfo(supplier_data){
    let items = []
    
    supplier_data.items.forEach(element => {
        getItemWithUrl(element.url, items)
    });
}


async function getItemWithUrl(url, itemsArray){
    try{
        let response_body = await fetch(url, {
            method: "GET"
        })
        let data = await response_body.json()
        let item_info = document.querySelector("#item_info")
        item_info.innerHTML = `name: ${data.item_name} price: ${data.price}`
    }catch(e){
        console.log(e)
    }
}

async function getItem(id){
    let url = `http://localhost:9090/item/${id}`

    try{
        let response_body = await fetch(url, {
            method: "GET"
        })
        let data = await response_body.json()
        return data
    }catch(e){
        console.log(e)
    }
}
async function getSupplier(id){
    let url = `http://localhost:9090/supplier/${id}`

    try{
        let response_body = await fetch(url, {
            method: "GET"
        })
        let data = await response_body.json()
        generateSupplierInfo(data)
    }catch(e){
        console.log(e)
    }
}

async function getAllSuppliers(){
    let url = "http://localhost:9090/supplier/all"

    try{
        let response_body = await fetch(url, {
            method: "GET"
        })
        let data = await response_body.json()
        console.log(data)
    }catch(e){
        console.log(e)
    }
}
async function getAllItems(){
    let url = "http://localhost:9090/item/all"

    try{
        let response_body = await fetch(url, {
            method: "GET"
        })
        let data = await response_body.json()
        console.log(data)
    }catch(e){
        console.log(e)
    }
}