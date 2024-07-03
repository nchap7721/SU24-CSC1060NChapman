public class Battle {

	public static void main(String[] args) {

		Character hero = new Character("Herald");

		Character monster = new Character();

		Character monster2 = new Character("Kobald","axe", 15);

		Dice dice = new Dice(20, 1);
		
		monster.setName("Owlbear");

		monster.setStats();
////
		System.out.println(hero.toString());
////
		System.out.println(monster.toString());
////
		hero.setWeapon("sword", 12);
////
		System.out.println(hero.toString());
////
		monster.setWeapon("claws", 20);
////
		System.out.println(monster.toString());
////
		System.out.println(monster2.toString());
////
		int hit = hero.doDamage();
////
		monster2.recieveDamage(hit);
////
		System.out.println(monster2.toString());
//		
		
		

	}

}