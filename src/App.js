import React, { Component } from 'react';
import './App.css';

import { Navbar } from './components/Navbar';
import CustomSidebar from './components/CustomSidebar';
import Messages from './components/Messages';

class App extends Component {

  constructor(props){
    super(props);
    this.objs = [];
    this.names = ['Rachana','Pranav','Taruni','Katy','Chanakya'];
    for(var i=0; i<this.names.length; i++) {
      this.objs.push(<Messages name={this.names[i]} key={i}></Messages>);
    }
  }

  render() {
    return (
      <div>
        <Navbar></Navbar>
        <div className="row">
          <div className="col-sm-3">
            <CustomSidebar class="cs"></CustomSidebar>
          </div>
          <div className="col-sm-9" style={{minHeight: '100vh'}}>
            Main Page
            {this.objs}
          </div>
        </div>
      </div>
    );
  }
}

export default App;
