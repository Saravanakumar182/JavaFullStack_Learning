import { Link } from "react-router-dom";

export default function TrainersList({ data }) {
  return (
    <div>
      <h2>Trainers List</h2>
      <ul>
        {data.map(trainer => (
          <li key={trainer.trainerId}>
            <Link to={`/trainer/${trainer.trainerId}`}>{trainer.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}
