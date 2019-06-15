const req = new easyHTTP();

//METHOD:Get posts
// req.get('https://jsonplaceholder.typicode.com/psts',function(err,response){
//     if(err){
//         console.log(err);
//     }else{
//         console.log(response);
//     }
// });

//METHOD:Get a single post
// req.get('https://jsonplaceholder.typicode.com/posts/1',function(err,response){
//     if(err){
//         console.log(err);
//     }else{
//         console.log(response);
//     }
// });


const data = {
    title:"Custome title",
    body:"This is a custom body"
}

//METHOD:POST Request
// req.post('https://jsonplaceholder.typicode.com/posts',data,function(err,response){
//     if(err){
//         console.log(err);
//     }else{
//         console.log(response);
//     }
// });

// req.post('https://jsonplaceholder.typicode.com/posts/1',data,function(err,response){
//     if(err){
//         console.log(err);
//     }else{
//         console.log(response);
//     }
// });

//METHOD:HTTP DELETE Request
req.get('https://jsonplaceholder.typicode.com/posts/1',function(err,response){
    if(err){
        console.log(err);
    }else{
        console.log(response);
    }
});