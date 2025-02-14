const score = parseInt(prompt("Enter the Maths score:"));

if (isNaN(score) || score < 0 || score > 100) {
    alert("Please enter a valid score between 0 and 100.");
} else if (score === 100) {
    alert("***Phenomenal***");
} else if (score > 85) {
    alert("***Excellent ***");
} else if (score >= 71) {
    alert("***Good work***");
} else if (score >= 51) {
    alert("***Practice well***");
} else {
    alert("***Hard work is needed***");
}
