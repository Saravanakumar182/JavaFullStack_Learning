import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 90 },
    { name: "Rohit", score: 45 },
    { name: "Gill", score: 76 },
    { name: "Ishan", score: 50 },
    { name: "Rahul", score: 35 },
    { name: "Hardik", score: 80 },
    { name: "Jadeja", score: 60 },
    { name: "Ashwin", score: 25 },
    { name: "Bumrah", score: 70 },
    { name: "Siraj", score: 72 },
    { name: "Kuldeep", score: 55 }
  ];


  return (
    <div>
      <h2>High Scoring Players (Score ≥ 70)</h2>
      <ul>
        {players.filter(player => player.score >=70).map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
