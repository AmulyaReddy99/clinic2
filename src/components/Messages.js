import React from 'react';

// class Messages extends React.Component{
//     render(){
//         return (
//             <li></li>
//         );
//     }
// }

const Members = props => {
    return <p className="list">{props.name}</p>
};

const Messages = props => {
    return (
        <p></p>
    );
}

export{
    Members,
    Messages
};