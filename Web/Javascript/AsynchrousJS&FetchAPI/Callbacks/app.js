const posts = [
    {title:'Post One', body:'This is post one'},
    {title:'Post Two', body:'This is post two'}
];

//document.getElementById('post').addEventListener('click',getPost);

// function createPost(post){
//     setTimeout(() => {
//         posts.push(post);
//     }, 2000);
// }

// function getPost(){
//     setTimeout(function() {
//         let output = '';
//         posts.forEach(function(element){
//             output += `
//             <li>${element.body}</li>
//             `;
//         });
//         document.getElementById('posts').innerHTML=output;
//     }, 4000); 
// }

// createPost({title:'Post three', body:'This is post three'});

function createPost(post,callback){
    return new Promise(function(resolve, reject){
        setTimeout(() => {
            posts.push(post);
            resolve();
        }, 2000);
    })
}

function getPost(){
    setTimeout(function() {
        let output = '';
        posts.forEach(function(element){
            output += `
            <li>${element.body}</li>
            `;
        });
        document.body.innerHTML=output;
    }, 1000); 
}

createPost({title:'Post three', body:'This is post three'}).then(getPost);