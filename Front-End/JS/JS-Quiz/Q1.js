/**
 * http://usejsdoc.org/
 */

let funcs=[];

for(var i=0;i<2;i++){
	funcs.push(function(){return i;})
}


console.log(funcs[0]())
console.log(funcs[1]())