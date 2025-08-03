import React from 'react';
import './App.css'

const GuestPage = ({ onLogin }) => (
  <div>
    <h2>Welcome Guest!</h2>
    <p>You can browse available flights.</p>
    <button onClick={onLogin}>Login to Book Tickets</button>
  </div>
);

export default GuestPage;
