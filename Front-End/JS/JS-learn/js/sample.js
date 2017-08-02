

//1

// function foo(b) {
//   var a = 10;
//   return a + b + 11;
// }

// function bar(x) {
//   var y = 3;
//   return foo(x * y);
// }

// console.log(bar(7));


// 2.

// console.log('-sample.js-');

// function foo() { }
// function bar() { foo() }
// function baz() { bar() }
// baz();

// //3.

// function foo(){foo()}
// foo();

//-------------------------------------------------------


// 
// function longRunning(){
//     var i=0;
//     while(i<10){console.log('long....');i++}
// }
// function shortRunning(){
//     console.log('short....');
// }
// longRunning();
// shortRunning();

//-------------------------------------------------------

// on event

/*

    <button class="veg"> veg </button>
    <button class="nonveg"> non-veg </button>

*/

console.log('start...');
$.on('.veg','click',function vegHandler(event){
    console.log('handling veg actions with event-obj');
})
$.on('.nonveg','click',function nonVegHandler(event){
    console.log('handling nonveg actions with event-obj');
})
console.log('cont with other work...');

function longRunning(){
    var i=0;
    while(i<10){console.log('long....');i++}
}
longRunning();


//--------------------------------

// console.log('strt..');

// setTimeout(function timeout(){
//     console.log('after timout...');
// },1000);


// function longRunning(){
//     var i=0;
//     while(i<1000){console.log('long....');i++}
// }
// longRunning();

//--------------------------------------