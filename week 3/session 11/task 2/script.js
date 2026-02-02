const video = document.getElementById("videoPlayer");
const audio = document.getElementById("audioPlayer");

// Video controls
function playVideo() {
    video.play();
}

function pauseVideo() {
    video.pause();
}

// Audio controls
function playAudio() {
    audio.play();
}

function pauseAudio() {
    audio.pause();
}

function muteAudio() {
    audio.muted = !audio.muted;
}
