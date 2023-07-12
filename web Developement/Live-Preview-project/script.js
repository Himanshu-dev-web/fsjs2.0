const titleInput = document.getElementById("title");
const authorInput = document.getElementById("author");
const categoryInput = document.getElementById("category");
const storyInput = document.getElementById("story");
const liveTitle = document.getElementById("live-title");
const liveAuthor = document.getElementById("live-author");
const liveCategory = document.getElementById("live-category");
const liveStory = document.getElementById("live-story");

titleInput.addEventListener("input", updateLivePreview);
authorInput.addEventListener("input", updateLivePreview);
categoryInput.addEventListener("input", updateLivePreview);
storyInput.addEventListener("input", updateLivePreview);

function updateLivePreview() {
  liveTitle.textContent = titleInput.value;
  liveAuthor.textContent = authorInput.value;
  liveCategory.textContent = categoryInput.value;
  liveStory.textContent = storyInput.value;
}
