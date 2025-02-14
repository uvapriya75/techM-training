const a= 21; 

function isPrime(n) {
    if (n < 2) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

if (isPrime(a)) {
    console.log(`${a} is a prime number.`);
} else {
    console.log(`${a} is not a prime number.`);
}
