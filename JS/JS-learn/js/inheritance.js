
/*

how to do inheritance in .js-lang ?

using 'prototypes'



// */

// function Person(name, age) {
//     this.name = name;
//     this.age = age;
//     // this.sayName=function(){
//     //     console.log('im '+this.name);
//     // }
//     //  this.sayAge=function(){
//     //     console.log('im '+this.age);
//     // }
// }

// Person.prototype.sayName = function () {
//     console.log('im ' + this.name);
// }
// Person.prototype.sayAge = function () {
//     console.log('im ' + this.age);
// }

// var p1 = new Person('Nag', 33);
// var p2 = new Person('Ria', 2);
// //...


// var p11=Object.create(p1);


//-----------------------------------------------------


class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    sayName(){
        console.log('im '+this.name);
    }
}

// var p1 = new Person('Nag', 33);
// var p2 = new Person('Ria', 2);

class Employee extends Person{
    
}