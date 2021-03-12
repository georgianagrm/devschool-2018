const urlString = 'https://www.metaweather.com/api/location/search/?query=';
const urlID = 'https://www.metaweather.com/api/location/';

let inputName = document.getElementById('name');
let inputId = document.getElementById('id');
let btn = document.getElementById('btn');
let container = document.querySelector('.container');

inputId.addEventListener('keyup', () => {
    if (inputId.value == '' || inputId == null) {
        btn.innerText = 'Get Location';
    } else {
        btn.innerText = 'Get Forecast';
    }
    return btn.innerText;
});

btn.addEventListener('click', (e) => {
    e.preventDefault();

    if (inputId.value == '' && inputName.value === '') {
        container.innerText = '';
    } else if (btn.innerText == 'Get Location') {
        axiosUrlString();
    } else {
        axiosUrlId();
    }
});

function axiosUrlString() {
    axios.get(urlString + inputName.value)
        .then(response => {
            response = response.data;
            container.innerHTML = response[0].title + ", " + response[0].location_type + ", " + response[0].woeid + ", " + response[0].latt_long;
        })
        .catch(error => {
            console.log('Error fetching and parsing data.', error);
        });
}

function axiosUrlId() {
    axios.get(urlID + inputId.value)
        .then(response => {
            responseD = response.data.consolidated_weather[0];
            container.innerText = responseD.id + ", " + responseD.weather_state_name + ", " + responseD.wind_direction_compass + ", " + responseD.applicable_date + ", " + responseD.min_temp + ", " + responseD.max_temp + ", " + responseD.the_temp;
        })
        .catch(error => {
            console.log('Error fetching and parsing data.', error);
        });
}