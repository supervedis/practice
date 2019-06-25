const http = new EasyHTTP();
const http2 = new EasyHTTPV2();

// http2.get('https://jsonplaceholder.typicode.com/users')
// .then(data => console.log(data))
// .catch(err => console.log(err));

const data = {
    name:'Levy',
    username:'lev',
    email:'levy@gmail.com'
}

// http2.post('https://jsonplaceholder.typicode.com/users',data)
// .then( res => console.log(res))
// .catch( err => console.log(err));

// http2.put('https://jsonplaceholder.typicode.com/users/2',data)
// .then( res => console.log(res))
// .catch( err => console.log(err));

http2.delete('https://jsonplaceholder.typicode.com/users/2')
.then( res => console.log(res))
.catch( err => console.log(err));

// async function asyncHello(){
//    const promise = new Promise((resolve, reject) => {
//        setTimeout(() => {
//            resolve('Hello Clev');
//        }, 2000);
//    });

//    const res1 = await promise;
//    return res1;
// }

// asyncHello().then(res => console.log(res));

// async function getUsers(){
//     const response = await fetch('https://jsonplaceholder.typicode.com/users');

//     const data = await response.json();

//     return data;
// }

// getUsers().then( data => console.log(data)).catch( err => console.log(err));