import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Home from "./components/Home";
import TrainersList from "./TrainersList";
import TrainerDetail from "./TrainerDetail";
import { trainers } from "./TrainersMock";

function App() {
  return (
    <BrowserRouter>
      <nav>
        <Link to="/">Home</Link> |{" "}
        <Link to="/trainers">Trainers</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainersList data={trainers} />} />
        <Route path="/trainer/:id" element={<TrainerDetail />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
