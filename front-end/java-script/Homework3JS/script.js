const audio = document.querySelector('audio');
const task = document.querySelector('#i1');
const mainElement = document.querySelector('main');

task.addEventListener('click', () => {
  if (audio.currentTime == 0) {
    audio.play();
  } else {
    audio.pause();
    audio.currentTime = 0;
  }
});

document.querySelector('#newArticleButton').addEventListener('click', insertNewArticle);

window.addEventListener('scroll', checkPosition);

function checkPosition() {
  const sections = document.querySelectorAll('section');
  sections.forEach((section) => {
    const { top, bottom } = section.getBoundingClientRect();
    const windowHeight = window.innerHeight;

    if (top < windowHeight / 2 || bottom > windowHeight / 2) {
      section.style.background = '#E8EEF2';
    }

    if (bottom < windowHeight / 2 || top > windowHeight / 2) {
      section.style.background = 'initial';
    }
  })
}

function insertNewArticle() {
  const article = document.createElement('article');
  const button = document.createElement('button');

  button.innerHTML = 'Add new section';

  mainElement.prepend(article);
  article.prepend(button);

  button.addEventListener('click', () => {
    const section = document.createElement('section');
    section.innerHTML = getRandomContent();

    article.insertBefore(section, button);
  });
}

function getRandomContent() {
  let text = '';
  const possible = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

  for (let i = 0; i < 400; i++)
    text += possible.charAt(Math.floor(Math.random() * possible.length));

  return text;
}