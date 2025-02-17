function displayMultiplicationTable(number) {
    let limit = 10;  

    console.log(`Multiplication Table of ${number} up to ${limit}:`);
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }

    console.log(`Factors of ${number}:`);
    for (let i = 1; i <= number; i++) {
        if (number % i === 0) {
            console.log(i);
        }
    }
}

displayMultiplicationTable(8);
