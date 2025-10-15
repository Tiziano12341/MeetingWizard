import React from 'react';

export default function
//Webpack Migration in einem Projekt: Spring (Backend, Server) und React (Frontend) zu verbinden
App(){

    const name = "Tiziando222222";
    const date = new Date().getFullYear();

    function greet(name){
        return `Halloo, ${name}`;
    }

    return(
        <div>
            <h1>MeetingWizard22</h1>
            <p>{greet(name)}</p>
        </div>
    );
}