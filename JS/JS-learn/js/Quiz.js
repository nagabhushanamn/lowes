

let trainer = {
    doTeach() {
        var name = "Nag";// moved to heap 
        try {
            console.log('teaching topic-1');
            setTimeout(function () {
                console.log(name + 'teaching topic-2 after timeout');
                //throw new Error('hate topic-2');
            }, 5000)
            console.log('teaching topic-1 end');
        } catch (e) {
            console.log('i caught ' + e.message);
        }
    }
}

trainer.doTeach();