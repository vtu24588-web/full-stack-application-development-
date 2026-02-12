// Complex Object
const player = {
    id: 101,
    name: "Virat Kohli",
    team: "India",
    stats: {
        matches: 275,
        runs: 12898,
        average: 57.3
    },
    achievements: ["World Cup", "Asia Cup", "IPL Trophy"]
};

// 🔥 Object Destructuring
const {
    name,
    team,
    stats: { runs, average },
    achievements
} = player;

// 🔥 Array Destructuring
const [firstAchievement, secondAchievement] = achievements;

// Display results
console.log("Player Name:", name);
console.log("Team:", team);
console.log("Runs:", runs);
console.log("Average:", average);
console.log("First Achievement:", firstAchievement);
console.log("Second Achievement:", secondAchievement);
