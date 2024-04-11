console.log("05.js start...");
const boxEl = document.querySelector('.box');
boxEl.addEventListener('click', function(){
    console.log("Clicked...");
    boxEl.style.backgroundColor='orange';
});
