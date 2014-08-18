import java.util.ArrayList;
public class Inventory 
	{
	static String equippedArmor, equippedWeapon, equippedFireItem, equippedHealingItem, equipedBootsOrCloak;
	
	//static ArrayList <String> PlayerInventory = new <String> ArrayList()

	public static void showInventory()
		{
		System.out.println("Inventory");
		System.out.println("Armor: " + Loot.armorName + " (" + Loot.armorBonus + ")");
		System.out.println("Weapon: " + Hero.weaponName + " (" + Loot.weaponBonus + ")");
		System.out.println("Spell: " + Loot.fireItemName + " (" + Loot.fireballBonus + ")");
		System.out.println("Healing Spell: " + Loot.healingItemName + " (" + Loot.healingSpellBonus + ")");
		System.out.println("Apparel: " + Loot.bootOrCloakName + " (" + Loot.dodgeBonus + ")");
		System.out.println("Potions: " + Hero.numberOfPotions + "");
		System.out.println("Gold: " + Loot.goldOfPlayer +"");
		System.out.println("Level: "+ Hero.levelOfPlayer + "");
		System.out.println();
		Intros.delayThreeSeconds();
		}
	}