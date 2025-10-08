import React from 'react';

export default function Child(props){

    const [age,setAge] = useState(0);
    const date = new Date().getFullYear();

    function getOlder(){
        setAge(age+1);
    }

    return(
        <div>
            <h1>MeetingWizard</h1>
            <p>hallo {props.name}</p>
            <p>alter {props.alter}</p>
        </div>
    );
}

