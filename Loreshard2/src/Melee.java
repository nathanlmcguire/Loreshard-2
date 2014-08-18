import java.util.Random;
import java.util.Scanner;


public class Melee 
	{
	static int attackChoice, attackAffect, responseNumber, playerAttackID, enemyAttackID;
	
	public static int meleeChoice()
		{
		System.out.println("You may strike high, medium, or low.");
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("Type 1 for high, 2 for medium, 3 for low.");
		System.out.println();
		Intros.delayOneSecond();
		Scanner userInput1 = new Scanner(System.in);        
	    attackChoice = userInput1.nextInt();
		switch(attackChoice)
			{
			case 1:
				{
				System.out.println("You strike high with your " + Hero.weaponName + "!");
				System.out.println();
				Intros.delayOneSecond();
				playerAttackID = 3;
				}
			case 2:
				{
				System.out.println("You strike medium with your " + Hero.weaponName + "!");
				System.out.println();
				Intros.delayOneSecond();
				playerAttackID = 2;
				}
			case 3:
				{
				System.out.println("You strike low with your " + Hero.weaponName + "!");
				System.out.println();
				Intros.delayOneSecond();
				playerAttackID = 1;
				}
			}
		return attackChoice;
		}
	
	public static int randomResponseGenerator()
		{
		Random randomNumber = new Random();
		responseNumber = 1 + randomNumber.nextInt(3);
		return responseNumber;
		}
	
	public static int monsterParryResponse()
		{
		if (responseNumber == 3)
			{
			System.out.println("The " + MonsterGenerator.monsterName + " blocked high.");
			System.out.println();
			Intros.delayOneSecond();
			}
			if (responseNumber == playerAttackID)
				{
				attackAffect = -1;
				}
			else
			{
			attackAffect = attackAffect + 1;
			}
			
		else if (responseNumber == 2)
			{
			System.out.println("The " + MonsterGenerator.monsterName + " blocked mid.");
			System.out.println();
			Intros.delayOneSecond();
			if (responseNumber == playerAttackID)
				{
				attackAffect = -1;
				}
			else
				{
				attackAffect = attackAffect + 1;
				}
			}
		
		else if (responseNumber == 1)
			{
			System.out.println("The " + MonsterGenerator.monsterName + " blocked low.");
			System.out.println();
			Intros.delayOneSecond();
			if (responseNumber == playerAttackID)
				{
				attackAffect = -1;
				}
			else
				{
				attackAffect = attackAffect + 1;
				}
			}
		return attackAffect;
		}
	}
