import React from 'react';

const blogs = [
  { id: 1, title: 'Why Learn React?', author: 'Sarah' },
  { id: 2, title: 'JSX Tips & Tricks', author: 'John' },
];

function BlogDetails() {
  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map(blog => (
        <div key={blog.id} className="card">
          <h4>{blog.title}</h4>
          <p>By: {blog.author}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;
