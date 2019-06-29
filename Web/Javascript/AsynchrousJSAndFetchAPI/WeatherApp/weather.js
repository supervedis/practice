class Weather{
    constructor(city){
        this.apiKey = 'e46e92dd70ee4615808165402192706';
        this.city = city;
        //this.countryCode = countryCode;
    }

    async getWeather(){
        const req = await fetch(`http://api.apixu.com/v1/current.json?key=e46e92dd70ee4615808165402192706&q=${this.city}`);

        const response = await req.json();

        return response;
    }

    changeLocation(city){
        this.city = city;
        //this.countryCode = countryCode;
    }
}