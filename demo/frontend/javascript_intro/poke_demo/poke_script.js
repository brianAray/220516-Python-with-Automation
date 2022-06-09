let body = document.querySelector("body")

let search_container = document.querySelector("#poke_search_container")
let poke_container = document.querySelector("#poke_container")

let number_input = search_container.children[0]
let button = number_input.nextElementSibling

button.addEventListener("click", readNumber)


function readNumber(){
    let pokeNumber = number_input.value
    asyncGetPokemon(pokeNumber)
    // getPokemonFromAPI(pokeNumber)
}

// function getPokemonFromAPI(number){
//     let pokeApiUrl = `https://pokeapi.co/api/v2/pokemon/${number}`
    
//     fetch(pokeApiUrl).then(response => {
//         response.json().then(
//             json_body => {
//                 generatePokemon(json_body)
//             }
//         )
//     })
// }

async function asyncGetPokemon(number){
    let pokeApiUrl = `https://pokeapi.co/api/v2/pokemon/${number}`
    try{
        let response_body = await fetch(pokeApiUrl, {
            method: "GET"
        })
        let data = await response_body.json()
        generatePokemon(data)
    }catch(e){
        alert("Failed to get the pokemon")
    }
}

function generatePokemon(poke_json){

    let stat_container = poke_container.children[0]
    let image_container = poke_container.children[1]
    
    if(image_container.childElementCount){
        removeChildren(stat_container)
        removeChildren(image_container)
    }

    getPokeImage(poke_json.sprites.front_shiny, image_container)
    getPokeStats(poke_json.stats, stat_container)
}

function getPokeImage(url, image_container){
    let image_element = document.createElement("img")
    image_element.src = url
    image_container.append(image_element)
}

function getPokeStats(stat_array, stat_container){
    
    for (stats of stat_array){
        let header = document.createElement("h5")
        header.innerText = `${stats.stat.name} : ${stats.base_stat}`
        stat_container.append(header)
    }
}

function removeChildren(container){
    while(container.firstElementChild){
        container.removeChild(container.firstElementChild)
    }
}
