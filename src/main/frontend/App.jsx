import React from 'react';
import "Styles/style.css";
import Menu from "./Menu";

export default function App() {
    return (
        <div id="main">
            <div id="header"></div>
            <div id="content">
                <div id="menu">
                    <Menu />
                </div>
                <div id="meeting-content"></div>
            </div>
            <div id="footer"></div>
        </div>
    );
}
