import java.util.Random;


public class Monster 
	{
	static int monsterHitPoints, playerHealthResetCounter = 0;
		
	public static int monsterAttackRoll()//Rolls dice for the damage done by the monster's claws.
		{
		System.out.println();
		System.out.println("The " + MonsterGenerator.monsterName + MonsterGenerator.
				monsterAttackName + "!");
		System.out.println();
		Intros.delayOneSecond();
		Fight.resetDiceForRoll();
		Random randomNumber = new Random();
		Fight.diceRollOne = 1 + randomNumber.nextInt(Hero.difficultyDamage + MonsterGenerator.monsterDamage);
		Fight.diceRollTwo = 1 + randomNumber.nextInt(Hero.difficultyDamage + MonsterGenerator.monsterDamage);
		Fight.diceRollThree = 1 + randomNumber.nextInt(Hero.difficultyDamage + MonsterGenerator.monsterDamage);
		Fight.totalDice = Fight.diceRollOne + Fight.diceRollTwo + Fight.diceRollThree + (Hero.levelOfPlayer * 5);
		for (Fight.dodgeAffect = Fight.dodgeAffect; Fight.dodgeAffect > Fight.totalDice; Fight.dodgeAffect++)
			{
			
			}
		Fight.totalDice = Fight.totalDice - Fight.dodgeAffect;	
		System.out.println("The " + MonsterGenerator.monsterName + " does " + Fight.totalDice + " damage!");
		System.out.println();
		Intros.delayOneSecond();
		Hero.playerHitPoints = (Hero.playerHitPoints - Fight.totalDice);
		playerHealthResetCounter = playerHealthResetCounter + Fight.totalDice;
		return Fight.totalDice;
		}	
	
	public static int generateMonsterHitPoints()//Generates the player's hit points and tell you what they are.
		{
		Random randomNumber = new Random(); 
		monsterHitPoints = (5 * Hero.levelOfPlayer + 10) + randomNumber.nextInt(Hero.difficultyHealth + MonsterGenerator.monsterHealth);
		return monsterHitPoints;
		}
	}
