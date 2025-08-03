import { useContext } from 'react';
import './EmployeeCard.module.css';
import ThemeContext from './ThemeContext';
function EmployeeCard(props) {
    const theme = useContext(ThemeContext);
    console.log(theme);
    return (
        <div className={theme}>
            <h3>{props.employee.name}</h3>
            <p className={theme}>{props.employee.email}</p>
            <p>{props.employee.phone}</p>
            <p>
                <a href="#" className={theme}>Edit</a> 
                <a href="#" className={theme}>Delete</a> 
            </p>
        </div>
    );
}
export default EmployeeCard;

