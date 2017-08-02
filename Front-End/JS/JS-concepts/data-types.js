/**
 * 
 */


/*

	data-types
	
	1. simple / primitives  ==> values
	
		1. string
		2. number
		3. boolean
		4. undefined
		5. symbol ( es6 )
	
	2. complex / References ==> objects
	
		how to create objects ?
		
		
		syntax
		
		var ref=new Constructor();
		
		

*/
//
//
//var config = new Object();
//config.url = "http://"
//config.method = "GET";
//
//delete config.method;



// literal-style objects

// 1. Object

var config = new Object();
config.url = "http://"
config.method = "GET";


// or litera-style

var config={
		url:'',
		method:''
};


// 2. RegExp

var ssnPattern=new RegExp("\\d{3}-\\d{4}-\\d{2}");

// or

var ssnPattern=/\d{3}-\d{4}-\d{2}/;


// 3. Array

var arr=new Array();

// or

var arr=[];

// 4. Function

var add=new Function("n1","n2","var r=n1+n2;return r;")
console.log(add(12,13));




//or

function add(n1,n2){
	var r=n1+n2;
	return r
}




//--------------------------

//
//function getFood(){
//	return "No Food";
//}
//
//function getFood(pay){
//	return "biryani"
//}
//
//console.log(getFood());
//
//






