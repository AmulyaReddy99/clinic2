import React from 'react';

class Messages extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            current_member:''
        };
        this.objs = [];
        this.names = {
            'C1': ['Hello.. Hw r ya?????? how r u doing.. hw is it in bangalore.. so long..!','cool','fine','how about hitachi?'],
            'C2': ['I am fine..','cool','hw is jpmc','good'],
            'C3': ['Happy birthday bro!'],
            'C4': ['Ok'],
            'C5': ['Met charan yesterday','nice']
        };
        for(var key in this.names) {
            this.objs.push(<Members name={key} key={key}></Members>);
        }
    }
    
    changeMember(name){
        this.setState({
          current_member: name
        })
    }

    render(){
        return (
            <div className="row">
              <div className="col-sm-3" >
                {this.objs}
              </div>
              <div className="col-sm-9">  
                {/* {this.Messages} */}
              </div>
            </div>
        );
    }
}

const Members = props => {
    return <p className="list" onClick={()=>Messages.changeMember(props.name)}>{props.name}</p>
};

export default Messages;