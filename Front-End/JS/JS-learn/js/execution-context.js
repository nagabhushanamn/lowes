

/*

execution-context / scope

memory/stack-frame with args & locals to execute instruction

2 phases

1. creation/push phase

    all variables declared any-where with 
    'var' keyword will get hoisted with default value ('undefined')

2. execution/pop phase

    ins executes in seq


by default, .js-runtime has one global-context & global-obj

global-obj

browser ==> window
Node.js ==> process/global


imp-note:

every func invocation also creates new-context 
which is child of in which context that func has declared


*/



// console.log(v);
// var v=10;


// var v=10;
// function f1(){
//     console.log(v);
//     var v=20;
// }
// f1(); // f1-context ==> global-context



var v = 10;
function f1() {
    function f2() {
        console.log(v);
    }
    //f2(); // f2-context ==> f1-context
    var v = 20;
    //f2();
    return f2;
}

var f2Ref = f1(); // f1-context ==> global-context
f2Ref();


//


var i=100;

{
    var i=200;
}

console.log(i);

var k=10;
var k=20;


/*

problems with 'var' keyword

-> var always get hoisted
-> No 'block-scope'
-> can re-declare same var in context 

soln :

using 'let' keyword  ( from es6 )


*/

// // console.log(myName);
// let myName="Nag";

// let myAge=22;
// {
//     let myAge=33
// }
// console.log(myAge);

// let n=12;
// let n=13;


const config={
    url:'http://'
}
// config={};
config.url="ftp://"