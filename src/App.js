import React, { Component } from 'react';
import './App.css';

import { Navbar } from './components/Navbar';
import CustomSidebar from './components/CustomSidebar';
import Messages from './components/Messages';

class App extends Component {

  constructor(){
    super();
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
            <Messages></Messages>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
