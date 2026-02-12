// Step 1: Create two arrays
const collegeFriends = ["Rahul", "Priya", "Arjun"];
const workFriends = ["Sneha", "Karan", "Meena"];

// Step 2: Function to create party list
const createPartyList = () => {

    // Spread Operator to merge arrays
    const partyList = ["Me", ...collegeFriends, ...workFriends];

    // Display party list
    const ul = document.getElementById("partyList");
    ul.innerHTML = "";

    partyList.forEach(friend => {
        const li = document.createElement("li");
        li.innerText = friend;
        ul.appendChild(li);
    });

    // Call Rest Operator Function
    welcomeGuests(partyList[0], ...partyList.slice(1));
};


// Step 3: Function using REST operator
const welcomeGuests = (host, ...guests) => {

    const message = `
Host: ${host}
Total Guests: ${guests.length}
Guests: ${guests.join(", ")}
    `;

    document.getElementById("restOutput").innerText = message;
};
