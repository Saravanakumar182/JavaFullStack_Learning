// src/ComplaintRegister.js
import React, { useState } from 'react';

const ComplaintRegister = () => {
  const [name, setName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!name.trim() || !complaint.trim()) {
      alert('Please fill in both fields.');
      return;
    }

    const referenceNumber = Math.floor(1000 + Math.random() * 9000);
    alert(`Complaint submitted!\nName: ${name}\nReference No: ${referenceNumber}`);
    
    setName('');
    setComplaint('');
  };

  return (
    <div className="form-container">
      <h2>Complaint Registration</h2>
      <form onSubmit={handleSubmit}>
        <label>Employee Name:</label>
        <input
          type="text"
          value={name}
          onChange={(e) => setName(e.target.value)}
          placeholder="Enter your name"
          required
        />

        <label>Complaint:</label>
        <textarea
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          placeholder="Describe your issue"
          rows="4"
          required
        ></textarea>

        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
};

export default ComplaintRegister;
