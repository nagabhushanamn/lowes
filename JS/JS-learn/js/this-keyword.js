


/*

 this 

 ==> context's owner

*/

// why we need 'this' keyword?

// var person={
//     pName:'Nag',
//     sayName:function(){
//         //console.log('im '+pName); // context's hierarchy data
//         console.log('im '+person.pName); // obj's data
//         console.log('im '+this.pName); // obj's data
//     }
// };

// // person.sayName();
// var oldPerson=person;
// person={pName:'Ria'};
// oldPerson.sayName();

//---------------------------------------------------------



//  function-binding

// a. static function-binding

// var p1={name:'Nag',sayName(){console.log('im '+this.name)}};
// var p2={name:'Ria',sayName(){console.log('im '+this.name)}};


// function sayNameForAll() {
//     // console.dir(this);
//     console.log('im ' + this.name);
// }
// var p1 = { name: 'Nag', sayName: sayNameForAll };
// var p2 = { name: 'Ria', sayName: sayNameForAll };

// sayNameForAll(); // im   // function-invocation   ( this ==> global-obj)
// p1.sayName(); // im Nag   //method-invocation     ( this ==> invoker-obj) 
// p2.sayName(); // im Ria


// b. dynamic function binding


// var greetLib = {
//     name: 'LIB',
//     sayName: function (message,from) {
//         console.log(message + ' im ' + this.name +":"+from);
//     }
// }


// var p = { name: 'Nag' }
// var e = { name: 'Lowes' }

// // way-1
// greetLib.sayName.call(p, "Hello","CHN");
// greetLib.sayName.call(e, "Hey","BLR");

// //way-2

// greetLib.sayName.apply(p, ["Hello","CHN"]);
// greetLib.sayName.apply(e, ["Hey","BLR"]);

// way-3
// var func=greetLib.sayName.bind(p,"Hello","CHN");
// func();
// func();

// var func2=greetLib.sayName.bind(e);
// func2("dude","unverse")


/*

in .js lang , we can invoke func in 4 ways

1. function invovation  ( this ==> global-obj)
2. method-invocation    ( this ==> invoker-obj)
3. call/apply/bind invocation ( this ==> arg-obj)
4. constructor invocation ( this ==> new-obj)


*/

//--------------------------------------------------------------

// Quiz-1

// var tnr = {
//     name: 'Nag',
//     doTeach: function () {
//         console.log(this.name + " teaching .js");
//         var self = this;
//         function doLearn() {
//             console.log(this.name + ' learning .js from ' + self.name);
//         }
//         var emp = { name: 'lowes' }
//         doLearn.call(emp);
//     }
// }

// tnr.doTeach();

// let newTnr = { name: 'Praveen' }
// tnr.doTeach.call(newTnr);

//--------------------------------------------------------------------


function sessionStart() {
    function Employee(name) {
        this.name = name;
    }
    function Trainer(name) {
        this.name = name;
        this.doTeach = function () {
            console.log(this.name + " teaching .js");
            var self = this;
            function doLearn() {
                console.log(this.name + " learning .js from " + self.name);
            }
            return doLearn;
        }
    }
    var emp1 = new Employee("A"); // constructor-invocation
    var emp2 = new Employee("B");
    var tnr = new Trainer("Nag");
    var learnFunc = tnr.doTeach(); // method-invocation
    learnFunc.call(emp1); // call-invocation
    learnFunc.call(emp2);
}

// sessionStart(); // function-invocation



// Quiz-2

// function Person(name,age){
//     this.name=name;
//     this.age=age;
//     var self=this;
//     setInterval(function(){
//         self.age++;
//         console.log(self.name+"->"+self.age);
//     },1000);    

// }

// var p=new Person("Ria",2);