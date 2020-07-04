import React from 'react';

// class Messages extends React.Component{
//     render(){
//         return (
//             <li></li>
//         );
//     }
// }

const Messages = props => {
    return <li>{props.name}</li>
};

export default Messages;