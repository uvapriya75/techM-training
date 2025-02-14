
const num = parseInt(prompt("Enter the number to generate the table for:"));
const limit = parseInt(prompt("Enter the limit til which the table should be displayed:"));


if (isNaN(num) || isNaN(limit) || limit < 1) {
    alert("Please enter valid numbers.");
} else {
    let table = `Multiplication Table of ${num} til ${limit}:\n`;
    for (let i = 1; i <= limit; i++) {
        table += `${num} * ${i} = ${num * i}\n`;
    }
    alert(table); 
    console.log(table); 
}
