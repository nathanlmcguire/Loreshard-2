import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MonsterGenerator 
	{
	static String monsterAttackName, monsterName, areaOfBoss;
	static int randomMonsterNumber, monsterHealth = 0, monsterDamage = 0, areaChoiceOne, areaChoiceTwo, areaChoiceThree, bossFight = 0;
		
	public static int kildarinMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfKildarinMonsters = {"Hunter Goblin", "Warrior Goblin", "Shaman Goblin", "Weak Goblin", "Giant Rat", "Rat Rider Goblin"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Hunter Goblin";
				monsterHealth = 1;
				monsterDamage = 3;
				monsterAttackName = " aims his bow and shoots at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Warrior Goblin";	
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " swings his sword at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Shaman Goblin";	
				monsterHealth = 0;
				monsterDamage = 4;
				monsterAttackName = " blasts a ball of fire at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Weak Goblin";
				monsterHealth = 0;
				monsterDamage = 0;
				monsterAttackName = " launches himself at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Rat";
				monsterHealth = 2;
				monsterDamage = 3;
				monsterAttackName = " launches itself at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Rat Rider Goblin";
				monsterHealth = 4;
				monsterDamage = 5;
				monsterAttackName = " lowers his spear and charges at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
		
	public static int gormarMonsterArray()
		{		
		Monster.generateMonsterHitPoints();
		String[] listOfGormarMonsters = {"Nightmare", "Wandering Zombie", "Hunter Zombie", "Zombie Nightmare Rider", "Ice Nightmare", "Nightmare Stallion"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Nightmare";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " charges at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Wandering Zombie";	
				monsterHealth = 1;
				monsterDamage = 1;
				monsterAttackName = " groans and slowly walks towards you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Hunter Zombie";	
				monsterHealth = 0;
				monsterDamage = 4;
				monsterAttackName = " screams and runs at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Zombie Nightmare Rider";
				monsterHealth = 3;
				monsterDamage = 4;
				monsterAttackName = " turns the Nightmare towars you and charges";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Ice Nightmare";
				monsterHealth = 4;
				monsterDamage = 4;
				monsterAttackName = " charges at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Nightmare Stallion";
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " charges at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}

	public static int farstarnMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfFarstarnMonsters = {"Fading Ghost", "Vengful Ghost", "Ghost Sailor", "Poisonous Mushroom", "Giant Toad", "Ghost Thief"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Fading Ghost";
				monsterHealth = 4;
				monsterDamage = 1;
				monsterAttackName = " turns toward you and attacks";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Vengful Ghost";	
				monsterHealth = 4;
				monsterDamage = 3;
				monsterAttackName = " glares at you with its red eyes and attacks";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Ghost Sailor";	
				monsterHealth = 4;
				monsterDamage = 2;
				monsterAttackName = " turns toward you and attacks";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Poisonous Mushroom";
				monsterHealth = 2;
				monsterDamage = 5;
				monsterAttackName = " blasts poison spores in your direction";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Toad";
				monsterHealth = 6;
				monsterDamage = 1;
				monsterAttackName = " jumps out from the bank at you";
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Ghost THief";
				monsterHealth = 2;
				monsterDamage = 1;
				monsterAttackName = " tries to stab you with a ghostly knife";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int serebisMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfFarstarnMonsters = {"Giant Spider", "Two-Headed Spider", "Spider Swarm", "Giant Venus Fly Trap", "Giant Daddy Long Legs", "Hardened Spider"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Giant Spider";
				monsterHealth = 3;
				monsterDamage = 2;
				monsterAttackName = " scuttles toward you and attacks";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Two-Headed Spider";	
				monsterHealth = 4;
				monsterDamage = 3;
				monsterAttackName = " glares at you with all 16 eyes and attacks";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Spider Swarm";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " scutles toward you in hube numbers";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Giant Venus Fly Trap";
				monsterHealth = 1;
				monsterDamage = 7;
				monsterAttackName = " snaps at you with it's giant mouth";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Giant Daddy Long Legs";
				monsterHealth = 6;
				monsterDamage = 1;
				monsterAttackName = " quickly scuttles towards you snapping its mandibles";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Hardened Spider";
				monsterHealth = 8;
				monsterDamage = 2;
				monsterAttackName = " quickly scuttles towards you snapping its mandibles";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int darktarnMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfDarktarnMonsters = {"Lava Elemental", "Troll Worker", "Troll Fighter", "Rusty Automaton", "Troll Crossbowman", "Crazed Troll"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Lava Elemental";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " lurches out of a pool of lava and comes towards you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Troll Worker";	
				monsterHealth = 1;
				monsterDamage = 0;
				monsterAttackName = " raises its tools and attacks you";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Troll Fighter";	
				monsterHealth = 2;
				monsterDamage = 6;
				monsterAttackName = " dips its blade in the lava and come at you with it";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Rusty Automoton";
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " wakes from its slumber and shakes of the rust as it charges you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Troll Crossbowman";
				monsterHealth = 0;
				monsterDamage = 9;
				monsterAttackName = " raises its expertly crafted crossbow and fires at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Crazed Troll";
				monsterHealth = 1;
				monsterDamage = 3;
				monsterAttackName = " charges at you screaming dwarvish curses";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int deepstainMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfDeepstainMonsters = {"Ancient Skeleton", "Vengful Skeleton", "Wraith", "Dark Automotan", "Necromancer", "Corrupted Soul"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Ancient Skeleton";
				monsterHealth = 0;
				monsterDamage = 1;
				monsterAttackName = " its bone grates together as it comes at you with an ancient blade";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Vengful Skeleton";	
				monsterHealth = 0;
				monsterDamage = 5;
				monsterAttackName = " charges at you wishing to avenge the wrongs done to it";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Wraith";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " blasts dark magic at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Dark Automaton";
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " wakes from its slumber and shakes of the rust as it charges you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Necromancer";
				monsterHealth = 3;
				monsterDamage = 9;
				monsterAttackName = " blasts evil magic at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Corrupted Soul";
				monsterHealth = 7;
				monsterDamage = 2;
				monsterAttackName = " charges at you wishing to use you as a host";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}

	public static int vortonsinMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		System.out.println();
		String[] listOfVortonsinMonsters = {"Wolf", "Ferocious Man", "Snow Leopard", "Dark Druid", "Werewolf", "Alpha Wolf"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Wolf";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " growls and lunges at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Ferocious Man";	
				monsterHealth = 6;
				monsterDamage = 3;
				monsterAttackName = " growls and lunges at you";
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Snow Leapard";	
				monsterHealth = 7;
				monsterDamage = 4;
				monsterAttackName = " growls and lunges at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Dark Druid";
				monsterHealth = 1;
				monsterDamage = 7;
				monsterAttackName = " moves the earth to slay you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Werewolf";
				monsterHealth = 6;
				monsterDamage = 5;
				monsterAttackName = " growls and lunges at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Alpha Wolf";
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " growls and lunges at you";	
				bossFight = 0;
				break;	
				}
			}
		return randomMonsterNumber;
		}
	
	public static int areaChange()
		{
		if (Fight.numberOfSlainEnemies < 5)
			{
			generateMonsterNumber();
			kildarinMonsterArray();
			SideQuests.collectionOfQuests();
			}
		 else if (Fight.numberOfSlainEnemies == 5)
			{
			Monster.generateMonsterHitPoints();
			System.out.println("You walk into a large cavern where the Goblin Chief awaits you.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You can see that his throne is made up of bones, but you can't tell what or who they are from.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("This Chief screams a challenge to you, and you know that he will not let you pass from this cave to journey on to the Vale.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You must slay him.");
			System.out.println();
			Intros.delayOneSecond();
			monsterName = "Goblin Chief";
			monsterHealth = 10;
			monsterDamage = 10;
			monsterAttackName = " swings his scepter at you";
			bossFight = 1;
			areaOfBoss = "Kildarin";
			}
		 else if (Fight.numberOfSlainEnemies == 6)
			{
			 System.out.println("Three paths are before you.");
			 System.out.println();
			 Intros.delayOneSecond();
			 System.out.println("Do you wish to go to 1, 2, or 3?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceOne = userInput1.nextInt();
			 switch(areaChoiceOne)
			 	{
			 	case 1:
			 		{
			 		Intros.startGormarIntro();	
			 		gormarMonsterArray();
			 		break;
			 		}
				 
			 	case 2:
			 		{
			 		Intros.startFarstarnIntro();	
			 		farstarnMonsterArray();
			 		break;
			 		}
				 
			 	case 3:	
			 		{
			 		Intros.startSerebisIntro();	
			 		serebisMonsterArray();
			 		break;
			 		}
			 	}
			}
		 else if (Fight.numberOfSlainEnemies < 10 && Fight.numberOfSlainEnemies > 5)
		 	{
			 switch(areaChoiceOne)
				{
				case 1:
					{
					generateMonsterNumber();
					gormarMonsterArray();
					SideQuests.collectionOfQuests();
					break;
					}
				case 2:
					{
					generateMonsterNumber();	
					farstarnMonsterArray();
					SideQuests.collectionOfQuests();
					break;
					}
				case 3:
					{
					generateMonsterNumber();
					serebisMonsterArray();
					SideQuests.collectionOfQuests();
					break;
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 10)
			{
			 switch(areaChoiceOne)
				{
				case 1:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a Nightmare coming towards you being ridden by a zombie wearing heavy armor.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("The zombie is wearing the armor of a Captain, and it clutches a hardy steel lance.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("He believes that you the one who destroyed all of the troops under him.  You con not continue to the Vale unless he is dead.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("Slay him.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Captain Morthusk";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " attacks you with his lance";
					bossFight = 1;	
					areaOfBoss = "Gormar";	
					break;
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk onto a boat floating on murky water.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("This boat is the only way out of Farstarn that eventually leads to the Vale.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("A Ghostly Captain materializes, intent on keeping you off his ship.  Kill him.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Ghost Captain";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings his ghostly at you";
					bossFight = 1;	
					areaOfBoss = "Farstarn";	
					break;
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk into a large clearing where overhanging trees block out the moon.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("A throne of silver stands before you, it would have been beautiful if not for the thousands of webs covering it.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You hear a sound and look up to see a massive spider attached to the trees.  She leaps down in front of the exit to Serebis");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You must slay her to leave the forest.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Spider Queen";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " bites at you with her mandibles";
					bossFight = 1;	
					areaOfBoss = "Serebis";	
					break;
					}
				}			 
			}
		 else if (Fight.numberOfSlainEnemies == 11)
			{
			 generateMonsterNumber();
			 System.out.println("Three paths are before you.");
			 System.out.println();
			 Intros.delayOneSecond();
			 System.out.println("Do you wish to go to 1, 2, or 3?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceTwo = userInput1.nextInt();
			 switch(areaChoiceTwo)
			 	{
			 	case 1:
			 		{
			 		Intros.startDarktarnIntro();	
			 		darktarnMonsterArray();
			 		break;
			 		}
			 	case 2:
			 		{
			 		Intros.startDeepstainIntro();
			 		deepstainMonsterArray();
			 		break;	
			 		}
			 	case 3:
			 		{
			 		Intros.startVortonsinIntro();
			 		vortonsinMonsterArray();
			 		break;
			 		}
			 	}
			}
		 else if (Fight.numberOfSlainEnemies < 15 && Fight.numberOfSlainEnemies > 11)
		 	{
			 switch(areaChoiceTwo)
				{
				case 1:
					{
					generateMonsterNumber();
					darktarnMonsterArray();
					SideQuests.collectionOfQuests();
					break;
					}
				case 2:
					{
					generateMonsterNumber();	
					deepstainMonsterArray();
					SideQuests.collectionOfQuests();
					break;	
					}
				case 3:
					{
					generateMonsterNumber();	
					vortonsinMonsterArray();
					SideQuests.collectionOfQuests();
					break;	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 15)
			{
			 switch(areaChoiceTwo)
				{
				case 1:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk to the edge of the fiery volcano, and see a massive rusty suit of armor in the lava.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("Without anyone wearing it, it begins to move, and with a massive gauntlet it attacks you.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You must destroy it before you proceed to the Vale.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Ancient Pierced Armor";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings its great metal claymore at you";
					bossFight = 1;	
					areaOfBoss = "Darktarn";	
					break;		
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk into a massive throne room littered with millions of bones.  The Liche Emperor is sitting at his throne, waiting for you.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You sense that he wants your body for some dark purpose.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("He will not let you pass alive, you must kill him.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Liche Emperor";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " blasts dark hexes at you";
					bossFight = 1;		
					areaOfBoss = "Deepstain";
					break;
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You see a wolf coming towards you.  Or is it a man?");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("The being morphs continuously between a hideous beast and a rabid man.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("This creature will not let you leave its territory on your quest to get to the Vale.  Slay it.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Mutant Elder";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;		
					areaOfBoss = "Vortonsin";	
					break;
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 16)
			{
			 generateMonsterNumber();
			 System.out.println("Three paths are before you.");
			 System.out.println();
			 Intros.delayOneSecond();
			 System.out.println("Do you wish to go to 1, 2, or 3?");
			 Scanner userInput1 = new Scanner(System.in);
			 areaChoiceThree = userInput1.nextInt();
			 switch(areaChoiceThree)
			 	{
			 	case 1:
			 		{
			 		Intros.startTerikIntro();
			 		terikMonsterArray();
			 		break;	
			 		}
			 	case 2:
			 		{
			 		Intros.startSorthusIntro();
			 		sorthusMonsterArray();
			 		break;	
			 		}
			 	case 3:
			 		{
			 		Intros.startPartokIntro();
			 		partokMonsterArray();
			 		break;	
			 		}
			 	}
			}
		else if (Fight.numberOfSlainEnemies < 20 && Fight.numberOfSlainEnemies > 16)
			{
			 switch(areaChoiceThree)
				{
				case 1:
					{
					generateMonsterNumber();	
					terikMonsterArray();
					SideQuests.collectionOfQuests();
					break;	
					}
				case 2:
					{
					generateMonsterNumber();	
					sorthusMonsterArray();
					SideQuests.collectionOfQuests();
					break;	
					}
				case 3:
					{
					generateMonsterNumber();	
					partokMonsterArray();
					SideQuests.collectionOfQuests();
					break;	
					}
				}
			}
		 else if (Fight.numberOfSlainEnemies == 20)
			{
			 switch(areaChoiceThree)
				{
				case 1:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You walk all the way up the trunk of the Great Tree. At the top is a throne made of charred Elf bones.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("The Chief Barbarian sits on the throne, and he stands, brandishing a mace and screaming war cries.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("This Barbarian is challenging you for the Throne of Terik.  Slay it to continue to the Vale.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Barbarian Chieftan";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings his mace of bone at you";
					bossFight = 1;			
					areaOfBoss = "Terik";	
					break;
					}
				case 2:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("In front of you is a path that slopes up and out of the canyon.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You walk towards it, but a half man half scorpion scuttles out from a hole in the ");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("This creature will not let you continue on the the Vale.  Slay it.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Mutant Scorpion";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " claws and bites at you";
					bossFight = 1;			
					areaOfBoss = "Sorthus";	
					break;
					}
				case 3:
					{
					Monster.generateMonsterHitPoints();	
					System.out.println("You find yourself at a tower of solid ice.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You rap on it, and it feels solid as granite.  Then it moves.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("The ice being turns to face you and you can see a frozen corpse.");
					System.out.println();
					Intros.delayThreeSeconds();
					System.out.println("You know you must slay this ice giant and free the poor explorer from his endless torture.");
					System.out.println();
					Intros.delayOneSecond();
					monsterName = "Frozen Adventurer";
					monsterHealth = 10;
					monsterDamage = 10;
					monsterAttackName = " swings a massive arm of jagged ice at you";
					bossFight = 1;			
					areaOfBoss = "Partok";	
					break;
					}
				}
			}
		 if (Fight.numberOfSlainEnemies == 21)
		 	{
			 Intros.startDoomkeepIntro();
			 doomkeepMonsterArray();
		 	}
		 if (Fight.numberOfSlainEnemies < 30 && Fight.numberOfSlainEnemies > 20)
			{
			 generateMonsterNumber();
			 doomkeepMonsterArray();
			}
		 else if (Fight.numberOfSlainEnemies == 30)
			{
			 Monster.generateMonsterHitPoints();	
			System.out.println("You open the door to the Throne Room.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Where the Throne should be instead there is the door to the Vale.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You go forward to finally be safe, but before you materializes a great shadow.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("You shudder in fear of this being you have heard so much about, but you know that you must kill it to enter the Vale, and be saved.");
			System.out.println();
			Intros.delayOneSecond();
			monsterName = "-";
			monsterHealth = 15;
			monsterDamage = 15;
			monsterAttackName = " swings a blade of Shadow at you";
			bossFight = 1;			
			areaOfBoss = "Doomkeep";
			}
		 if (Fight.numberOfSlainEnemies == 31)
		 	{
			 Intros.startValeIntro();
			 valeMonsterArray();
		 	}
		 if (Fight.numberOfSlainEnemies < 40 && Fight.numberOfSlainEnemies > 31)
			{
			 generateMonsterNumber();
			 valeMonsterArray();
			}
		 else if (Fight.numberOfSlainEnemies == 40)
			{
			 Monster.generateMonsterHitPoints();	
			System.out.println("You enter the massive white tent that is marked as King Thornwir's, hoping to save him.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("As you enter you see the King, his skin made of shadow, his armor pierced and battered.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("Thornwir turns.  'HELLO MORTAL.  I HAVE WAITED LONG FOR THIS MOMENT.'");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("'YOU WISH TO KNOW HOW I CAME HERE? LET ME TELL YOU.'");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("'IT WAS YOU.  YOU BROUGHT ME HERE.  I COULD NOT ENTER THE VALE WITHOUT A HUMAN HOST TO WILLINGLY CARRY ME THERE.'");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("YOU WERE MY HOST, MY PARASITE, NOW I HAVE A TRUE HOST.  I GUIDED YOU TOWARDS MY GOAL.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("ALL HAVE FALLEN TO ME, BECAUSE OF YOU.  I THANK YOU, BUT ONE FOE REMAINS... YOU.");
			System.out.println();
			Intros.delayThreeSeconds();
			System.out.println("The Shadow draws the Kingblade of THornwir.  'NOW DIE AT THE HANDS OF YOUR KING!'");
			System.out.println();
			Intros.delayOneSecond();
			monsterName = "The Shadow";
			monsterHealth = 20;
			monsterDamage = 20;
			monsterAttackName = " swings the Kingblade at you";
			bossFight = 1;				
			areaOfBoss = "Vale";
			}
		 else if (Fight.numberOfSlainEnemies == 41)
		 	{	
			 Intros.startEndgameIntro();
		 	}
		return areaChoiceThree;
		}	
	
	public static int generateMonsterNumber()//Generates the random number for the lootBeast method.
		{
		randomMonsterNumber = 0;
		Random randomNumber = new Random();
		randomMonsterNumber = randomNumber.nextInt(5);
		return randomMonsterNumber;
		}
	
	public static void loreShardReveal()
		{
		if(bossFight == 1)
			{
			if("Kildarin".equals (areaOfBoss))
				{
				System.out.println("Kildarin:The land farthest away from the Vale is mostly comprised of huge cave systems.  These caves were once a rich mining facility owned by the dwarves.  Iron, Steel, and Precious Gems littered these caves, and riches flowed from Kildarin.  Most common materials were mined from this place.  Now it is derelict, barren, and overrun by goblins.  Wether the goblins overthrew the few dwarfs who did not retreat to the Vale, or they are what the dwarfs became, is lost in The Shadow.");
				}
			else if("Gormar".equals (areaOfBoss))
				{
				System.out.println("Gormar:The massive plains were roamed by the quickest Horses in the land.  The Humans tried to tame them for warfare against The Shadow.  But the Horses were quickly corrupted by The Shadow and developed their flaming manes and tails along with their violent attitudes.  Some of the corpses of the dead human soldiers still roam this plain looking for their mounts who forsake them in battle with the Shadow.");
				}
			else if("Farstarn".equals (areaOfBoss))
				{
				System.out.println("Farstarn:The swamp was dangerous even before The Shadow came, and travelers paid ferries to guide them through.  Farstarn was a place where adventurers and sailors could make an honest liveing, however, most didn't.  Thieves, conmen, and pirates abounded in this mysterious swamp.  No one knows what they did when The Shadow came, only that now the ghosts of their guilt, and anger still haunt Farstarn looking for a waylaid traveler to take out their anger on.");
				}
			else if("Serebis".equals (areaOfBoss))
				{
				System.out.println("Serebis:The grand forest where the Elf Queen reigned.  It was infested with spiders and the Queen spent many soldiers to keep them at bay.  But when The Shadow came those soldiers were pulled from their task to fight IT.  Their mistake cost them, and the corpses of their army are still preserved in various webs all over Serebis.");
				}
			else if("Darktarn".equals (areaOfBoss))
				{
				System.out.println("Darktarn:The massive volcano was once the great forge of the Dwarves.  They crafted many a Legendary Blade here, but they were not warriors. When The Shadow came they begged for their lives.  The Shadow made a deal with the Dwarves that if they made him a suit of armor worthy of him he would grant them immortality.  The dwarves agreed a began to make it, but a few wished to defeat The Shadow.  They built the armor with a flaw so that a hero could strike The Shadow and slay it.  The flaw went unnoticed and the Shadow let Darktarn in peace.  The Dwarf Rebels sent word to Darnth, a great Dwarven Mage who mounted an assault on Doomkeep with the entire Rebel Dwarf army.  While the army was slaughtered out side the walls, Darnth snuck in and faced The Shadow.  Darnth struck the chink with his full might, and pierced it, but The Shadow was unharmed.  After The Shadow destroyed Darnth and the Rebel Dwarves, he went back to Darktarn, furious with the Dwarven smiths there.  They pleaded for their lives, and The Shadow would have taken them, but immortal beings are bound by their word, so he cursed them.  For ever more the traitorous Dwarves of Darktarn will burn inside skin of stone:  the Trolls of the Dwarf Forge.");
				}
			else if("Deepstain".equals (areaOfBoss))
				{
				System.out.println("Deepstain:The pit that carves its way into the earth was the Capital of the Dwarven Empire.  Here the miners found rare Shardium Ore.  They mined so far down that some accounts even say that they got to the core of the planet.  They were masters of metal work, and they made automatons run on magic to act as soldiers.  These automatons made up the finest army in the land, but they crumbled easily against The Shadow.  The Dwarf Emperor thought that if the automatons were more intelligent they could be effective against The Shadow.  But all attempts simulated intelligence failed, so the King began to use the human brains of the dead to give the fighting machines intelligence.  When this failed as well, the King began to steal the brains of those still alive.  When it proved that human organs powered the machines better than magic most of the Emperor's subjects were robbed to create an army to resist The Shadow.  By the time The Shadow arrived, the Dwarven Emperor was the lone Dwarf in Deepstain, and since The Shadow's to corrupt had already occurred in Deepstain, he let it lie in its twisted state.");
				}
			else if("Vortonsin".equals (areaOfBoss))
				{
				System.out.println("Vortonsin:The cold plains of Vortonsin were populated by scattered Human settlements.  The Humans there were tough, hardy people.  When news of The Shadow came, they did not flee to the Vale like all those who were sane.  They thought themselves superior to all who lived in comfort.   They all allied together and met with The Shadow at the borders of Vortonsin.  The survivors of the bloodbath were led by Elder Warthon.  He was a very skilled Druid and he convinced the remaining people that the only way to survive was to live as the wolf did.  Wolves still prowl this icy tundra, and ever since Warthon marred the line between beast and man it is hard to tell if the wolves living there were born as wolf, or as man.");
				}
			else if("Terik".equals (areaOfBoss))
				{
				System.out.println("Terik:The jungle domain of the elves.  Once the home to proud tribes of human barbarians the elves who overthrew them were wild and powerful.  Arguably they had the best change of defeating The Shadow out of all the races.  They rose the whole forest from its slumber, and prepared it for war.  The trees, the plants, the animals, the very grass was ready to fight The Shadow.  The fearsome Elvish warriors amassed themselves and destroyed old feuds. The Great Elvish Resistance stood waiting for The Shadow, but The Shadow knew of their power.  Wisely he did not engage them, but instead he rallied the Barbarians who used to own Terik.  He gave them the gift of Dark Pyromancy and enraged their very essence's.  The Barbarians mounted a surprise attack on the Wild Elves(as they were nicknamed) from the flank and burned them down with Dark Fire.  The elves died, but the jungle lived on, corrupted and twisted.  Not even The Shadow could destroy The Great Tree at the center of Terik, but he could corrupt it, and he did.");
				}
			else if("Sorthus".equals (areaOfBoss))
				{
				System.out.println("Sorthus:A canyon that stands just before Doomkeep.  The people there lived in peace, and had little defense against the Shadow.  The merchant Morton, who tamed wild beasts as guards for a living, came up with a plan.  He had recently discovered a species of scorpion that was deadly, resilient, hardy, and not aggressive on sight.  He had caught a few, and with the help of mages quickly bred them larger, faster, and easier to train.  In fear of The Shadow he spent weeks breeding them, never sleeping and barely eating.  But unfortunately the scorpions wouldn't work in a unit, for they were independent creatures and they needed a leader. He began to go insane, and in a last attempt to defend the town before The Shadow came he used magic to meld himself with a scorpion to act as a leader.  But the magic corrupted him, and he was more scorpion and fear, than leadership and reason.  Once again The Shadow's goal of corruption had been achieved without him even entering the area.  He was content to let Morton tear his own town apart trying to prepare defense.  Even today Morton still trains his scorpions to follow his lead, and he will not hesitate to use wandering Humans as rewards for his minions.");
				}
			else if("Partok".equals (areaOfBoss))
				{
				System.out.println("Partok:The unexplored in-land-sea of Partok is shrouded in mystery.  It is so frozen with ice that you can walk upon Partok without fear.  But the area is unmapped, and many wanted to know more of the mysterious place.  The famous explorer Quar, who had journeyed to every land known was sent by the Human King to map this place.  He never came back, but the year after he disappeared The Shadow came forth.  For this reasons many believe that Quar discovered The Shadow's prison here and foolishly opened it.  But no one truly knows.");
				}
			else if("Doomkeep".equals (areaOfBoss))
				{
				System.out.println("Doomkeep:The legendary keep of the Humans.  During the Age of Shadow Thornwir ruled as King and he was a strong one.  He sent scouts to The Shadow, but none came back.  He was offered advice, and sent reports of destroyed villages, and asked for help.  He sent his quickest cavalry to help defend the forest of Serebis, where the Elf Queen resided.  He was quite close with the Elf Queen and mourned for days when he heard of her death.  This changed him, and he pulled all his soldiers back to the castle, along with all refugees, of any race.  as The Shadow descended on Doomkeep he consulted his old friend, the great mage Yolvar.  Yolvar knew what he needed to do, and began to build the Vale, a refuge for those pursued by The Shadow, with the help of the Mages Guild.  Thornwir gathered every wizard he could to help Yolvar and the Guild, but when The Shadow arrived at the walls of Doomkeep he was not finished. The walls of Doomkeep, however, were heavily enchanted and The Shadow would have to spend months unraveling those wards.  But Thornwir was betrayed by his Steward, Wherem.  Wherem made a bargain with The Shadow and then marred the magic protection of DoomKeep.  The Shadow entered the castle, and Yolvar, knowing that he must buy time, challenged The Shadow to combat.  The Shadow agreed, and Yolvar gave battle, the most difficult battle ever fought by The Shadow, it went on for three hours.  But still Yolvar was mortal, and The Shadow smote him down.  By then, The Vale was complete and all the refugees and soldiers fell back into The Vale.  The Shadow pursued but was unable to follow.  No one knows what happened to Wherem, or what his bargain was, but it must have been fulfilled, for immortal beings must keep their word.");
				}
			else if("Vale".equals (areaOfBoss))
				{
				System.out.println("The Vale:The magical safe-haven made by Yolvar for protection from The Shadow.  It proved effective, unless The Shadow was given permission to enter in a mortal host.  When " + Hero.nameOfPlayer + " unwittingly acted as that host The Shadow corrupted everyone in the Vale and used King Thornwir as his host.  When the Hero awoke he fought through to The Shadow, and faced him in combat.  Although this Hero came closer than any who came before, all accounts tell that he was slain, and that The Shadow reigned on until the Third Era.  The Age of Redemption.");
				}
			else if("Pathway".equals (areaOfBoss))
				{
				System.out.println("This old Pathway Gaurdian is one of many magically summoned beings.  These things were made by the great wizard Yolvar, and charged with holding stalling The Shadow and all his minions when they marched on Doomkeep.  But The Shadow must have corrupted them, for now they seem to fight everything that crosses the path that they are charged with protecting.");
				Intros.delayThreeSeconds();	
				Intros.delayThreeSeconds();	
				}
			else if("Pit".equals(areaOfBoss))
				{
				System.out.println("This Pit Demon is one of the last of its kind.  These creatures used to be numerous all over the land, they were used by the Elves as traps for enemies.  When The Shadow came he turned them to evil, and now they steal from and kill travelers, who pass their homes in ignorance.");
				Intros.delayThreeSeconds();	
				Intros.delayThreeSeconds();	
				}
			else if("Knight".equals(areaOfBoss))
				{
				System.out.println("This Knight was one of the last members of the Knight's Guild.  They were vicious mercenaries for many years until the Elven Sword Master Prince: Jason, reformed them into a gathering for Knights to defend the weak.  Their moral system still stood when they, allianced with the Thieves Guild, were anhialated by The Shadow in the Battle of Manor Hill.");
				Intros.delayThreeSeconds();	
				Intros.delayThreeSeconds();	
				}
			else if("Mage".equals(areaOfBoss))
				{
				System.out.println("This Mage was one of the last members of the Mages Guild.  They were cruel necromancers who abducted the innocent for experiments, untill they were reformed by Yolvar.  He made them into a society of brilliant people, who used magic to learn, and not to destroy.  This Guild, under Yolvar, were the prime creators of the Vale.");
				Intros.delayThreeSeconds();	
				Intros.delayThreeSeconds();	
				}
			else if("Thief".equals(areaOfBoss))
				{
				System.out.println("This Thief was one of the last members of the Thieves Guild.  They were once a scattered and untrustworthy group of cuthroats.  Then the Hobbit Forthright entered their ranks.  He oranized them and shaped them from bandits to liberators who stole from the rich to give to the poor.  The Thieves Guild allied with the Knight's Guild in the Battle of Manor Hill, their first and last battle.");
				Intros.delayThreeSeconds();	
				Intros.delayThreeSeconds();	
				}
			}
		}
	
	public static int partokMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfPartokMonsters = {"Small Ice Elemental", "Ice Elemental", "Massive Ice Elemental", "Ice Mage", "Ice Dragon", "The Really Stupid Fire Mage"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Small Ice Elemental";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " launches itself at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Ice Elemental";	
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " swings its razor sharp hands of ice at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Massive Ice Elemental";	
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " tries to crush you with a massive hammer of ice";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Ice Mage";
				monsterHealth = 0;
				monsterDamage = 8;
				monsterAttackName = " blasts snow and ice at you while singing, 'Let it Go!'";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Ice Dragon";
				monsterHealth = 9;
				monsterDamage = 9;
				monsterAttackName = " snaps at you and breathes ice";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "The Really Stupid Fire Mage";
				monsterHealth = 0;
				monsterDamage = 1;
				monsterAttackName = " blasts weak fireballs at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int terikMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfTerikMonsters = {"Corrupted Tree", "Corruupted Elf", "Barbarian Warrior", "Dark Pyromancer", "Barbarian Hunter", "Panther"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Corrupted Tree";
				monsterHealth = 3;
				monsterDamage = 3;
				monsterAttackName = " swings it's withered roots at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Corrupted Elf";	
				monsterHealth = 2;
				monsterDamage = 2;
				monsterAttackName = " fires dark arrows at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Barbarian Warrior";	
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " slashes at you with a sword";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Dark Pyromancer";
				monsterHealth = 0;
				monsterDamage = 7;
				monsterAttackName = " blasts shadow fire at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Barbarian Hunter";
				monsterHealth = 2;
				monsterDamage = 6;
				monsterAttackName = " aims and shoots at you with a bow and arrow";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Panther";
				monsterHealth = 2;
				monsterDamage = 2;
				monsterAttackName = " lunges at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int sorthusMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfSorthusMonsters = {"Deadly Scorpion", "Giant Scorpion", "Canyon Golem", "Giant Snake", "Rocs", "Man-Eating Cactus"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Deadly Scorpion";
				monsterHealth = -2;
				monsterDamage = 9;
				monsterAttackName = " tries to sting you with its small but deadly tail";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Giant Scorpion";	
				monsterHealth = 4;
				monsterDamage = 4;
				monsterAttackName = " tries to sting you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Canyon Golem";	
				monsterHealth = 8;
				monsterDamage = 0;
				monsterAttackName = " swings it's massive arm of rock at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Giant Snake";
				monsterHealth = 2;
				monsterDamage = 6;
				monsterAttackName = " unsheathes it's fangs and bites at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Roc";
				monsterHealth = 0;
				monsterDamage = 8;
				monsterAttackName = " trys to claw you with it's talons";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Man-Eating Cactus";
				monsterHealth = 9;
				monsterDamage = 5;
				monsterAttackName = " opens it's mouth to swallow you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int doomkeepMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfDoomkeepMonsters = {"Corrupted Human Soldier", "Corrupted Human Archer", "Corrupted Human Royal Guard", "Corrupted Human Knight", "Corrupted Human Mage", "Corrupted Human Servant"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Corrupted Human Soldier";
				monsterHealth = 4;
				monsterDamage = 4;
				monsterAttackName = " swings his blade of shadow at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Corrupted Human Archer";	
				monsterHealth = 3;
				monsterDamage = 6;
				monsterAttackName = " aims and shoots arrows of shadow at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Corrupted Human Royal Guard";	
				monsterHealth = 8;
				monsterDamage = 8;
				monsterAttackName = " swings his blade of shadow at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Corrupted Human Mage";
				monsterHealth = 0;
				monsterDamage = 8;
				monsterAttackName = " blasts dark magic at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Corrupted Human Knight";
				monsterHealth = 7;
				monsterDamage = 7;
				monsterAttackName = " swings his blade of shadow at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Corrupted Human Servant";
				monsterHealth = 0;
				monsterDamage = 0;
				monsterAttackName = " swings his knife of shadow at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	
	public static int valeMonsterArray()
		{
		Monster.generateMonsterHitPoints();
		String[] listOfValeMonsters = {"Corrupted Human Soldier", "Corrupted Elf Healer", "Corrupted Thornwir's Bodyguard", "Corrupted Hobbit Archer", "Corrupted Dwarf Mage", "Corrupted Refugee"};	
		switch (randomMonsterNumber)
			{
			case 0:
				{
				monsterName = "Corrupted Human Soldier";
				monsterHealth = 5;
				monsterDamage = 5;
				monsterAttackName = " swings his blade of shadow at you";
				bossFight = 0;
				break;
				}
			case 1:
				{
				monsterName = "Corrupted Elf Healer";	
				monsterHealth = 9;
				monsterDamage = 2;
				monsterAttackName = " swings his mace of shadow at you";	
				bossFight = 0;
				break;
				}
			case 2:
				{
				monsterName = "Corrupted Thornwir's Bodyguard";	
				monsterHealth = 10;
				monsterDamage = 10;
				monsterAttackName = " swings his blade of shadow at you";	
				bossFight = 0;
				break;
				}
			case 3:
				{
				monsterName = "Corrupted Hobbit Archer";
				monsterHealth = 3;
				monsterDamage = 7;
				monsterAttackName = " aims and shoots arrows of shadow at you";	
				bossFight = 0;
				break;
				}
			case 4:
				{
				monsterName = "Corrupted Dwarf Mage";
				monsterHealth = 6;
				monsterDamage = 8;
				monsterAttackName = " blasts dark magic at you";	
				bossFight = 0;
				break;
				}
			case 5:
				{
				monsterName = "Corrupted Refugee";
				monsterHealth = 1;
				monsterDamage = 1;
				monsterAttackName = " swings his knife of shadow at you";	
				bossFight = 0;
				break;
				}
			}
		return randomMonsterNumber;
		}
	}








