import './App.css';
import { CalculateScore } from './components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore Name="Alice" School="xyz school" total={450} goal={5} ></CalculateScore>
      <CalculateScore Name="Bob" School="ABC school" total={400}   goal={6}></CalculateScore> 
    </div>
  );
}

export default App;
