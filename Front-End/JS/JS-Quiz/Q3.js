var funcs=[];

function getFunc(i){
    return function(){return i}
}

for(var i=0;i<2;i++){
funcs.push(getFunc(i))
}

console.log(funcs[0]());
console.log(funcs[1]());

