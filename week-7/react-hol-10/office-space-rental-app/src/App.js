import React from 'react';
import tower from './assets/office-space-2.jpg'

function App() {
  const heading = <h1>Office Space Rental</h1>;


  const office = {
    name: "Corporate Tower",
    rent: 55000,
    address: "123 Tech Park, Chennai"
  };

  const officeList = [
    { name: "Skyview Plaza", rent: 45000, address: "Bangalore" },
    { name: "GreenTech Hub", rent: 75000, address: "Hyderabad" },
    { name: "Innovation Center", rent: 62000, address: "Pune" },
  ];

  const getRentStyle = (rent) => {
    return {
      color: rent > 60000 ? 'green' : 'red',
      fontWeight: 'bold'
    };
  };

  return (
    <div style={{ padding: '20px' }}>
      {heading}

      <img src={tower} alt="Office Space"  />

      <h2>{office.name}</h2>
      <p style={getRentStyle(office.rent)}>Rent: ₹{office.rent}</p>
      <p>Address: {office.address}</p>

      <hr />

      <h2>Other Available Spaces</h2>
      {officeList.map((item, index) => (
        <div key={index} style={{ marginBottom: '15px', borderBottom: '1px solid #ccc', paddingBottom: '10px' }}>
          <h3>{item.name}</h3>
          <p style={getRentStyle(item.rent)}>Rent: ₹{item.rent}</p>
          <p>Address: {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;
