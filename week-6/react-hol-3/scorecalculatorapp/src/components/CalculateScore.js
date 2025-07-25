import React from 'react';
import '../stylesheets/mystyle.css';

function calcScore(total, goal) {
  if (!goal || goal === 0) return 'N/A';
  return (total / goal).toFixed(2);
}

export const CalculateScore = ({ Name, School, total, goal }) => (
  <div className="formatstyle">
    <h1 style={{ color: 'brown' }}>Student Details:</h1>

    <div className="Name">
      <strong><span>Name: </span></strong>
      <span>{Name}</span>
    </div>

    <div className="School">
      <strong><span>School: </span></strong>
      <span>{School}</span>
    </div>

    <div className="Total">
      <strong><span>Total: </span></strong>
      <span>{total}</span>
      <span> Marks</span>
    </div>

    <div className="Score">
      <strong>Score: </strong>
      <span>{calcScore(total, goal)}</span>
    </div>
  </div>
);
