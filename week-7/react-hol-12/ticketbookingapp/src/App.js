import React, { Component } from 'react';
import GuestPage from './GuestPage';
import UserPage from './UserPage';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isLoggedIn: false,
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  }

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  }

  render() {
    let page;
    if (this.state.isLoggedIn) {
      page = <UserPage onLogout={this.handleLogout} />;
    } else {
      page = <GuestPage onLogin={this.handleLogin} />;
    }

    return (
      <div className="App">
        <h1>Flight Ticket Booking System</h1>
        {page}
      </div>
    );
  }
}

export default App;
