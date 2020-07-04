import React, { Component } from 'react';
import Sidebar from "react-sidebar";

class CustomSidebar extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            sidebarOpen: true
        };
        this.onSetSidebarOpen = this.onSetSidebarOpen.bind(this);
    }
    onSetSidebarOpen(open) {
        this.setState({ sidebarOpen: open });
    }
    render() {
        return (
          <Sidebar
            sidebar={
                <div className="sidebar">
                    <a href='/details'>Details</a><br></br>
                    <a href='/stats'>Stats</a><br></br>
                    <a href='/msgs'>Messages</a><br></br>
                </div>
            }
            open={this.state.sidebarOpen}
            onSetOpen={this.onSetSidebarOpen}
            styles={{   
                sidebar:{ 
                    background: "white", 
                    width:"90%",  
                    display: 'flex'
                },
            }}
          >
            <button onClick={() => this.onSetSidebarOpen(true)}>
              Open
            </button>
          </Sidebar>
        );
    }
}

export default CustomSidebar;