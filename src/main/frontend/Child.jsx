import React from 'react';

export default function Child(){

    const [age,setAge] = useState(0);
    const [name,setName] = useState('');
    const date = new Date().getFullYear();

    function getOlder(){
        setAge(age+1);
    }


    return(
        <div>
            <h1>MeetingWizard</h1>
            <p>{greet(name)}</p>qqq
        </div>
    );
}

