import React from 'react';

const books = [
  { id: 1, title: 'Clean Code', author: 'Robert C. Martin' },
  { id: 2, title: 'React Explained', author: 'Zac Gordon' },
];

function BookDetails() {
  return (
    <div>
      <h2>Book Details</h2>
      {books.map(book => (
        <div key={book.id} className="card">
          <h4>{book.title}</h4>
          <p>Author: {book.author}</p>
        </div>
      ))}
    </div>
  );
}

export default BookDetails;
