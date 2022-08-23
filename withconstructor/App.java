public class App {
    public static void main(String[] args) {

        // Creates a new object named "barbarian" from Character class
        Character barbarian = new Character(10, 5, 0, "awit");
        // Calls the sayMyName method
        barbarian.sayMyName();
        barbarian.sayMyAgility();
        barbarian.sayMyIntelligence();
        barbarian.sayMyStrength();

        // Creates a new object named "archer" from Character class
        Character archer = new Character(0, 5, 10, "arrow");
        // Calls the sayMyName method
        archer.sayMyName();
        archer.sayMyAgility();
        archer.sayMyIntelligence();
        archer.sayMyStrength();

        // Creates a new object named "goblin" from Character class
        Character goblin = new Character(5, 10, 0, "coins");
        // Calls the sayMyName method
        goblin.sayMyName();
        goblin.sayMyAgility();
        goblin.sayMyIntelligence();
        goblin.sayMyStrength();

        // Creates a new object named "healer" from Character class
        Character healer = new Character(10, 5, 0, "heal");
        // Calls the sayMyName method
        healer.sayMyName();
        healer.sayMyAgility();
        healer.sayMyIntelligence();
        healer.sayMyStrength();

    }
}
