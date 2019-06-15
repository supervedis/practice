document.querySelector('.get-jokes').addEventListener('click', getJokes);

function getJokes(e){
  const number = document.querySelector('input[type="number"]').value;

  const xhr = new XMLHttpRequest();
  xhr.open('GET',`http://api.icndb.com/jokes/random/${number}`,true);

  xhr.onload = function(){
   
    if(xhr.status === 200){
      const result = JSON.parse(xhr.responseText);
      const jokes = result.value;
      let output;
      if(result.type === 'success'){
        jokes.forEach(element => {
          output += `
          <li>${element.joke}</li>
          `
        });
      }else{
        output += '<li>Something went wrong</li>';
      }
      document.querySelector('.jokes').innerHTML= output;
    }
  }
xhr.send();
  e.preventDefault();
}