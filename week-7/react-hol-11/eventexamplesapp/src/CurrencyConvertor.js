// src/CurrencyConvertor.js
import React, { Component } from 'react';
import './App.css';


class CurrencyConvertor extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: '',
      euro: null
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(e) {
    this.setState({ rupees: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    const euroRate = 0.011; 
    const euro = this.state.rupees * euroRate;
    this.setState({ euro });
  }

  render() {
    return (
      <div className='currency-collection'>
        <h2>Currency Convertor</h2>
        <form onSubmit={this.handleSubmit}>
          <label>INR: </label>
          <input
            type="number"
            value={this.state.rupees}
            onChange={this.handleChange}
          />
          <button type="submit">Convert</button>
        </form>
        {this.state.euro !== null && (
          <p>Converted Amount: €{this.state.euro.toFixed(2)}</p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
