const prices = []; 
for (let i = 0; i < 7; i++) {
    let price = parseFloat(prompt(`Enter the price of 1kg tomato for day ${i + 1}:`));
    
    if (isNaN(price) || price < 0) {
        alert("Please enter a valid price.");
        i--; 
    } else {
        prices.push(price);
    }
}
price) => sum + price, 0);
const average = total / prices.length;


if (average > 50) {
    alert(`Average price: Rs.${average.toFixed(2)}. Tomato has given good profit!`);
} else {
    alert(`Average price: Rs.${average.toFixed(2)}. No profit from tomato.`);
}
