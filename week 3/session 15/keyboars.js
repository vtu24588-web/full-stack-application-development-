const coordinatesDisplay = document.getElementById("coordinates");
const quadrantDisplay = document.getElementById("quadrant");

function updateScreen(x, y) {

    const width = window.innerWidth;
    const height = window.innerHeight;

    coordinatesDisplay.innerText = `X: ${Math.floor(x)} | Y: ${Math.floor(y)}`;

    let quadrant = "";

    if (x < width / 2 && y < height / 2) {
        quadrant = "Top-Left";
        document.body.style.backgroundColor = "#ffadad";
    }
    else if (x >= width / 2 && y < height / 2) {
        quadrant = "Top-Right";
        document.body.style.backgroundColor = "#ffd6a5";
    }
    else if (x < width / 2 && y >= height / 2) {
        quadrant = "Bottom-Left";
        document.body.style.backgroundColor = "#caffbf";
    }
    else {
        quadrant = "Bottom-Right";
        document.body.style.backgroundColor = "#9bf6ff";
    }

    quadrantDisplay.innerText = `Quadrant: ${quadrant}`;
}

// Trackpad / Mouse support
document.addEventListener("mousemove", (event) => {
    updateScreen(event.clientX, event.clientY);
});

// Touchscreen support (for touch laptops)
document.addEventListener("touchmove", (event) => {
    const touch = event.touches[0];
    updateScreen(touch.clientX, touch.clientY);
});
