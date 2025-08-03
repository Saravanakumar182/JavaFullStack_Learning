import React from 'react';

const courses = [
  { id: 1, name: 'React Basics', duration: '4 weeks' },
  { id: 2, name: 'Advanced JS', duration: '6 weeks' },
];

function CourseDetails() {
  return (
    <div>
      <h2>Course Details</h2>
      {courses.map(course => (
        <div key={course.id} className="card">
          <h4>{course.name}</h4>
          <p>Duration: {course.duration}</p>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;
