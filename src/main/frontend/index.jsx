import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

const root = document.getElementById('root');

const meetings = [
    {id: 1, meetingName:'StandUp', anzahl: 3},
    {id: 2, meetingName:'ProduktivesArbeiten', anzahl: 1},
    {id: 3, meetingName:'Kündigungsgespräch', anzahl: 20},
]


const render = () => {
    ReactDOM.render(<App />, root);
};

render();

// Enable hot reloading
if (module.hot) {
    module.hot.accept('./App', () => {
        render();
    });
}

