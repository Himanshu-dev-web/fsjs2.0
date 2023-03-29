import { useState,useEffect } from 'react'

import './App.css'

function App() {

    const [pokemondetails, setPokemondetails] = useState([]);
    const fetchData = async() => {

      const data = await fetch("https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0");

      const pokdata = await data.json();

      setPokemondetails(pokdata.results);
      console.log(pokemondetails);
    }


  useEffect(() => {
      fetchData();
      
  }, []);

  return (
    <div className="App">
            {
              pokemondetails.slice(0,20).map((result,i) => {
                return (
                  <>
                  <a href={result.url}>click</a>
                  <h1>{result.name}</h1>
                  </>
                )
              })
            }
    </div>
  )
}

export default App
