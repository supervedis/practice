//Using promises
class EasyHTTP {
    get(url){
        return new Promise((resolve, reject) => {
        fetch(url).then( res => res.json())
        .then( data => resolve(data))
        .catch(err => reject(err));
        });
    }

    post(url, data){
        return new Promise((resolve, reject) => {
        fetch(url,
            {
                method:'POST',
                headers:{
                    'Content-type':'application/json'
                },
                body: JSON.stringify(data)
            }).then( res => res.json())
        .then( data => resolve(data))
        .catch(err => reject(err));
        });
    }

    put(url, data){
        return new Promise((resolve, reject) => {
        fetch(url,
            {
                method:'PUT',
                headers:{
                    'Content-type':'application/json'
                },
                body: JSON.stringify(data)
            }).then( res => res.json())
        .then( data => resolve(data))
        .catch(err => reject(err));
        });
    }

    delete(url){
        return new Promise((resolve, reject) => {
        fetch(url,
            {
                method:'DELETE',
                headers:{
                    'Content-type':'application/json'
                }
            }).then( res => res.json())
        .then( data => resolve('Resource deleted'))
        .catch(err => reject(err));
        });
    }
}

//Using Async Await
class EasyHTTPV2 {
    async get(url){
        const users = await fetch(url);

        const response = await users.json();

        return response;
    }

    async post(url, data){
        const posts = await fetch(url, {
            method:'POST',
            headers:{
                'Content-type':'application/json'
            },
            body: JSON.stringify(data)});

        const response = await posts.json();

        return response;
    }

    async put(url, data){
        const posts = await fetch(url, {
            method:'PUT',
            headers:{
                'Content-type':'application/json'
            },
            body: JSON.stringify(data)});

        const response = await posts.json();

        return response;
    }

    async delete(url){
        const deleted_user = await fetch(url, {
            method:'DELETE',
            headers:{
                'Content-type':'application/json'
            }
        });

        const response = await deleted_user;
        return response;
    }
}