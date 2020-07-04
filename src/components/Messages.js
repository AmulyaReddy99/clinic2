import React from 'react';

class Messages extends React.Component{

    constructor(props){
        super(props);
        this.objs = [];
        this.state = { current_member: "" }
        this.names = {
            'C1': ['Hello.. Hw r ya?????? how r u doing.. hw is it in bangalore.. so long..!','cool','fine','how about hitachi?'],
            'C2': ['I am fine..','cool','hw is jpmc','good'],
            'C3': ['Happy birthday bro!'],
            'C4': ['Ok'],
            'C5': ['Met charan yesterday','nice']
        };
        for(var key in this.names) {
            this.objs.push(<Members name={key} key={key} parentCallback={this.callback}></Members>);
        }
    }

    callback = (current_member) => {
        console.log("Parent",current_member);
        this.setState({current_member: current_member})
    }

    render(){
        return (
            <div className="row">
              <div className="col-sm-3" >
                {this.objs}
              </div>
              <div className="col-sm-9">  
                {/* {this.Messages} */}
                <h1>{this.state.current_member}</h1>
              </div>
            </div>
        );
    }
}

class Members extends React.Component {
    constructor(props){
        super(props);
        this.state = {
            current_member:''
        };
    }

    changeMember(name){
        console.log(name);
        this.setState({
          current_member: name
        });
        this.props.parentCallback(name);
    }

    render(){
        return <p className="list" onClick={()=>this.changeMember(this.props.name)}>{this.props.name}</p>
    }
};

export default Messages;