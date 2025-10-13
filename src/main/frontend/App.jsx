import React from 'react';

export default function App(){

    const name = "Tiziano";
    const date = new Date().getFullYear();

    function greet(name){
        return `Hallo, ${name}`;
    }

    return(
        <div>
            <h1>MeetingWizard</h1>
            <p>{greet(name)}</p>
        </div>
    );
}
//Webpack Migration in einem Projekt: Spring (Backend, Server) und React (Frontend) zu verbinden
