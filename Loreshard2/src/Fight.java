import java.util.Random;
import java.util.Scanner;


public class Fight 
	{
	static int diceRollOne, diceRollTwo, diceRollThree, totalDice;
	static int playAgainChoice = 1, actionChoice;
	static int dodgeAffect = 0; 
	static int numberOfSlainEnemies = 0;
	static String pluralVariable;
	
	public static int chooseAction()//Lets the player choose their action.
		{
		System.out.println("_________________________________________________________________________________________________");
		System.out.println("|                                                                                                |");
		System.out.println("|                                                                                                |");
		System.out.println("|                                                                                                |");
		System.out.println("|                                                                                                |");
		System.out.println("|                                                o                                               |");
		System.out.println("|                                               ~0~" + Hero.weaponSymbol + "                                           |");
		System.out.println("|                                                A                                               |");
		System.out.println("|________________________________________________________________________________________________|");
		System.out.println(MonsterGenerator.monsterName + "'s HP = " + Monster.monsterHitPoints + " 									" + Hero.nameOfPlayer + "'s HP = " + Hero.playerHitPoints + ".");
		System.out.println("Would you like to use a 1) " + Hero.weaponName + ", 2) Fireball Spell, 3) " + Hero.healingTypeName + ",");
		System.out.println("4) Lightning Blast(do not try unless Level 20), or 5) to use " + Hero.dodgeTypeName + " on the next Atack."); 
		Scanner userInput1 = new Scanner(System.in);
		actionChoice = userInput1.nextInt();
		switch (actionChoice)
			{
			case 1:
				{
				dodgeAffect = 0;	
				Hero.playerAttackRoll();
				break;
				}
	
			case 2:
				{
				dodgeAffect = 0;
				resetDiceForRoll();
				Random randomNumber = new Random();
				diceRollOne = 1 + randomNumber.nextInt(3);
				diceRollTwo = 1 + randomNumber.nextInt(3);
				diceRollThree = 1 + randomNumber.nextInt(15);
				totalDice = (diceRollOne + diceRollTwo + diceRollThree + Loot.fireballBonus + Hero.classFireballBonus + Hero.raceFireballBonus);
				Monster.monsterHitPoints = (Monster.monsterHitPoints - totalDice);				
				System.out.println("You blast the enemy with flames and do " + totalDice + " damage!");
				Intros.delayOneSecond();
				break;
				}
			case 3:	
				{
					dodgeAffect = 0;
					resetDiceForRoll();
					Random randomNumber = new Random();
					diceRollOne = 1 + randomNumber.nextInt(Hero.healingName);
					diceRollTwo = 1 + randomNumber.nextInt(Hero.healingName);
					diceRollThree = 1 + randomNumber.nextInt(Hero.healingName);
					totalDice = diceRollOne + diceRollTwo + diceRollThree + Loot.healingSpellBonus + Hero.classHealingBonus + Hero.raceHealingBonus;
					Hero.playerHitPoints = (Hero.playerHitPoints + totalDice);
					System.out.println("You heal yourself " + totalDice + " points of health with your " + Hero.healingTypeName + "!");
					Intros.delayOneSecond();
					Monster.playerHealthResetCounter = Monster.playerHealthResetCounter - totalDice;
					if (Hero.healingName == 3)
						{
						Hero.numberOfPotions--;
						System.out.println();
						System.out.println(Hero.numberOfPotions + " potions left.");
						Intros.delayOneSecond();
						}
				else if (Hero.numberOfPotions == 0)
					{
					System.out.println("You have no potions left.");
					Intros.delayOneSecond();
					}
				break;	
				}
			case 4:
				{
				if(Hero.levelOfPlayer >= 20)
					{
					dodgeAffect = 0;
					resetDiceForRoll();
					Random randomNumber = new Random();
					diceRollOne = 50 + randomNumber.nextInt(100);
					diceRollTwo = 50 + randomNumber.nextInt(100);
					diceRollThree = 50 + randomNumber.nextInt(100);
					totalDice = diceRollOne + diceRollTwo + diceRollThree;
					Monster.monsterHitPoints = (Monster.monsterHitPoints - totalDice);
					System.out.println("Lightning archs towards the beast doing " + totalDice + " damage");
					Intros.delayOneSecond();
					}
				else
					{
					dodgeAffect = 0;
					resetDiceForRoll();
					Random randomNumber = new Random();
					diceRollOne = 1 + randomNumber.nextInt(2);
					diceRollTwo = 1 + randomNumber.nextInt(2);
					diceRollThree = 1 + randomNumber.nextInt(2);
					totalDice = diceRollOne + diceRollTwo + diceRollThree;
					Hero.playerHitPoints = (Hero.playerHitPoints - totalDice);
					System.out.println("The spell backfires doing " + totalDice + " damage to yourself.");
					Intros.delayOneSecond();
					}
				break;
				}
			case 5:
				{
				dodgeAffect = 0;	
				resetDiceForRoll();
				Random randomNumber = new Random();
				diceRollOne = 1 + randomNumber.nextInt(10);
				dodgeAffect = diceRollOne + Hero.classDodgeBonus + Loot.dodgeBonus + Hero.raceDodgeBonus;
				System.out.println("You prepare to " + Hero.dodgeTypeName + " the enemie's next blow.");
				System.out.println();
				Intros.delayOneSecond();
				System.out.println("You will " + Hero.dodgeTypeName + " " + dodgeAffect + " points of damage.");
				Intros.delayOneSecond();
				break;
				}
			}
		return actionChoice;
		}
	
	public static int simulateCombat()//The whole combat package which makes it so that you fight until you or the beast is dead.
		{
		while(Monster.monsterHitPoints > 0)
			{
			Monster.monsterAttackRoll();
			if (Hero.playerHitPoints <= 0)
				{
				System.out.println("YOU DIED!");
				System.out.println();
				Intros.delayOneSecond();
				Fight.askPlayerIfTheyWantToPlayAgain();
				}
			if (Hero.playerHitPoints != 0)
				{
				Fight.chooseAction();
				}
			}
	
		if (Monster.monsterHitPoints <= 0)
			{
			System.out.println();
			System.out.println("YOU HAVE SLAIN THE CREATURE!");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("You find some treasure on the body of the beast.");
			System.out.println();
			numberOfSlainEnemies++;
			Intros.delayOneSecond();
			Loot.lootBeast();
			Intros.delayOneSecond();
			Inventory.showInventory();
			Intros.delayThreeSeconds();
			
			Hero.playerHitPoints = Hero.playerHitPoints + Monster.playerHealthResetCounter;
			Monster.playerHealthResetCounter = 0;
			if (MonsterGenerator.bossFight == 1)
				{
				System.out.println("LEVEL UP!");
				Hero.levelOfPlayer++;
				System.out.println();
				Intros.delayOneSecond();
				System.out.println("You are now a Level " + Hero.levelOfPlayer + "!");
				Hero.playerHitPoints = Hero.playerHitPoints + (Hero.levelOfPlayer * 2);
				System.out.println();
				Intros.delayOneSecond();
				System.out.println("YOU HAVE FOUND A LORE SHARD!");
				System.out.println();
				Intros.delayOneSecond();
				MonsterGenerator.loreShardReveal();
				System.out.println();
				Intros.delayOneSecond();
				}
			}	
		return Monster.monsterHitPoints;
		}
	
	public static int askPlayerIfTheyWantToPlayAgain()//Asks the player if they want to play again or if they want to stop playing.
		{
		Hero.playerHitPoints = Hero.playerHitPoints + Monster.playerHealthResetCounter;
		Monster.playerHealthResetCounter = 0;
		System.out.println("Would you like to play again/continue " + Hero.nameOfPlayer + "?");
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("Or does " + Hero.homeLand + " need you?");
		System.out.println();
		System.out.println("Press 1 to play again/continue and press 2 to exit the game.");
		Scanner userInput1 = new Scanner(System.in);
		playAgainChoice = userInput1.nextInt();
		if (playAgainChoice == 2)
			{
			System.out.println("Farewell " + Hero.nameOfPlayer + " of " + Hero.homeLand + ".");
			System.out.println();
			Intros.delayOneSecond();
			if (numberOfSlainEnemies == 1)
				{
				pluralVariable = "1 deadly beast.  Better one than none.";
				}
			else if (numberOfSlainEnemies == 0)
				{
				pluralVariable = "no deadly beasts.  You are a failure.";
				}
			else 
				{
				pluralVariable = "" + numberOfSlainEnemies + " deadly beasts.";
				if(numberOfSlainEnemies < 10)
					{
					System.out.println();
					System.out.println("You are a Warrior of COMBAT.");
					System.out.println();
					}
				else if (numberOfSlainEnemies < 20)
					{
					System.out.println();
					System.out.println("You are a Hero of COMBAT.");
					System.out.println();
					}
				else if (numberOfSlainEnemies < 30)
					{
					System.out.println();
					System.out.println("You are a Legend of COMBAT.");
					System.out.println();
					}
				else if (numberOfSlainEnemies < 40)
					{
					System.out.println();
					System.out.println("You spend too much time on this game.");
					System.out.println();
					}
				}
			Intros.delayOneSecond();
			System.out.println("Let everyone know that you were a Level " + Hero.levelOfPlayer + " " + Hero.raceOfPlayer + " " + Hero.jobOfPlayer + " and you fought "
					+ "valiantly, defeating " + pluralVariable + "");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("Best of luck to you.");
			System.exit(0);
			}
		return playAgainChoice;
		}
	
	public static int resetDiceForRoll()
		{
		diceRollOne = 0;
		diceRollTwo = 0;
		diceRollThree = 0;
		totalDice = 0;
		return totalDice;
		}
	
	}
