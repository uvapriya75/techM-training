myObj = {
  name:"John",
  age:30,
  myCars: {
    car1:"Ford",
    car2:"BMW",
    car3:"Fiat"
  }
}
var car = myObj.myCars.car3;
console.log(car)

console.log(myObj.myCars["car2"]);

console.log(myObj["myCars"]["car2"]);
