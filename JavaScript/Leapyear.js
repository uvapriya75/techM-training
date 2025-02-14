
const year = parseInt(prompt("Enter the year:"));
const month = parseInt(prompt("Enter the month (1-12):"));


function isLeapYear(year) {
    return (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
}

if (isNaN(year) || isNaN(month) || month < 1 || month > 12) {
    alert("Please enter a valid year and month.");
} else if (isLeapYear(year)) {
    if (month === 2) {
        alert(`The year ${year} is a leap year and the month is February with 29 days.`);
    } else {
        alert(`The year ${year} is a leap year and the month is not February.`);
    }
} else {
    alert(`The given year ${year} is not a leap year.`);
}
