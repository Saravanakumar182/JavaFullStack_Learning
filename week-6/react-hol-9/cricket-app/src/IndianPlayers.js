import React from "react";

const IndianPlayers = () => {
  const team = ["Kohli", "Rohit", "Gill", "Hardik", "Rahul", "Jadeja"];

  // Destructuring into odd & even team
  const oddTeam = team.filter((_, index) => index % 2 === 0);
  const evenTeam = team.filter((_, index) => index % 2 !== 0);

  // Merge arrays using spread operator
  const T20players = ["Pant", "Sky", "Samson"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane", "Shaw"];
  const mergedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team</h2>
      <ul>
        {oddTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Even Team</h2>
      <ul>
        {evenTeam.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players</h2>
      <ul>
        {mergedPlayers.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
