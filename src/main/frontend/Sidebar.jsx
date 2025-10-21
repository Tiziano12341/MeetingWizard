import React, {useState} from 'react';

const Sidebar = () => {

    const meetings = [
        {id: 1, meetingName:'StandUp', anzahl: 3},
        {id: 2, meetingName:'ProduktivesArbeiten', anzahl: 1},
        {id: 3, meetingName:'Kündigungsgespräch', anzahl: 20},
    ]

    return(
        <table boarder = "1">
            <thead>
                <tr>
                    <th>ID</th><th>MeetingName</th><th>Anzahl</th>
                </tr>
            </thead>
            <tbody>
            {meetings.map((m) =>(
                <tr>
                    <td>{m.id}</td>
                    <td>{m.meetingName}</td>
                    <td>{m.anzahl}</td>
                </tr>
            ))}
            </tbody>
        </table>
    );
}


