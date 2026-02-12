// Function that returns a Promise
const bakePizza = () => {

    return new Promise((resolve, reject) => {

        document.getElementById("status").innerText = "⏳ Preparing your pizza...";

        // Simulate delay (3 seconds)
        setTimeout(() => {

            const pizzaReady = true; // Change to false to test reject

            if (pizzaReady) {
                resolve("✅ Your pizza is ready! Enjoy your meal 🍕");
            } else {
                reject("❌ Sorry, the oven is broken. Order cancelled!");
            }

        }, 3000);

    });
};


// Function triggered on button click
const orderPizza = () => {

    bakePizza()
        .then(message => {
            document.getElementById("status").innerText = message;
        })
        .catch(error => {
            document.getElementById("status").innerText = error;
        });

};
