/**
 * 
 */
//
//function reflect(){
//	console.dir(arguments)
//	return arguments[0];
//}
//console.log(reflect(12,13,14,15));

//------------------------
//
//function sum(){
//	let len=arguments.length,
//	    total=0,
//	    i=0;
//	
//	while(i<len){
//		total+=arguments[i];
//		i++;
//	}
//	return total;
//}
//console.log(sum());
//console.log(sum(1,2,3,4,5));
//


function func(a=1, b=2) {

	//	if(!a)a=1;
	//	if(!b)b=2;

	//	a = a || 1
	//	b = b || 2;

	console.log(a);
	console.log(b);

}


func(undefined, 20);