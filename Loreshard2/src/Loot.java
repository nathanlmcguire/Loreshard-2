import java.util.Random;


public class Loot 
	{
	static int forageNumber, lootNumber, findingLuck, playerLuck, dodgeAffect = 0; 
	static int armorBonus = 0, weaponBonus = 0, fireballBonus = 0, healingSpellBonus = 0, dodgeBonus = 0;
	static int weight, goldOfPlayer = 30, itemID;
	static String armorName = "Leather Armor", fireItemName = "Training Fire Scroll", healingItemName = "Training Healing Scroll", bootOrCloakName = "Training Boots";
	
	public static int lootBeast()//Randomly generates loot from the dead beast.(Only if you killed it.) 30 different items!
		{
		generateNumber();
		System.out.println("You open the bag of loot at your feet.");
		System.out.println("");
		Intros.delayOneSecond();
		switch (lootNumber)
			{ 
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				{
				System.out.println("You have found some Stone Armor!");
				System.out.println();
				armorName = "Stone Armor";
				System.out.println("Level 1 Item.");
				System.out.println();
				armorBonus = 1;
				System.out.println("Your max HP has now been increased by 1.");
				System.out.println();
				itemID = 1;
				break;
				}
			case 6:
			case 7:
			case 8:
			case 9:
				{
				System.out.println("You have found some Iron Armor!");
				System.out.println();
				armorName = "Iron Armor";
				System.out.println("Level 2 Item.");
				System.out.println();
				armorBonus = 2;
				System.out.println("Your max HP has now been increased by 2.");
				System.out.println();
				itemID = 2;
				break;
				}
			case 10:
			case 11:
			case 12:
				{
				System.out.println("You have found some Steel Armor!");
				System.out.println();
				armorName = "Steel Armor";
				System.out.println("Level 3 Item.");
				System.out.println();
				armorBonus = 4;
				System.out.println("Your max HP has now been increased by 4.");
				System.out.println();
				itemID = 4;
				break;
				}
			case 13:
			case 14:
				{
				System.out.println("You have found some Titanium Armor!");
				System.out.println();
				armorName = "Titanium Armor";
				System.out.println("Level 4 Item.");
				System.out.println();
				System.out.println("Your max HP has now been increased by 6.");
				System.out.println();
				itemID = 6;
				armorBonus = 6;
				break;
				}
			case 15:
				{
				System.out.println("You have found some Platinum Armor!");
				System.out.println();
				armorName = "Platinum Armor";
				System.out.println("Level 5 Item.");
				System.out.println();
				armorBonus = 8;
				System.out.println("Your max health is 8 more points now!");
				System.out.println();
				itemID = 8;
				break;	
				}
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				{
				System.out.println("You have found a Stone " + Hero.weaponName + "!");
				System.out.println();
				Hero.weaponName = Hero.weaponName;
				Hero.weaponName = "Stone " + Hero.weaponName + "";
				System.out.println("Level 1 Item.");
				System.out.println();
				weaponBonus = 1;
				System.out.println("You now do 1 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				itemID = 1;
				break;
				}
			case 21:
			case 22:
			case 23:
			case 24:
				{
				System.out.println("You have found an Iron " + Hero.weaponName + "!");
				System.out.println();
				Hero.weaponName = Hero.weaponName;
				Hero.weaponName = "Iron " + Hero.weaponName + "";
				System.out.println("Level 2 Item.");
				System.out.println();
				weaponBonus = 2;
				System.out.println("You now do 2 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				itemID = 2;
				break;	
				}
			case 25:
			case 26:
			case 27:
				{
				System.out.println("You have found a Steel " + Hero.weaponName + "!");
				System.out.println();
				Hero.weaponName = Hero.weaponName;
				Hero.weaponName = "Steel " + Hero.weaponName + "";
				System.out.println("Level 3 Item.");
				System.out.println();
				weaponBonus = 4;
				System.out.println("You now do 4 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				itemID = 4;
				break;	
				}
			case 28:
			case 29:
				{
				System.out.println("You have found a Titanium " + Hero.weaponName + "!");
				System.out.println();
				Hero.weaponName = Hero.weaponName;
				Hero.weaponName = "Titanium " + Hero.weaponName + "";
				System.out.println("Level 4 Item.");
				System.out.println();
				weaponBonus = 6;
				System.out.println("You now do 6 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				itemID = 6;
				break;
				}
			case 30:
				{
				System.out.println("You have found a Platinum " + Hero.weaponName + "!");
				System.out.println();
				Hero.weaponName = "Platinum " + Hero.weaponName + "";
				System.out.println("Level 5 Item.");
				System.out.println();
				weaponBonus = 8;
				System.out.println("You do 8 more points of damage with your " + Hero.weaponName + " now!");
				System.out.println();
				itemID = 8;
				break;		
				}
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
				{
				System.out.println("You have found a Weak Fireball Scroll!");
				System.out.println();
				fireItemName = "Weak Fireball Scroll";
				System.out.println("Level 1 Item.");
				System.out.println();
				fireballBonus = 1;
				System.out.println("Your Fireball Spell does 1 more damage now.");
				System.out.println();
				itemID = 1;
				break;	
				}
			case 36:
			case 37:
			case 38:
			case 39:
				{
				System.out.println("You have found a Moderate Fireball Scroll!");
				System.out.println();
				fireItemName = "Moderate Fireball Scroll";
				System.out.println("Level 2 Item.");
				System.out.println();
				fireballBonus = 2;
				System.out.println("Your Fireball Spell does 2 more damage now.");
				System.out.println();
				itemID = 2;
				break;	
				}
			case 40:
			case 41:
			case 42:
				{
				System.out.println("You have found an Advanced Fireball Scroll!");
				System.out.println();
				fireItemName = "Advanced Fireball Scroll";
				System.out.println("Level 3 Item.");
				System.out.println();
				fireballBonus = 4;
				System.out.println("Your Fireball Spell does 4 more damage now.");
				System.out.println();
				itemID = 4;
				break;	
				}
			case 43:
			case 44:
				{
				System.out.println("You have found an Apprentice Ring of Fire!");
				System.out.println();
				fireItemName = "Apprentice Ring of Fire";
				System.out.println("Level 4 Item.");
				System.out.println();
				fireballBonus = 6;
				System.out.println("Your Fireball Spell does 6 more damage now.");
				System.out.println();
				itemID = 6;
				break;			
				}
			case 45:
				{
				System.out.println("You have found a Master Ring of Fire!");
				System.out.println();
				fireItemName = "Master Ring of Fire";
				System.out.println("Level 5 Item.");
				System.out.println();
				fireballBonus = 8;
				System.out.println("Your Fireball Spell does 8 more damage now.");
				System.out.println();
				itemID = 8;
				break;			
				}
			case 46:
			case 47:
			case 48:
			case 49:
			case 50:
				{				
				System.out.println("You have found a Weak Healing Scroll!");
				System.out.println();
				healingItemName = "Weak Healing Scroll";
				System.out.println("Level 1 Item.");
				System.out.println();
				healingSpellBonus = 1;
				System.out.println("Your Healing Spell/Healing Potions heal you up 1 more now.");
				System.out.println();
				itemID = 1;
				break;
				}	
			case 51:
			case 52:
			case 53:
			case 54:
				{
				System.out.println("You have found a Moderate Healing Scroll!");
				System.out.println();
				healingItemName = "Moderate Healing Scroll";
				System.out.println("Level 2 Item.");
				System.out.println();
				healingSpellBonus = 2;
				System.out.println("Your Healing Spell/Healing Potions heal you up 2 more now.");
				System.out.println();
				itemID = 2;
				break;	
				}
			case 55:
			case 56:
			case 57:
				{
				System.out.println("You have found an Advanced Healing Scroll!");
				System.out.println();
				healingItemName = "Advanced Healing Scroll";
				System.out.println("Level 3 Item.");
				System.out.println();
				healingSpellBonus = 4;
				System.out.println("Your Healing Spell/Healing Potions heal you up 4 more now.");
				System.out.println();
				itemID = 4;
				break;
				}	
			case 58:
			case 59:
				{
				System.out.println("You have found an Apprentice Ring of Healing!");
				System.out.println();
				healingItemName = "Apprentice Ring of Healing";
				System.out.println("Level 4 Item.");
				System.out.println();
				healingSpellBonus = 6;
				System.out.println("Your Healing Spell/Healing Potions heal you up 6 more now.");
				System.out.println();
				itemID = 6;
				break;
				}
			case 60:
				{
				System.out.println("You have found a Master Ring of Healing!");
				System.out.println();
				healingItemName = "Master Ring of Healing";
				System.out.println("Level 5 Item.");
				System.out.println();
				healingSpellBonus = 8;
				System.out.println("Your Healing Spell/Healing Potions heal you up 8 more now.");
				System.out.println();
				itemID = 8;
				break;
				}
			case 61:
			case 62:
			case 63:
			case 64:
			case 65:
				{
				System.out.println("You have found Weak Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				bootOrCloakName = "Weak Boots of " + Hero.dodgeTypeName + "ing";
				System.out.println("Level 1 Item.");
				System.out.println();
				dodgeBonus = 1;
				System.out.println("You " + Hero.dodgeTypeName + " 1 more point of damage now!");
				System.out.println();
				itemID = 1;
				break;
				}
			case 66:
			case 67:
			case 68:
			case 69:
				{
				System.out.println("You have found Moderate Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				bootOrCloakName = "Moderate Boots of " + Hero.dodgeTypeName + "ing";
				System.out.println("Level 2 Item.");
				System.out.println();
				dodgeBonus = 2;
				System.out.println("You " + Hero.dodgeTypeName + " 2 more points of damage now!");
				System.out.println();
				itemID = 2;
				break;
				}
			case 70:
			case 71:
			case 72:
				{
				System.out.println("You have found Advanced Boots of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				bootOrCloakName = "Advanced Boots of " + Hero.dodgeTypeName + "ing";
				System.out.println("Level 3 Item.");
				System.out.println();
				dodgeBonus = 4;
				System.out.println("You " + Hero.dodgeTypeName + " 6 more points of damage now!");
				System.out.println();
				itemID = 4;
				break;
				}
			case 73:
			case 74:
				{
				System.out.println("You have found an Apprentice Cloak of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				bootOrCloakName = "Apprentice Cloak of " + Hero.dodgeTypeName + "ing";
				System.out.println("Level 4 Item.");
				System.out.println();
				dodgeBonus = 6;
				System.out.println("You " + Hero.dodgeTypeName + " 6 more points of damage now!");
				System.out.println();
				itemID = 6;
				break;
				}
			case 75:
				{
				System.out.println("You have found a Master Cloak of " + Hero.dodgeTypeName + "ing!");
				System.out.println();
				bootOrCloakName = "Master Cloak of " + Hero.dodgeTypeName + "ing";
				System.out.println("Level 5 Item.");
				System.out.println();
				dodgeBonus = 8;
				System.out.println("You " + Hero.dodgeTypeName + " 8 more points of damage now!");
				System.out.println();
				itemID = 8;
				break;
				}
			case 76:
			case 77:
			case 78:
			case 79:
			case 80:
				{
				System.out.println("You have found 2 Healing Potions!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 2;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;	
				}
			case 81:
			case 82:
			case 83:
			case 84:
				{
				System.out.println("You have found 3 Healing Potions!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 3;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;		
				}
			case 85:
			case 86:
			case 87:
				{
				System.out.println("You have found 4 Healing Potions!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 4;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}
			case 88:
			case 89:
				{
				System.out.println("You have found 5 Healing Potions!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 5;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}
			case 90:
				{
				System.out.println("You have found 6 Healing Potions!");
				System.out.println();
				System.out.println("Level 5 Item.");
				System.out.println();
				Hero.numberOfPotions = Hero.numberOfPotions + 6;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				break;
				}
			case 91:
				{
				System.out.println("You have found an Essence!  This ancient soul of a forgotten hero will make your weapon magical!");
				System.out.println();
				System.out.println("Level 5 Item.");
				System.out.println();
				weaponBonus = weaponBonus * 2;
				System.out.println("Your " + Hero.weaponName + " does 2x damage now!");
				System.out.println();
				break;	
				}
			case 92:
			case 93:
			case 94:
			case 95:
				{
				System.out.println("You have found 30 Gold!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				goldOfPlayer = goldOfPlayer + 30;
				System.out.println("You have " + goldOfPlayer + " gold now.");
				System.out.println();
				break;
				}
			case 96:
			case 97:
			case 98:
				{
				System.out.println("You have found 40 Gold!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				goldOfPlayer = goldOfPlayer + 40;
				System.out.println("You have " + goldOfPlayer + " gold now.");
				System.out.println();
				break;	
				}
			case 99:
			case 100:
				{
				System.out.println("You have found 50 Gold!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				goldOfPlayer = goldOfPlayer + 50;
				System.out.println("You have " + goldOfPlayer + " gold now.");
				System.out.println();
				break;		
				}
			case 101:
				{
				System.out.println("You have found 60 Gold!");
				System.out.println();
				System.out.println("Level 5 Item.");
				System.out.println();
				goldOfPlayer = goldOfPlayer + 60;
				System.out.println("You have " + goldOfPlayer + " gold now.");
				System.out.println();
				break;		
				}
			}
		return lootNumber;
		}
	
	public static int generateNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		lootNumber = 1 + randomNumber.nextInt(94);
		return lootNumber;
		}	
	
	public static int lootGarden()//Randomly generates loot from the dead beast.(Only if you killed it.) 30 different items!
		{
		generateNumberForForaging();
		System.out.println("You find some herbs at your feet.");
		System.out.println("");
		Intros.delayOneSecond();
		switch (lootNumber)
			{ 
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				{
				System.out.println("You have found 4 Healing Berries!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				break;
				}
			case 6:
			case 7:
			case 8:
			case 9:
				{
				System.out.println("You have found 4 Healing Leaves!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				break;
				}
			case 10:
			case 11:
			case 12:
				{
				System.out.println("You have found 4 Healing Branches!");
				System.out.println();
				armorName = "Steel Armor";
				System.out.println("Level 3 Item.");
				System.out.println();
				break;
				}
			case 13:
			case 14:
				{
				System.out.println("You have found 4 Healing Moss!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				break;
				}
			case 15:
				{
				System.out.println("You have found a Sunlight Healing Herb");
				System.out.println();
				System.out.println("Level 5 Item.");
				System.out.println();
				break;	
				}
			case 16:
			case 17:
			case 18:
			case 19:
			case 20:
				{
				System.out.println("You have found 4 Poison Berries!");
				System.out.println();
				System.out.println("Level 1 Item.");
				System.out.println();
				break;
				}
			case 21:
			case 22:
			case 23:
			case 24:
				{
				System.out.println("You have found 4 Poison Leaves!");
				System.out.println();
				System.out.println("Level 2 Item.");
				System.out.println();
				break;	
				}
			case 25:
			case 26:
			case 27:
				{
				System.out.println("You have found 4 Poison Branches!");
				System.out.println();
				System.out.println("Level 3 Item.");
				System.out.println();
				break;	
				}
			case 28:
			case 29:
				{
				System.out.println("You have found 4 Poison Moss!");
				System.out.println();
				System.out.println("Level 4 Item.");
				System.out.println();
				break;
				}
			case 30:
				{
				System.out.println("You have found a Moonlust Poison Herb!");
				System.out.println();
				System.out.println("Level 5 Item.");
				System.out.println();
				break;		
				}
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
				{
				System.out.println("You have found 4 Fortifying Berries!");
				System.out.println();
				fireItemName = "Weak Fireball Scroll";
				System.out.println("Level 1 Item.");
				System.out.println();
				fireballBonus = 1;
				System.out.println("Your Fireball Spell does 1 more damage now.");
				System.out.println();
				itemID = 1;
				break;	
				}
			case 36:
			case 37:
			case 38:
			case 39:
				{
				System.out.println("You have found 4 Fortifying Leaves!");
				System.out.println();
				fireItemName = "Moderate Fireball Scroll";
				System.out.println("Level 2 Item.");
				System.out.println();
				fireballBonus = 2;
				System.out.println("Your Fireball Spell does 2 more damage now.");
				System.out.println();
				itemID = 2;
				break;	
				}
			case 40:
			case 41:
			case 42:
				{
				System.out.println("You have found 4 Fortifying Branches!");
				System.out.println();
				fireItemName = "Advanced Fireball Scroll";
				System.out.println("Level 3 Item.");
				System.out.println();
				fireballBonus = 4;
				System.out.println("Your Fireball Spell does 4 more damage now.");
				System.out.println();
				itemID = 4;
				break;	
				}
			case 43:
			case 44:
				{
				System.out.println("You have found 4 Fortifying Moss!");
				System.out.println();
				fireItemName = "Apprentice Ring of Fire";
				System.out.println("Level 4 Item.");
				System.out.println();
				fireballBonus = 6;
				System.out.println("Your Fireball Spell does 6 more damage now.");
				System.out.println();
				itemID = 6;
				break;			
				}
			case 45:
				{
				System.out.println("You have found a Stoneskine Fortication Herb!");
				System.out.println();
				fireItemName = "Master Ring of Fire";
				System.out.println("Level 5 Item.");
				System.out.println();
				fireballBonus = 8;
				System.out.println("Your Fireball Spell does 8 more damage now.");
				System.out.println();
				itemID = 8;
				break;			
				}
			}
		return forageNumber;
		}
	
	public static int generateNumberForForaging()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		forageNumber = 1 + randomNumber.nextInt(94);
		return forageNumber;
		}	
	
	}