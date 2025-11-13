import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

const rootBezeichner = document.getElementById('rootID');

const render = () => {
    ReactDOM.render(<App />, rootBezeichner);
};
render();

