let randomNumber = parseInt(Math.random() * 100 + 1);
console.log(randomNumber)

const btn = document.querySelector("#btn");
const form = document.querySelector("#form");
const Pre_G = document.querySelector("#pre-g");
const Rem_G = document.querySelector("#rem-g");
const LowORHigh = document.querySelector("#LowORHigh");
const Restart = document.querySelector("#r-btn");
let restartbtn = document.querySelector("#r-btn")

let pre_g_array = [];
let rem_guess = 9;

let playgame = true;

if (playgame) {
  btn.addEventListener('click', (e) => {
    e.preventDefault();
    const guess = parseInt(document.querySelector('#num').value);
    console.log(guess)
    validateGuess(guess);
  })
}

const validateGuess = (guess) => {
  if (guess > 100 || guess < 0 || isNaN(guess)) {
    displayMsg("Enter Number between 1 to 100")
    displayGuess(rem_guess);
  }
  else {
    pre_g_array.push(guess);
    if (rem_guess > 10 || rem_guess <= 0) {
      displayGuess(rem_guess);
      displayMsg(`Game Over. Random value was ${randomNumber}`);
      endGame();
    } else {
      displayGuess(rem_guess);
      checkGuess(guess);
    }
  }
}

const checkGuess = (guess) => {
  if (guess === randomNumber) {
    displayMsg(`Congratulations !!! You Guessed Right Number.`)
    endGame();
  } else if (guess < randomNumber) {
    displayMsg(`Guess is Too Low.`);
    rem_guess--;
  } else {
    rem_guess--;
    displayMsg(`Guess is Too High.`)
  }
}

const displayGuess = () => {
  Pre_G.innerHTML = pre_g_array;
  Rem_G.innerHTML = 10 - pre_g_array.length;
  document.querySelector('#num').value = ""
}


const displayMsg = (msg) => {
  LowORHigh.innerHTML = msg;
}

const endGame = () => {
  pre_g_array = [];
  Pre_G.innerHTML = [];
  Rem_G.innerHTML = 10;
  playgame = false;
  document.querySelector('#num').setAttribute("disabled", "");
  btn.setAttribute("disabled", "");
  restartbtn.style.display = "inline"
}

restartbtn.addEventListener('click', (e) => {
  restartGame();
})

const restartGame = () => {
  document.querySelector('#num').removeAttribute("disabled");
  btn.removeAttribute("disabled")
  playgame = true;
  restartbtn.style.display = "none"
  randomNumber = parseInt(Math.random() * 100 + 1)
  console.log("new random : " , randomNumber)
  rem_guess = 9
}