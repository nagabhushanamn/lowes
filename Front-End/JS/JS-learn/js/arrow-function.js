

// syntax

// var getPrice=function(){return 100.00};

// var getPrice=()=>{return 100.00};
// var getPrice=()=>100.00;
// var getPrice=(count)=>count*100.00;
// var getPrice=count=>count*100.00;
// var getPrice=(count,gst)=>count*100.00+gst;
// var getPrice=(count,gst)=>{
//     var cost=count*100.00;
//     var total=cost+gst
//     return total
// };



//

// var nums=[1,3,5,7,2,4,6,8,10];
// nums.sort(function(a,b){
//     return a-b;
// });
// nums.sort((a,b)=>a-b);

//------------------------------------------------------------




var tnr={
    name:'Nag',
    doTeach:function(){
        console.log(this.name+" teaching .js")

        // var askQues=function(ques){
        //     console.log(this.name +"answering "+ques);
        // }

        var askQues=(ques)=>{
            console.log(this.name +" answering "+ques);
        }

        return askQues;    
    }
}

var askQues=tnr.doTeach();

askQues("Q1");

var newTnr={name:'Praveen'}
askQues.call(newTnr,"Q2")