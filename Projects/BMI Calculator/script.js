const form = document.querySelector("#form")

const clock = document.querySelector("#clock");

setInterval(()=>{
  const date = new Date();
  clock.innerHTML = date.toLocaleTimeString();
},1000)

form.addEventListener('submit', (e) => {
  e.preventDefault();
  const height = parseFloat(document.querySelector('#ht').value);
  const weight = parseFloat(document.querySelector("#wh").value);
  const results = document.querySelector('.result')

  if (height <= 0 || isNaN(height)) {
    results.innerHTML = "please provide valid height";
  }
  else if (weight <= 0 || isNaN(weight)) {
    results.innerHTML = "please provide valid weight";
  }
  else {
    const result = (weight / ((height * height) / 10000)).toFixed(2);
    if (result < 18.6) {
      results.innerHTML = result + " You are UnderWeight.";
    } else if (result > 24.9) {
      results.innerHTML = result + " You are Overweight.";
    } else {
      results.innerHTML = result + " Your height and weight is perfectly balanced.";
    }
  }
})