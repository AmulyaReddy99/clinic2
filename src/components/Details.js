import React, { useState } from 'react'

function HookCounter(){
    const [count, setCount] = useState(0)
    const incFive = () => {
        for(let i=0; i<5; i++){
            setCount(prevCount => prevCount + 1)
        }
    }
    return (
        <React.Fragment>
            <button onClick={()=>setCount(count+1)}>Current {count}</button>
            <button onClick={()=>incFive(count+1)}>Inc 5 {count}</button>
        </React.Fragment>
    )
}

class Details extends React.Component{

    // constructor(props){
    //     super(props);
    //     this.state = {
    //         count: 0
    //     }
    // }

    // incrementCount = () => {
    //     this.setState({
    //         count: this.state.count+1
    //     })
    // }

    render(){
        return(
        <div>
            {/* <button onClick={this.incrementCount}>{this.state.count}</button> */}
            <HookCounter></HookCounter>
        </div>
        );
    }
}

export default Details;