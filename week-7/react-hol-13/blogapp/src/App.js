import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [activeComponent, setActiveComponent] = useState('books');

  const renderComponent = () => {
    switch (activeComponent) {
      case 'books':
        return <BookDetails />;
      case 'blogs':
        return <BlogDetails />;
      case 'courses':
        return <CourseDetails />;
      default:
        return <BookDetails />;
    }
  };

  return (
    <div className="app-container">
      <h1>Blogger App</h1>
      <div className="button-group">
        <button onClick={() => setActiveComponent('books')}>Books</button>
        <button onClick={() => setActiveComponent('blogs')}>Blogs</button>
        <button onClick={() => setActiveComponent('courses')}>Courses</button>
      </div>
      <hr />
      {renderComponent()}
    </div>
  );
}

export default App;
