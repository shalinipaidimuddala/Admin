public class FantasyGame {
    public static void main(String[] args) {
        try {
            Warrior warrior = new Warrior("Thorin", 150, 30, 20);
            Dragon dragon = new Dragon("Smaug", 200, 50, 40);
            Mage mage = new Mage("Gandalf", 100, 40, 10);
            Goblin goblin = new Goblin("Grub", 50, 10, 5);

            Sword sword = new Sword("Excalibur", 50);
            Staff staff = new Staff("Wizard's Staff", 40);

            warrior.equip(sword);
            mage.equip(staff);

            Inventory<Equipment> inventory = new Inventory<>();
            inventory.addItem(sword);
            inventory.addItem(staff);

            while (warrior.isAlive() && dragon.isAlive()) {
                warrior.attack(dragon);
                if (dragon.isAlive()) {
                    dragon.attack(warrior);
                }
            }

            mage.useAbility(goblin);
            System.out.println("Goblin health after attack: " + goblin.getHealth());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
