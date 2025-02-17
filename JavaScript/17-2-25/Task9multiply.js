function displayMultiplicationTable() {
    let number = 6; 
    let limit = 10;  

    console.log(`Multiplication Table of ${number} up to ${limit}:`);
    for (let i = 1; i <= limit; i++) {
        console.log(`${number} x ${i} = ${number * i}`);
    }
}

displayMultiplicationTable();
