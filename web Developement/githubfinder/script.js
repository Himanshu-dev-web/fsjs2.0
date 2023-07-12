const searchBtn = document.getElementById("search-btn");
const usernameInput = document.getElementById("username-input");
const avatar = document.getElementById("avatar");
const nameElement = document.getElementById("name");
const userInfo = document.getElementById("user-info");

searchBtn.addEventListener("click", getUserData);

function getUserData() {
  const username = usernameInput.value;
  if (username === "") {
    alert("Please enter a GitHub username.");
    return;
  }

  const url = `https://api.github.com/users/${username}`;
  fetch(url)
    .then(response => response.json())
    .then(data => {
      if (data.message === "Not Found") {
        alert("User not found. Please enter a valid GitHub username.");
        return;
      }
      displayUserData(data);
    })
    .catch(error => {
      alert("An error occurred while fetching user data. Please try again.");
      console.error(error);
    });
}

function displayUserData(user) {
  avatar.src = user.avatar_url;
  nameElement.textContent = user.name || user.login;
  userInfo.style.display = "block";
}

function displayUserData(user) {
  avatar.src = user.avatar_url;
  nameElement.textContent = user.name || user.login;

  const bio = user.bio || "No bio available";
  const publicReposCount = user.public_repos;
  const followersCount = user.followers;

  const userInfoDetails = document.createElement("div");
  userInfoDetails.innerHTML = `
    <p><strong>Bio:</strong> ${bio}</p>
    <p><strong>Public Repositories:</strong> ${publicReposCount}</p>
    <p><strong>Followers:</strong> ${followersCount}</p>
  `;
  userInfo.appendChild(userInfoDetails);

  userInfo.style.display = "block";
}
