import React, { Component } from 'react';

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
      isLoading: true,
      error: null
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch('https://api.randomuser.me/');
      const data = await response.json();
      this.setState({ user: data.results[0], isLoading: false });
    } catch (err) {
      this.setState({ error: 'Failed to fetch user', isLoading: false });
    }
  }

  render() {
    const { user, isLoading, error } = this.state;

    if (isLoading) return <p>Loading user data...</p>;
    if (error) return <p>{error}</p>;

    return (
      <div style={{ textAlign: 'center', padding: '20px' }}>
        <h2>User Details</h2>
        <img src={user.picture.large} alt="User" style={{ borderRadius: '50%' }} />
        <h3>{user.name.title} {user.name.first}</h3>
      </div>
    );
  }
}

export default Getuser;
