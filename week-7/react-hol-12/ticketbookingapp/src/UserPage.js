import React from 'react';

const UserPage = ({ onLogout }) => (
  <div>
    <h2>Welcome User!</h2>
    <p>You are now logged in. You can book your tickets below.</p>
    <button onClick={onLogout}>Logout</button>
  </div>
);

export default UserPage;
