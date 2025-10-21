import React from 'react';

export default function
//Webpack Migration in einem Projekt: Spring (Backend, Server) und React (Frontend) zu verbinden
App(){

    const name = "Tiziano1234";
    const date = new Date().getFullYear();

    function greet(name){
        return `Halldo, ${name}`;
    }

    return(
        <div>
            <h1>MeetingWizard</h1>
            <p>{greet(name)}</p>
        </div>
    );
}