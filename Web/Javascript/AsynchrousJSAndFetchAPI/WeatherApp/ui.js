class UI{

    constructor(){
        this.location = document.getElementById('w-location');
        this.region = document.getElementById('w-region');
        this.desc = document.getElementById('w-desc');
        this.string = document.getElementById('w-string');
        this.icon = document.getElementById('w-icon');
        this.details = document.getElementById('w-details');
        this.humidity = document.getElementById('w-humidity');
        this.dewpoint = document.getElementById('w-dewpoint');
        this.feelslike = document.getElementById('w-feels-like');
        this.wind = document.getElementById('w-wind');
    }

    paint(results){
        this.location.textContent = results.location.name;
        this.desc.textContent = results.current.condition.text;
        this.string.textContent = `${results.current.temp_c} C / ${results.current.temp_f} F`;
        this.icon.setAttribute('src', results.current.condition.icon);
        this.humidity.textContent = `Relative humidity: ${results.current.humidity}`;
        this.dewpoint.textContent = `Dew Point: ${results.current.pressure_in}`;
        this.feelslike.textContent = `Feels like: ${results.current.feelslike_c}`;
        this.wind.textContent = `Wind in kph: ${results.current.wind_kph}`;
        //console.log(results.location);
    }
}