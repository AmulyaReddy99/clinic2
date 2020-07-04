import React, { Component } from 'react';
import './App.css';

import { Navbar } from './components/Navbar';
import CustomSidebar from './components/CustomSidebar';
import { Messages, Members } from './components/Messages';

class App extends Component {

  constructor(props){
    super(props);
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

  render() {
    return (
      <div>
        <Navbar></Navbar>
        <div className="row">
          <div className="col-sm-3">
            <CustomSidebar></CustomSidebar>
          </div>
          <div className="col-sm-9" style={{minHeight: '100vh'}}>
            <div className="row">
              <div className="col-sm-3" >
                {this.objs}
              </div>
              <div className="col-sm-9">  
                {/* {this.Messages} */}
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
