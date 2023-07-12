const questions = [
    {
      question: "What is the capital of France?",
      options: ["Paris", "London", "Berlin", "Rome"],
      answer: "Paris"
    },
    {
      question: "Which is the largest planet in our solar system?",
      options: ["Jupiter", "Saturn", "Mars", "Earth"],
      answer: "Jupiter"
    },
    {
      question: "Who painted the Mona Lisa?",
      options: ["Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"],
      answer: "Leonardo da Vinci"
    }
  ];
  
  let currentQuestionIndex = 0;
  let score = 0;
  let correctAnswers = 0;
  let wrongAnswers = 0;
  
  const questionContainer = document.getElementById("question-container");
  const nextBtn = document.getElementById("next-btn");
  const resultContainer = document.getElementById("result-container");
  const leaderboardContainer = document.getElementById("leaderboard-container");
  
  function displayQuestion() {
    const currentQuestion = questions[currentQuestionIndex];
    questionContainer.innerHTML = `
      <h2>${currentQuestion.question}</h2>
      ${currentQuestion.options
        .map(
          (option, index) =>
            `<input type="radio" name="answer" value="${option}" id="option${index}" required>
            <label for="option${index}">${option}</label><br>`
        )
        .join("")}
    `;
  }
  
  function checkAnswer() {
    const selectedOption = document.querySelector('input[name="answer"]:checked').value;
    const currentQuestion = questions[currentQuestionIndex];
  
    if (selectedOption === currentQuestion.answer) {
      score++;
      correctAnswers++;
    } else {
      wrongAnswers++;
    }
  }
  
  function showResult() {
    questionContainer.style.display = "none";
    nextBtn.style.display = "none";
    resultContainer.innerHTML = `<h3>Your Score: ${score} out of ${questions.length}</h3>`;
    resultContainer.style.display = "block";
    leaderboardContainer.innerHTML = `
      <p>Correct Answers: ${correctAnswers}</p>
      <p>Wrong Answers: ${wrongAnswers}</p>
    `;
    leaderboardContainer.style.display = "block";
  }
  
  function nextQuestion() {
    checkAnswer();
  
    currentQuestionIndex++;
  
    if (currentQuestionIndex === questions.length) {
      showResult();
    } else {
      displayQuestion();
    }
  }
  
  nextBtn.addEventListener("click", nextQuestion);
  
  displayQuestion();