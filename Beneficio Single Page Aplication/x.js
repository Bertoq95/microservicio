var beneficios = null;

const BASE_URL = 'http://localhost:8080/beneficio/';
const headers = new Headers();
headers.set('Authorization', 'Basic ' + btoa("Bertoni" + ":" + "gylgroup"));

//lista de beneficios fetch
fetch(BASE_URL + 'lista-beneficios', { headers: headers })
    .then(function(response){
        return response.json();
    })
    .then(function(beneficios){
        console.log(beneficios);
        mostrarDatos(beneficios);
    });