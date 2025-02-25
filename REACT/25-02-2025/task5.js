import React from 'react';
import ReactDOM from 'react-dom/client';

function EvenNumber({ num }) {
	return <h1>{num} is an Even Number!</h1>;
}

function OddNumber({ num }) {
	return <h1>{num} is an Odd Number!</h1>;
}

function CheckNumber(props) {
	const parsedNum = Number(props.num); 

	if (isNaN(parsedNum)) {
		return <h1>Invalid Number</h1>;
	}

	return parsedNum % 2 === 0 ? <EvenNumber num={parsedNum} /> : <OddNumber num={parsedNum} />;
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<CheckNumber num="90" />);
