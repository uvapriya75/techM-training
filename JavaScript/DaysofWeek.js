
const day = prompt("Enter the day of the week:").toLowerCase().trim();

switch (day) {
    case "Monday":
        alert("Start of the week!");
        break;
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
        alert("Mid of the week!");
        break;
    case "Friday":
        alert("Last working day of the week!");
        break;
    case "Saturday":
        alert("WeekEnd - Saturday!");
        break;
    case "Sunday":
        alert("WeekEnd - Sunday!");
        break;
    default:
        alert("Invalid input!");
}
