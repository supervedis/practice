document.getElementById('button').addEventListener('click',loadData);

function loadData(){
  const xhr = new XMLHttpRequest();

  xhr.open('GET','data.txt',true);

  xhr.onload = function(){
    if(this.status === 200){
      //console.log(this.responseText);
      document.getElementById('output').innerText=xhr.responseText;
    }
  }

  xhr.onerror = function(){
    console.log('Request error occured...');
  }

  xhr.send();
}