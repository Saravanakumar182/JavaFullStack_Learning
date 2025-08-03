// src/register.js
import React, { useState } from 'react';
import './App.css';

const Register = () => {
  const [form, setForm] = useState({
    name: '',
    email: '',
    password: ''
  });

  const [errors, setErrors] = useState({});

  const validate = () => {
    const errs = {};

    if (form.name.length < 5) {
      errs.name = "Name must be at least 5 characters.";
    }

    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailRegex.test(form.email)) {
      errs.email = "Please enter a valid email address.";
    }
    if (!form.email.includes('@') || !form.email.includes('.')) {
      errs.email = "Email must contain '@' and '.'";
    }

    if (form.password.length < 8) {
      errs.password = "Password must be at least 8 characters.";
    }

    setErrors(errs);
    return Object.keys(errs).length === 0;
  };

  const handleChange = (e) => {
    const { name, value } = e.target;
    setForm({ ...form, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validate()) {
      alert("Registration Successful!");
      setForm({ name: '', email: '', password: '' });
      setErrors({});
    }else{
        let err = Object.values(errors).join('\n');
        
        alert(err);
    }
  };

  return (
    <div className="form-container">
      <h2>User Registration</h2>
      <form onSubmit={handleSubmit} noValidate>
        <label>Name:</label>
        <input
          type="text"
          name="name"
          value={form.name}
          onChange={handleChange}
          placeholder="Enter your name"
        />

        <label>Email:</label>
        <input
          type="email"
          name="email"
          value={form.email}
          onChange={handleChange}
          placeholder="Enter your email"
        />

        <label>Password:</label>
        <input
          type="password"
          name="password"
          value={form.password}
          onChange={handleChange}
          placeholder="Enter your password"
        />

        <button type="submit">Register</button>
      </form>
    </div>
  );
};

export default Register;
