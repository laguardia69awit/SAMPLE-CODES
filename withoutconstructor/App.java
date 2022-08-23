public class App {
    public static void main(String[] args) {

        Character barbarian = new Character();

        barbarian.strength = 20;
        barbarian.agility = 10;
        barbarian.intelligence = 5;
        barbarian.name = "awit";
        barbarian.sayMyName();
        barbarian.sayMyAgility();
        barbarian.sayMyStrength();
        barbarian.sayMyIntelligence();

        Character archer = new Character();

        archer.strength = 15;
        archer.agility = 10;
        archer.intelligence = 10;
        archer.name = "arrow";
        archer.sayMyName();
        archer.sayMyAgility();
        archer.sayMyStrength();
        archer.sayMyIntelligence();

        Character goblin = new Character();

        goblin.strength = 30;
        goblin.agility = 20;
        goblin.intelligence = 20;
        goblin.name = "coins";
        goblin.sayMyName();
        goblin.sayMyAgility();
        goblin.sayMyStrength();
        goblin.sayMyIntelligence();

        Character healer = new Character();

        healer.strength = 20;
        healer.agility = 15;
        healer.intelligence = 10;
        healer.name = "heal";
        healer.sayMyName();
        healer.sayMyAgility();
        healer.sayMyStrength();
        healer.sayMyIntelligence();

    }
}
