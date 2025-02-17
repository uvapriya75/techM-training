function isSumOfDigitsEvenOrOdd(num) {
   
    let digits = num.toString().split('');
    let sum = digits.reduce((acc, digit) => acc + parseInt(digit), 0);
    
    if (sum % 2 === 0) {
        return "Even";
    } else {
        return "Odd";
    }
}

let number = 12;
console.log(`The sum of digits of ${number} is ${isSumOfDigitsEvenOrOdd(number)}.`); 
