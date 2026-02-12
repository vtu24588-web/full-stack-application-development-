const box = document.getElementById("box");

// Initial position
let positionX = 200;
let positionY = 200;

// Movement speed
const step = 10;

// Global keyboard listener
document.addEventListener("keydown", (event) => {

    switch (event.key) {

        case "ArrowUp":
            positionY -= step;
            break;

        case "ArrowDown":
            positionY += step;
            break;

        case "ArrowLeft":
            positionX -= step;
            break;

        case "ArrowRight":
            positionX += step;
            break;
    }

    // Update position in DOM
    box.style.top = positionY + "px";
    box.style.left = positionX + "px";
});
