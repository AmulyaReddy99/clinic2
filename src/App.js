import React, { Component } from 'react';
import './App.css';

import { Navbar } from './components/Navbar';
import CustomSidebar from './components/CustomSidebar';
import Details from './components/Details';
import Stats from './components/Stats';
import Messages from './components/Messages';
import { BrowserRouter as Router, Switch, Route} from 'react-router-dom';

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
            <Router>
              <Route path='/details' component={Details}/>
              <Route path='/stats' component={Stats}/>
              <Route path='/msgs' component={Messages}/>
            </Router>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
