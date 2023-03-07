




const baseUrl = "http://api.weatherapi.com/v1";
 let body = document.getElementsByTagName("body") 

let time = document.getElementById("time")
let inpBox = document.getElementById("input")
let cityN = document.getElementById("city");
let stateN = document.getElementById("state");
let countryN = document.getElementById("country");
let temperature = document.getElementById("temp");

let tempfeel = document.getElementById("tempfeels");

let wind = document.getElementById("wspeed");
let visibility = document.getElementById("visibility");
let airqua = document.getElementById("Aiq");
let humidity = document.getElementById("humidity");
let icon = document.getElementById("img");
let typew = document.getElementById("airq");
let dayNight = document.getElementById("DN");

const getdata = async(event) => {

  event.preventDefault();
  if(!inpBox.value){
    alert("Please Enter Location");
    return;
  }
  const city = inpBox.value;

  const fetchData = await fetch(`${baseUrl}/current.json?key=4215f2b876914f33865173707230503&q=${city}&aqi=yes`
  );

  const orgData = await fetchData.json();
  data = orgData;
  console.log(data);
  
  cityN.innerHTML = data.location.name;
  stateN.innerHTML = data.location.region;
  countryN.innerHTML = data.location.country;
  typew.innerHTML = data.current.condition.text;
  icon.src = data.current.condition.icon;
  time.innerHTML = data.current.last_updated;

  temperature.innerHTML = data.current.feelslike_c;

  tempfeel.innerHTML = data.current.feelslike_c;

  wind.innerHTML = data.current.wind_kph;
  humidity.innerHTML = data.current.humidity;
  visibility.innerHTML = data.current.vis_km;

  if(data.current.is_day){
    dayNight.innerHTML = "Day"
  }
  else{
    dayNight.innerHTML = "Night"
  }

  console.log(data.current.condition.text);

  if(!data.current.is_day && data.current.condition.text == "Clear"){
    document.body.style.backgroundImage = "url('https://media.tenor.com/pwks_QPpbvoAAAAd/sky-night.gif')";
  }
  else if(data.current.is_day && data.current.condition.text == "Sunny"){
    document.body.style.backgroundImage = "url('https://wallpaperaccess.com/full/3265126.jpg')";

  }
  else if(data.current.is_day && data.current.condition.text == "Partly cloudy"){
    document.body.style.backgroundImage = "url('https://wpcdn.us-east-1.vip.tn-cloud.net/www.klkntv.com/content/uploads/2020/04/cloud1.jpg')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Light snow"){
    document.body.style.backgroundImage = "url('https://lede-admin.blockclubchicago.org/wp-content/uploads/sites/5/2020/12/122920-Snow-McKinley-Park-ColinBoyle-42.jpg')";
  }
  else if(data.current.is_day && data.current.condition.text == "Light snow"){
    document.body.style.backgroundImage = "url('https://media.istockphoto.com/id/861988546/photo/winter-rural-landscape-with-forest-sun-and-snow.jpg?s=612x612&w=0&k=20&c=HIJPcM2ynJlalNkBGYUJmzyvq23M-oeT6b_wT5vn3gg=')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Partly cloudy"){
    document.body.style.backgroundImage = "url('https://i.pinimg.com/originals/e0/84/e8/e084e8506a3081f4939a798c02a8a7a7.jpg')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Overcast"){
    document.body.style.backgroundImage = "url('https://media.istockphoto.com/id/528904964/photo/moon-surrounded-by-dark-clouds-at-night.jpg?s=612x612&w=0&k=20&c=Rl8YZVqZqDdPsn4bw1Jw7iVXqB4vO5Nrb7o1d3we1_w=')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Mist"){
    document.body.style.backgroundImage = "url('https://upload.wikimedia.org/wikipedia/commons/d/d9/Mist_at_night_-_panoramio.jpg')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Patchy rain possible"){
    document.body.style.backgroundImage = "url('https://content.api.news/v3/images/bin/73e2e84cac464ec0994c1f57c700c8dc')";
  }

  let aiqnumber = data.current.air_quality["us-epa-index"];

  if(aiqnumber == "1"){
    airqua.innerHTML = "Good"
    airqua.style.backgroundColor = "#16FF00"
  }
  else if(aiqnumber == "2"){
    airqua.innerHTML = "Moderate"
    airqua.style.backgroundColor = "#FFED00"

  }
  else if(aiqnumber == "3"){
    airqua.innerHTML = "Unhealthy for sensitive group"
    airqua.style.backgroundColor = "#F94A29"
  }
  else if(aiqnumber == "4" ||  aiqnumber == "5" ){
    airqua.innerHTML = "Unhealthy"
    airqua.style.backgroundColor = "#FF0032"
  }
  else {
    airqua.innerHTML = "Hazardous"
    airqua.style.backgroundColor = "#CD0404"
  }


  
}




const findMyState = async( ) => {
  let geodata;
  let lat;
  let lon;
  const success = (position) => {
    lat = position.coords.latitude;
    lon = position.coords.longitude;
    console.log(lat + " " +  lon);
  }
  const error = () => {
    alert(error)
  }

  const locFetch = await fetch(`https://api.bigdatacloud.net/data/reverse-geocode-client?latitude=${lat}&longitude=${lon}&localityLanguage=en`
  );
  const orgData = await locFetch.json();
  geodata = orgData.city;



  const getdata = async() => {
    const fetchData = await fetch(`${baseUrl}/current.json?key=4215f2b876914f33865173707230503&q=${geodata}&aqi=yes`
    );
    const orgData = await fetchData.json();
    data = orgData;
    cityN.innerHTML = data.location.name;
    stateN.innerHTML = data.location.region;
    countryN.innerHTML = data.location.country;
    typew.innerHTML = data.current.condition.text;
    icon.src = data.current.condition.icon;
    time.innerHTML = data.current.last_updated;
  
    temperature.innerHTML = data.current.feelslike_c;
    tempfeel.innerHTML = data.current.feelslike_c;

    wind.innerHTML = data.current.wind_kph;
    humidity.innerHTML = data.current.humidity;
    visibility.innerHTML = data.current.vis_km;
  
    if(data.current.is_day){
      dayNight.innerHTML = "Day"
    }
    else{
      dayNight.innerHTML = "Night"
    }

    
  if(!data.current.is_day && data.current.condition.text == "Clear"){
    document.body.style.backgroundImage = "url('https://media.tenor.com/pwks_QPpbvoAAAAd/sky-night.gif')";
  }
  else if(data.current.is_day && data.current.condition.text == "Sunny"){
    document.body.style.backgroundImage = "url('https://wallpaperaccess.com/full/3265126.jpg')";

  }
  else if(data.current.is_day && data.current.condition.text == "Partly cloudy"){
    document.body.style.backgroundImage = "url('https://wpcdn.us-east-1.vip.tn-cloud.net/www.klkntv.com/content/uploads/2020/04/cloud1.jpg')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Light snow"){
    document.body.style.backgroundImage = "url('https://lede-admin.blockclubchicago.org/wp-content/uploads/sites/5/2020/12/122920-Snow-McKinley-Park-ColinBoyle-42.jpg')";
  }
  else if(data.current.is_day && data.current.condition.text == "Light snow"){
    document.body.style.backgroundImage = "url('https://media.istockphoto.com/id/861988546/photo/winter-rural-landscape-with-forest-sun-and-snow.jpg?s=612x612&w=0&k=20&c=HIJPcM2ynJlalNkBGYUJmzyvq23M-oeT6b_wT5vn3gg=')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Partly cloudy"){
    document.body.style.backgroundImage = "url('https://i.pinimg.com/originals/e0/84/e8/e084e8506a3081f4939a798c02a8a7a7.jpg')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Overcast"){
    document.body.style.backgroundImage = "url('https://media.istockphoto.com/id/528904964/photo/moon-surrounded-by-dark-clouds-at-night.jpg?s=612x612&w=0&k=20&c=Rl8YZVqZqDdPsn4bw1Jw7iVXqB4vO5Nrb7o1d3we1_w=')";
  }
  else if(!data.current.is_day && data.current.condition.text == "Mist"){
    document.body.style.backgroundImage = "url('https://upload.wikimedia.org/wikipedia/commons/d/d9/Mist_at_night_-_panoramio.jpg')";
  }

  
    let aiqnumber = data.current.air_quality["us-epa-index"];
  
    if(aiqnumber == "1"){
      airqua.innerHTML = "Good"
      airqua.style.backgroundColor = "#16FF00"
    }
    else if(aiqnumber == "2"){
      airqua.innerHTML = "Moderate"
      airqua.style.backgroundColor = "#FFED00"
  
    }
    else if(aiqnumber == "3"){
      airqua.innerHTML = "Unhealthy for sensitive group"
      airqua.style.backgroundColor = "#F94A29"
    }
    else if(aiqnumber == "4" ||  aiqnumber == "5" ){
      airqua.innerHTML = "Unhealthy"
      airqua.style.backgroundColor = "#FF0032"
    }
    else {
      airqua.innerHTML = "Hazardous"
      airqua.style.backgroundColor = "#CD0404"
    }  
  }
  
  
  
  getdata(); //Calling function

  console.log(geodata)
  navigator.geolocation.getCurrentPosition(success,error);
};

window.onload = findMyState();









