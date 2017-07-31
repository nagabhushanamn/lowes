

// module
let swiggy = {
    getFood() {
        let promise = new Promise((resolve, reject) => {
            setTimeout(()=>{
                // resolve('biryani..');
                reject('sorry..');
            },5000);
        });
        return promise;
    }
}

// person
let person = {
    doWork() {
        console.log('working... feels hungry..req  food');
        let promise = swiggy.getFood();
        console.log('got promise,, deferring my actions');
        promise.then(
            (food) => { console.log('yummy..' + food) }, 
            (error) => console.log('oops')
        );
        console.log('cont..with other work..');
    }
}

person.doWork()