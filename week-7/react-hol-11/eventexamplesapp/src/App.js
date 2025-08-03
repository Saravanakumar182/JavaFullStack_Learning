import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';
import './App.css'

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0,
    };

    // Binding for class methods
    this.incrementCounter = this.incrementCounter.bind(this);
    this.sayHello = this.sayHello.bind(this);
    this.handleIncrementClick = this.handleIncrementClick.bind(this);
    this.sayWelcome = this.sayWelcome.bind(this);
    this.handleSyntheticEvent = this.handleSyntheticEvent.bind(this);
  }

  incrementCounter() {
    this.setState(prevState => ({ count: prevState.count + 1 }));
  }

  sayHello() {
    console.log("Hello! This is a static message.");
  }

  handleIncrementClick() {
    this.incrementCounter();
    this.sayHello();
  }

  sayWelcome(message) {
    alert(`Message: ${message}`);
  }

  handleSyntheticEvent(e) {
    e.preventDefault();
    alert("I was clicked");
  }

  render() {
    return (
      <div className='app-container' style={{ padding: '20px' }}>
        <h1>React Event Examples</h1>
        <p>Counter: {this.state.count}</p>

        <button onClick={this.handleIncrementClick}>Increase</button>
        <button onClick={() => this.setState({ count: this.state.count - 1 })}>Decrease</button>

        <br /><br />
        <button onClick={() => this.sayWelcome('Welcome!')}>Say Welcome</button>

        <br /><br />
        <button onClick={this.handleSyntheticEvent}>Synthetic Event</button>

        <hr />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
