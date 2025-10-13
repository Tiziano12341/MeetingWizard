import React from 'react';

export default function Child(props){

    const [age,setAge] = useState(0);
    const date = new Date().getFullYear();

    function getOlder(){
        setAge(age+1);
    }

    const inputRef= useRef(null);
    function focusInput(){
        inputRef.current.focus();
    }

    useEffect(() => {
        console.log("useEffect");
    },[age]);

    return(
        <div>
            <h1>MeetingWizard</h1>
            <p>hallo {props.name}</p>
            <p>alter {props.alter}</p>
            <input ref={inputRef}/>
            <button onClick={focusInput()}></button>
        </div>
    );
}

//React Hooks = Funktionen, die React uns anbietet, wichtigste useState Hook