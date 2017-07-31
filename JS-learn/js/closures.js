
/*


A closure is a function having access to the parent scope,
even after the parent function has closed.


why we need ?

use-1:
 -> to abstract any public beha to other modules
 -> while executing async, can able access parenct-scoped data

*/

// function teach(sub) {
//     console.log('teaching ' + sub);
//     let notes = sub + "-notes";
//     let story="bla bla";
//     function learn() {
//         console.log('learning ' + notes);
//     }
//     console.log('teaching end..');
//     return learn;
// }

// let learnFunc=teach('.js');

// learnFunc();
// learnFunc();
// learnFunc();

//----------------------------------------------------------------

// counter module

const counter=(function init() {
    var count = 0; // private
    // public
    function doCount() {
        count++;
    }
    function getCount() {
        return count;
    }
    return {
        inc:doCount,
        get:getCount
    }
})()

//----------------------------------------------------------------