// Arrow function to generate receipt
const generateReceipt = (price, tip) => {
    const total = price + tip;

    return `
    -------- Receipt --------
    Price  : ₹${price}
    Tip    : ₹${tip}
    -------------------------
    Total  : ₹${total}
    `;
};

// Function to handle button click
const handleReceipt = () => {
    // Get input values
    const price = Number(document.getElementById("price").value);
    const tip = Number(document.getElementById("tip").value);

    // Basic validation
    if (price < 0 || tip < 0 || isNaN(price) || isNaN(tip)) {
        document.getElementById("output").innerText =
            "Please enter valid positive numbers!";
        return;
    }

    // Generate receipt message
    const message = generateReceipt(price, tip);

    // Display result
    document.getElementById("output").innerText = message;
};
