import java.util.Random;
import java.util.Scanner;


public class SideQuests 
	{
	static int randomQuestNumber, randomNameNumber, randomCallNumber, moralLeftOrRightChoice, randomOutcomeNumber, helpChoiceOne, helpChoiceTwo;
	static int tryDoorChoice, lockNumberOne, lockNumberTwo, lockNumberThree, i, lockChoice, slayChoiceKnight, slayChoiceMage, slayChoiceThief;
	static String riddleGuess;
	
	public static int generateQuest()
		{
		Random randomNumber = new Random();
		randomQuestNumber = 1 + randomNumber.nextInt(16);
		return randomQuestNumber;
		}

	public static void generateName()
		{
		String [] firstPartOfName= {"Yorgund", "Seth", "Saird", "Martin", "Quarth", "Fend", "Tark", "Nor"};
		String [] secondPartOfName= {" a Mage", " a Thief", " a Fighter", " a Healer", " a Nightblade", " a Battlemage", " a Paladin", " a Swordsman"};
		String [] thirdPartOfName= {" of Deepstain", " of Serebis", " of Doomkeep", " of Terik", " of Kildarin", " of Vortonsin", " of Sorthus", " of the Unknown"};
		generateNameNumber();
		System.out.println("I am " + firstPartOfName[randomNameNumber] + secondPartOfName[randomNameNumber] + thirdPartOfName[randomNameNumber] + ".");
		System.out.println();
		}
	
	public static int generateNameNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomNameNumber = randomNumber.nextInt(7);
		return randomNameNumber;
		}
	
	public static int generateCallNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomCallNumber = randomNumber.nextInt(2);
		return randomCallNumber;
		}
	
	public static int generateOutcomeNumber()//Generates the random number for the lootBeast method.
		{
		Random randomNumber = new Random();
		randomOutcomeNumber = 1 + randomNumber.nextInt(2);
		return randomOutcomeNumber;
		}
	
	public static void collectionOfQuests()
		{
		generateQuest();
		switch (randomQuestNumber)
			{
			case 1:
				{
				moralChoice();
				break;
				}
			case 2:
				{
				pickLock();
				break;
				}
			case 3:
				{
				fightBeast();
				break;
				}
			case 4:
				{
				getItem();
				break;
				}
			case 5:
				{
				savePerson();
				break;
				}
			case 6:
				{
				pickLock();	
				break;
				}
			case 7:
				{
				healChoice();
				break;
				}
			case 8:
				{
				pickLock();		
				break;
				}
			case 9:
				{
				Market.sellOrBuy();
				break;
				}
			case 10:
				{
				Market.sellOrBuy();	
				break;
				}	
			case 11:
				{
				System.out.println("You hear something coming.  You raise your " + Hero.weaponName + " just as a " + MonsterGenerator.monsterName + " walks into your field of vision."); 
				System.out.println();
				Intros.delayThreeSeconds();		
				break;
				}	
			case 12:
				{
				System.out.println("You hear something coming.  You raise your " + Hero.weaponName + " just as a " + MonsterGenerator.monsterName + " walks into your field of vision."); 
				System.out.println();
				Intros.delayThreeSeconds();
				break;
				}
			case 13:
				{
				System.out.println("You hear something coming.  You raise your " + Hero.weaponName + " just as a " + MonsterGenerator.monsterName + " walks into your field of vision."); 
				System.out.println();
				Intros.delayThreeSeconds();		
				break;	
				}	
			case 14:
				{
				knightFarm();
				break;	
				}
			case 15:
				{
				mageFarm();
				break;	
				}
			case 16:
				{
				thiefFarm();
				break;	
				}
			case 17:
				{
				System.out.println("You hear something coming.  You raise your " + Hero.weaponName + " just as a " + MonsterGenerator.monsterName + " walks into your field of vision."); 
				System.out.println();
				Intros.delayThreeSeconds();		
				break;		
				}
			case 18:
				{
				findHerbs();	
				break;	
				}
			case 19:
				{
				findHerbs();	
				break;	
				}
			case 20:
				{
				findHerbs();	
				break;	
				}
			}
		}
			
	public static String savePerson()
		{
		System.out.println("You see, as you continue on your journey, a massive rock with runes inscribed on it.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("As you look closer you see that the rock has two arms that are wrapped around something... no someone!");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("You hear a muffled, 'Help me, solve the riddle!'");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Suddenly the stone lights up, and begins to speak.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("I am lighter than a feather, yet no man can hold me for very long. What am I?(answer in one word, six letters, all lower case)");
		Scanner userInput3 = new Scanner(System.in);
		riddleGuess = userInput3.nextLine();		
		if ("breath".equals (riddleGuess))
			{
			System.out.println("Correct you may pass.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("The stone releases its captive and disapears.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("The man you saved looks at you in wonder.");
			System.out.println();
			Intros.delayThreeSeconds();
			generateName();
			Intros.delayThreeSeconds();
			System.out.println("Here take this, it didn't help me much, but it might help you.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("He throws a bag of loot to you and then runs off.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			}
		else
			{
			System.out.println("You failed. Now I curse you.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You feel your health weaken 10 points as you are cursed, and the stone disappears, taking it's captive with it.");
			Hero.playerHitPoints = Hero.playerHitPoints - 10;
			System.out.println();
			Intros.delayOneSecond();
			}
		return riddleGuess;
		}

	public static int moralChoice()
		{
		System.out.println("As you are walking, you hear the sounds of combat.");	
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("You turn to see two people locked in combat.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("The fighter on the left is losing the battle while the fighter on the right is winning the battle." );
		System.out.println();
		Intros.delayThreeSeconds();
		generateCallNumber();
		String [] criesForHelp= {"'Please, help me!  I have nothing!'", "'Please help me, I am wealthy and will give you treasure!'", "'Leave me, I will hold this fiend off!'"};
		String [] criesForVengence= {"'Help me defeat this traitor!'", "'Help me, and I split his loot!'", "'Help me kill this man, he stole from me!'"};
		System.out.println("The person on the left calls out, " + criesForHelp[randomCallNumber] + "  The other person says, " + criesForVengence[randomCallNumber] + "");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Choose to help the man on the left(type 1) or the man on the right(type 2)");
		Scanner userInput1 = new Scanner(System.in);        
		moralLeftOrRightChoice = userInput1.nextInt();     
		if (moralLeftOrRightChoice == 1)
			{
			System.out.println("You charge forward and swing your " + Hero.weaponName + " at the fighter on the right, cutting him down instantly.");
			System.out.println();
			Intros.delayThreeSeconds();
			generateOutcomeNumber();
			if (randomOutcomeNumber == 1)
				{
				System.out.println("The man you saved looks at you in wonder.");
				System.out.println();
				Intros.delayThreeSeconds();
				generateName();
				Intros.delayThreeSeconds();
				Intros.delayThreeSeconds();
				System.out.println("Here take this, it didn't help me much, but it might help you.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("He throws a bag of loot to you and then runs off.");
				System.out.println();
				Intros.delayOneSecond();
				Loot.lootBeast();
				Intros.delayOneSecond();
				}
			if (randomOutcomeNumber == 2)
				{
				System.out.println("The man who you saved looks at you in wonder.");
				System.out.println();
				Intros.delayThreeSeconds();
				generateName();
				Intros.delayThreeSeconds();
				System.out.println("He holds out his hand to shake, and you do.  But instead of shaking your hand he takes your weapon.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("He runs off far faster than you and soon he has lost you.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("Now you do -5 damage.");
				System.out.println();
				Intros.delayOneSecond();
				Loot.weaponBonus = Loot.weaponBonus - 5;
				Intros.delayOneSecond();
				}
			}
		if (moralLeftOrRightChoice ==2)
			{
			System.out.println("You charge forward and swing your " + Hero.weaponName + " at the fighter on the left, cutting him down instantly.");
			System.out.println();
			generateOutcomeNumber();
			if (randomOutcomeNumber == 1)
				{
				System.out.println("The man you helped grins at you.");
				System.out.println();
				Intros.delayThreeSeconds();
				generateName();
				Intros.delayThreeSeconds();
				System.out.println("Here let me teach you what I know.");
				System.out.println();
				Intros.delayThreeSeconds();
				LevelUp.levelUp();
				}
			if (randomOutcomeNumber == 2)
				{
				System.out.println("The man who you helped grins at you.");
				System.out.println();
				Intros.delayThreeSeconds();
				generateName();
				Intros.delayThreeSeconds();
				System.out.println("Thanks for helping me take that traitor out.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("He pats you on the back, but with the other hand he stabs a knife into your side.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("He laughs maniacly as the poison flows into your body, and he runs away, screaming a strange song.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("You lie there for days barely fending off monsters.");
				System.out.println();
				Intros.delayThreeSeconds();
				System.out.println("You survive, but your max health is decreased by 10");
				Hero.playerHitPoints = Hero.playerHitPoints - 10;
				Intros.delayOneSecond();
				}
			}
		return moralLeftOrRightChoice;
		}
	
	public static int fightBeast()
		{
		System.out.println("As you walk along you come to a traveler sitting at a campfire.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("He looks up at you, 'Oh, a mighty adventurer!  Will you help me?'");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type 1 for yes, and 2 for no.");
		Scanner userInput3 = new Scanner(System.in);
		helpChoiceOne = userInput3.nextInt();
		if (helpChoiceOne == 1)
			{
			System.out.println("'You will?  Oh thank you so much!  It's just that, there is a deadly creature blocking my way to the Vale.  I am no warrior, could you kill it?'");
			System.out.println();
			Intros.delayThreeSeconds();
			generateName();
			Intros.delayThreeSeconds();
			System.out.println("You have already agreed to help so you say yes.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Thank you!  Here take this to help you.  You can keep it when you are done.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Pathway Gaurdian";
			MonsterGenerator.monsterHealth = 9;
			MonsterGenerator.monsterDamage = 9;
			MonsterGenerator.monsterAttackName = " swings his Great Hammer at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Pathway";
			}
		if (helpChoiceOne == 2)
			{
			System.out.println("'Well, thanks anyway.'  Says the traveler and slumps down at his fire.");
			System.out.println();
			Intros.delayOneSecond();
			}
		
		return helpChoiceOne;
		}
	
	public static int getItem()
		{
		System.out.println("As you walk along you come to a traveler standing over a pit.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("He looks up at you, 'Oh, a mighty adventurer!  Will you help me?'");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type 1 for yes, and 2 for no.");
		Scanner userInput3 = new Scanner(System.in);
		helpChoiceTwo = userInput3.nextInt();
		if (helpChoiceTwo == 1)
			{
			System.out.println("'You will?  Oh thank you so much!  It's just that, I dropped my family ring into a pit! It is an ancient relic and I would like to retrieve it before I go to the Vale.  Please get it for me?'");
			System.out.println();
			Intros.delayThreeSeconds();
			generateName();
			Intros.delayThreeSeconds();
			System.out.println("You have already agreed to help so you say yes.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Thank you!  Here take this to help you.  You can keep it when you are done.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Pit Demon";
			MonsterGenerator.monsterHealth = 9;
			MonsterGenerator.monsterDamage = 9;
			MonsterGenerator.monsterAttackName = " snarls and bites at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Pit";
			}
		if (helpChoiceTwo == 2)
			{
			System.out.println("'Well, thanks anyway.'  Says the traveler as you walk away.");
			System.out.println();
			Intros.delayOneSecond();
			}
	
		return helpChoiceTwo;
		}
	
	public static int pickLock()
		{
		System.out.println("In front of you is an ancient wooden door, covered in moss.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("You try the handle, but it is locked.  There must be treasure behind it.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Do you want to try to pick the lock? Type 1 for yes, and 2 for no.(If you have a Keystone it will be automatically used.)");
		Scanner userInput3 = new Scanner(System.in);
		tryDoorChoice = userInput3.nextInt();
		if (Loot.playerKeystoneNumber >= 1)
			{
			Loot.playerKeystoneNumber = Loot.playerKeystoneNumber - 1;
			System.out.println("You pull the Keystone out of your pack, and hold it up to the lock.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("The lock and the stone glow blue.");	
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("The stone fades away and the door clicks open, revealing the treasure inside.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();			
			}
		else
			{
			if (tryDoorChoice == 1)
				{
				System.out.println("You put your tools into the lock, and begin to pick it.  (Type the numbers you see to open the door)");
				System.out.println();
				Intros.delayThreeSeconds();
				generateLockNubmers();
				System.out.println("Type the number exactly as you saw it.");
				Scanner userInput2 = new Scanner(System.in);
				lockChoice = userInput2.nextInt();
				if(lockChoice == lockNumberOne)
					{
					System.out.println("You open the door, and behind it is treasure!");
					System.out.println();
					Intros.delayOneSecond();
					Loot.lootBeast();
					Intros.delayOneSecond();
					}
				else if(lockChoice != lockNumberOne)
					{
					System.out.println("You fail to open the door, and you spring a trap!");
					System.out.println();
					Intros.delayOneSecond();
					Hero.playerHitPoints = Hero.playerHitPoints - 3;
					System.out.println("Arrows fly out of the door and take away 3 of your hit points!");
					System.out.println();
					Intros.delayOneSecond();
					System.out.println("You limp away from the door, and continue on your journey.");
					System.out.println();
					Intros.delayOneSecond();
					}
				}
			if (tryDoorChoice == 2)
				{
				System.out.println("You walk away from the door.  There could be traps behind it.");
				System.out.println();
				Intros.delayOneSecond();
				}
			}
		return tryDoorChoice;
		}
	
	public static int findHerbs()
		{
		System.out.println("In front of you is a dilapitaded garden.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("You realize that you should find what herbs you ca before you leave.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Do you want to scavenge for herbs? Type 1 for yes, and 2 for no.");
		Scanner userInput3 = new Scanner(System.in);
		tryDoorChoice = userInput3.nextInt();
		if (tryDoorChoice == 1)
			{
			System.out.println("You kneel down and begin to forage.  (Type the numbers you see to open the door)");
			System.out.println();
			Intros.delayThreeSeconds();
			generateLockNubmers();
			System.out.println("Type the number exactly as you saw it.");
			Scanner userInput2 = new Scanner(System.in);
			lockChoice = userInput2.nextInt();
			if(lockChoice == lockNumberOne)
				{
				System.out.println("You find a bountiful harvest of herbs in the old garden!");
				System.out.println();
				Intros.delayOneSecond();
				Loot.generateNumberForForaging();
				Intros.delayOneSecond();
				}
			if(lockChoice != lockNumberOne)
				{
				System.out.println("You find nothing in the garden except poison nettles!");
				System.out.println();
				Intros.delayOneSecond();
				Hero.playerHitPoints = Hero.playerHitPoints - 3;
				System.out.println("It cuts you on the leg and you lose 3 HP!");
				System.out.println();
				Intros.delayOneSecond();
				System.out.println("You limp away from the area, and continue on your journey.");
				System.out.println();
				Intros.delayOneSecond();
				}
			}
		if (tryDoorChoice == 2)
			{
			System.out.println("You walk away from the garden.  There could be poisonous nettles hiding in the flowers.");
			System.out.println();
			Intros.delayOneSecond();
			}
		return tryDoorChoice;
		}

	public static int generateLockNubmers()
		{
		Random randomNumber = new Random();
		lockNumberOne = 10000 + randomNumber.nextInt(Hero.lockDifficulty);
		System.out.println(lockNumberOne);
		Intros.delayOneSecond();
		for(i = 0; i < 1001; i++)
			{
			System.out.println();
			}
		return lockNumberOne;
		}
	
	public static void healChoice()
		{
		System.out.println("As you are walking, you smell blood.");	
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("You turn a corner to find a man dying from blood loss.");
		System.out.println();
		Intros.delayThreeSeconds();
		generateName();
		Intros.delayThreeSeconds();
		if("HEALER".equals(Hero.jobOfPlayer) || "healer".equals(Hero.jobOfPlayer) || "Healer".equals(Hero.jobOfPlayer) || "PALADIN".equals(Hero.jobOfPlayer) || "paladin".equals(Hero.jobOfPlayer) || "Paladin".equals(Hero.jobOfPlayer))
			{
			System.out.println("Oh, a " + Hero.jobOfPlayer + "!  Please help me, I am dying.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You use your magic, and heal the man.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Thank you so much!  I can't stay, I need to get to my family in the Vale.  But take this.");
			System.out.println();
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			System.out.println("You are about to thank him, but he has already left.");
			System.out.println();
			Intros.delayOneSecond();
			}
		else
			{
			System.out.println("As you can see, I'm dying.  But you aren't a healer or a pladin, and therefore no help to me.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Go on, tell my family at the Vale of my demise.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("There is nothing to do, so you move on.");
			System.out.println();
			Intros.delayThreeSeconds();
			}
		}
	
	public static int knightFarm()
		{
		System.out.println("As you walk along you come to a man sleeping in a tent.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Next to him is a titanium weapon and a full suit of titanium armor.  You could attack him for this equipment.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type 1 to attack, or 2 to not attack.");
		Scanner userInput3 = new Scanner(System.in);
		slayChoiceKnight = userInput3.nextInt();
		if (slayChoiceKnight == 1)
			{
			System.out.println("You sneak up and grab the man's weapon and armor.");
			System.out.println();
			Hero.weaponName = Hero.weaponName;
			Hero.weaponName = "Titanium " + Hero.weaponName + "";
			Loot.weaponBonus = 6;
			Loot.armorName = "Titanium Armor";
			Loot.armorBonus = 6;
			Intros.delayThreeSeconds();
			System.out.println("He awakes and conjures a sword from thin air with magic.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("'Die thief!'");
			System.out.println();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Knight";
			MonsterGenerator.monsterHealth = 15;
			MonsterGenerator.monsterDamage = 15;
			MonsterGenerator.monsterAttackName = " swings his conjured sword at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Knight";
			}
		if (slayChoiceKnight == 2)
			{
			System.out.println("You shudder at what you were thinking.  How could you have harmed an innocent man?  You continue on your journey.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("Before you can go, the man awakens!");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("'Thank you for not stealing from me.  Take this as a token of my gratitude.'");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("He gives you some sort of amulet and goes back to sleep.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("You have joined the Knight's Guild! You now get a plus 2 to all weapons!");
			Loot.weaponBonus = Loot.weaponBonus + 2;
			System.out.println();
			Intros.delayOneSecond();
			}		
		return slayChoiceKnight;
		}
	
	public static int mageFarm()
		{
		System.out.println("As you walk along you come to a man sleeping in a tent.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Next to him is an Apprentice Ring of Fire and an Apprentice Ring of Healing.  You could attack him for this equipment.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type 1 to attack, or 2 to not attack.");
		Scanner userInput3 = new Scanner(System.in);
		slayChoiceMage = userInput3.nextInt();
		if (slayChoiceMage == 1)
			{
			System.out.println("You sneak up and grab the man's rings of magic.");
			System.out.println();
			Loot.healingItemName = "Apprentice Ring of Healing";
			Loot.healingSpellBonus = 6;
			Loot.fireItemName = "Apprentice Ring of Fire";
			Loot.fireballBonus = 6;
			Intros.delayThreeSeconds();
			System.out.println("He awakes and conjures a sword from thin air with magic.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("'Die thief!'");
			System.out.println();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Mage";
			MonsterGenerator.monsterHealth = 15;
			MonsterGenerator.monsterDamage = 15;
			MonsterGenerator.monsterAttackName = " swings his conjured sword at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Mage";
			}
		if (slayChoiceMage == 2)
			{
			System.out.println("You shudder at what you were thinking.  How could you have harmed an innocent man?  You continue on your journey.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("Before you can go, the man awakens!");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("'Thank you for not stealing from me.  Take this as a token of my gratitude.'");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("He gives you some sort of amulet and goes back to sleep.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("You have joined the Mages Guild! You now get a plus 2 to all fireball scrolls and rings!");
			Loot.fireballBonus = Loot.fireballBonus + 2;
			System.out.println();
			Intros.delayOneSecond();
			}		
		return slayChoiceMage;
		}
	
	public static int thiefFarm()
		{
		System.out.println("As you walk along you come to a man sleeping in a tent.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Next to him is an Apprentice Cloak of " + Hero.dodgeTypeName + "ing and 50 gold.  You could attack him for this equipment.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type 1 to attack, or 2 to not attack.");
		Scanner userInput3 = new Scanner(System.in);
		slayChoiceThief = userInput3.nextInt();
		if (slayChoiceThief == 1)
			{
			System.out.println("You sneak up and grab the man's gold and cloak.");
			System.out.println();
			Loot.bootOrCloakName = "Apprentice Cloak of " + Hero.dodgeTypeName + "ing";
			Loot.dodgeBonus = 6;
			Loot.goldOfPlayer = Loot.goldOfPlayer + 50;
			Intros.delayThreeSeconds();
			System.out.println("He awakes and conjures a sword from thin air with magic.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("'Die thief!'");
			System.out.println();
			Intros.delayOneSecond();
			MonsterGenerator.monsterName = "Mage";
			MonsterGenerator.monsterHealth = 15;
			MonsterGenerator.monsterDamage = 15;
			MonsterGenerator.monsterAttackName = " swings his conjured sword at you";
			MonsterGenerator.bossFight = 1;
			MonsterGenerator.areaOfBoss = "Mage";
			}
		if (slayChoiceThief == 2)
			{
			System.out.println("You shudder at what you were thinking.  How could you have harmed an innocent man?  You continue on your journey.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("Before you can go, the man awakens!");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("'Thank you for not stealing from me.  Take this as a token of my gratitude.'");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("He gives you some sort of amulet and goes back to sleep.");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("You have joined the Thieves Guild! You now get a plus 2 to all dodging equipment!");
			Loot.dodgeBonus = Loot.dodgeBonus + 2;
			System.out.println();
			Intros.delayOneSecond();
			}		
		return slayChoiceThief;
		}
	}
