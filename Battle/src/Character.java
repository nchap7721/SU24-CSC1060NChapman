import java.util.Random;

public class Character {

	private String name;

	private int hp, strength, dexterity, constitution, intelligence, wisdom, charisma;

	Weapon weapon1;
	Dice stats = new Dice(4, 5);
	Random rand = new Random();

	public Character() {

		this.name = null;
		setStats();

		weapon1 = new Weapon(null, 0);

	}

	public int getStrength() {
		return strength;
	}

	public void setStrength() {
		this.strength = stats.roolDice();
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity() {
		this.dexterity = stats.roolDice();
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution() {
		this.constitution = stats.roolDice();
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence() {
		this.intelligence = stats.roolDice();
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom() {
		this.wisdom = stats.roolDice();
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma() {
		this.charisma = stats.roolDice();
	}

	public Character(String name) {

		this.name = name;

		weapon1 = new Weapon(null, 0);

	}

	public Character(String name, String weapon, int damage) {

		this.name = name;

		weapon1 = new Weapon(weapon, damage);

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	
	public void setWeaponName(String name) {

		this.weapon1.setName(name);

	}

	public void setWeaponDamage(int damage) {

		this.weapon1.setDamage(damage);

	}
	
	public void setStats() {
		this.hp = stats.roolDice();
		this.strength = stats.roolDice();
		this.dexterity = stats.roolDice();
		this.constitution = stats.roolDice();
		this.intelligence = stats.roolDice();
		this.wisdom = stats.roolDice();
		this.charisma = stats.roolDice();
	}

	public int doDamage() {

		int damage = this.strength + this.weapon1.getDamage() * rand.nextInt(1, 4);

		return damage;

	}

	public void recieveDamage(int damage) {

		this.hp -= (damage - (this.constitution / 4));

	}

	public void setWeapon(String name, int damage) {

		weapon1 = new Weapon(name, damage);

	}

	@Override
	public String toString() {
		return "Character [ name = " + name + ", hp = " + hp + ", strength = " + strength + ", dexterity = " + dexterity
				+ ", constitution = " + constitution + ", intelligence = " + intelligence + ", wisdom = " + wisdom
				+ ", charisma = " + charisma + ", weapon1 = " + weapon1 + ", stats = " + stats + ", rand = " + rand + " ] ";
	}
}
