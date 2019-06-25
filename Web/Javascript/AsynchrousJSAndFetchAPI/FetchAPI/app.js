document.getElementById('button1').addEventListener('click',getText);
document.getElementById('button2').addEventListener('click',getJson);
document.getElementById('button3').addEventListener('click',getExternal);

function getText(){
    fetch('text.txt').then(function(res){
       return res.text();
    })
    .then((data) => {
        console.log(data);
        document.getElementById('output').innerHTML = data;
    })
    .catch((err) => {
        document.getElementById('output').innerHTML = data;
    });
}

function getJson(){
    fetch('post.json').then((res) => {
        return res.json();
    })
    .then((data) => {
        let jsonRes = data;
        jsonRes.forEach(element => {
            console.log(element.title);
        });
    })
    .catch((err) => {
        console.log(err);
    });
}

function getExternal(){
    fetch('https://api.github.com/users').then((res) => {
        return res.json();
    })
    .then((data) => {
        let jsonRes = data;
        jsonRes.forEach(element => {
            console.log(element.login);
        });
    })
    .catch((err) => {
        console.log(err);
    });
}
// let myPromise = new Promise((resolve, reject)=>{
//     setTimeout(function(){
//         resolve('Succeeded');
//     }, 1000);
// });

// myPromise.then((msg)=>{
//     console.log(msg);
// });