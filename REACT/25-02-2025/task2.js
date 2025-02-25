import React from 'react';
import ReactDOM from 'react-dom/client';

function Football() {
  const shoot = () => {
    alert("Great Shot!");
  };

  return <button onClick={shoot}>Take the shot!</button>;
}

function Pet() {
  const handlePetClick = () => {
    alert("I am here!");
  };

  return <button onClick={handlePetClick}>Doggy</button>;
}

function FocusBlurExample() {
  const handleFocus = () => {
    console.log("Input field is focused!");
  };

  const handleBlur = () => {
    console.log("Input field lost focus!");
  };

  return <input type="text" placeholder="Click here" onFocus={handleFocus} onBlur={handleBlur} />;
}

function RightClickExample() {
  const handleContextMenu = (event) => {
    event.preventDefault();
    alert("Right-click is disabled on this button!");
  };

  return <button onContextMenu={handleContextMenu}>Right Click Me</button>;
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <div>
    <Football />
    <Pet />
    <FocusBlurExample />
    <RightClickExample />
  </div>
);
