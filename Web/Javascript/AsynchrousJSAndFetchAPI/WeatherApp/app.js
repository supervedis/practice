const storage = new Storage();

const storageLocation = storage.getLocation();
//Init Weather App
const weather = new Weather(storageLocation.city);
const ui = new UI();

//GET weather on DOM load
document.addEventListener('DOMContentLoaded', getWeather);

document.getElementById('w-change-btn').addEventListener('click',(e) => {
    const city = document.getElementById('city').value;

    storage.setLocation(city);
    
    weather.changeLocation(city);

    getWeather();

    //close the modal
    $('#locModal').modal('hide');
});

function getWeather(){
    weather.getWeather()
    .then( results => {
        //console.log(results.humidity);
        ui.paint(results);
    })
    .catch(err => console.log(err));
}