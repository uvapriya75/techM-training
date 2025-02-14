const Address = prompt("Please enter your address:"); // Get input from user

if (Address) {
    alert(`Your address is: ${Address}`); // Display the entered address
} else {
    alert("You didn't enter an address."); // Handle empty input
}
