import React from 'react';
import ReactDOM from 'react-dom/client';

function NotDivisible({ num }) {
  return <h1>{num} is not Divisible by 13!</h1>;
}

function Divisible({ num }) {
  return <h1>{num} is Divisible by 13!</h1>;
}

function CheckNumber({ num }) {
 
  return (num % 13 === 0 && <Divisible num={num} />) || <NotDivisible num={num} />;
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<CheckNumber num={26} />);
