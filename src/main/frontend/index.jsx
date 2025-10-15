import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';

const root = document.getElementById('root');

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

