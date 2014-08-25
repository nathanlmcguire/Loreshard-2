import java.util.Scanner;


public class LevelUp 
	{
	static int endurance = 0, strength = 0, magic = 0, charisma = 0, agility = 0, skillChoice;
	
	public static int levelUp()
		{
		System.out.println("LEVEL UP!");
		Hero.levelOfPlayer++;
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("You are now a Level " + Hero.levelOfPlayer + "!");
		System.out.println();
		Intros.delayOneSecond();
		System.out.println("[1]Endurance: " + endurance + "");
		System.out.println("[2]Strength: " + strength + "");
		System.out.println("[3]Magic: " + magic + "");
		System.out.println("[4]Charisma: " + charisma + "");
		System.out.println("[5]Agility: " + agility + "");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("Type in the number of the skill you want to increase in.");
		Scanner userInput1 = new Scanner(System.in);        
	    skillChoice = userInput1.nextInt();
	    switch(skillChoice)
	    	{
	    	case 1:
	    		{
	    		endurance = endurance + 1;
	    		System.out.println("Over the past weeks you have become hardier.");
	    		Intros.delayThreeSeconds();
	    		System.out.println();	    		
	    		}
	    	case 2:
	    		{
	    		strength = strength + 1;
	    		System.out.println("Over the past weeks your attacks have become more precise.");
	    		Intros.delayThreeSeconds();
	    		System.out.println();
	    		}
	    	case 3:
	    		{
	    		magic = magic + 1;
	    		System.out.println("Over the past weeks your magic has grown in strength.");
	    		Intros.delayThreeSeconds();
	    		System.out.println();
	    		}
	    	case 4:
	    		{
	    		charisma = charisma + 1;
	    		System.out.println("Over the past weeks you have become more fluent in the language of persuasion.");
	    		Intros.delayThreeSeconds();
	    		System.out.println();
	    		}
	    	case 5:
	    		{
	    		agility = agility + 1;
	    		System.out.println("Over the past weeks you have become lighter and quicker on your feet.");
	    		Intros.delayThreeSeconds();
	    		System.out.println();
	    		}
	    	default:
	    		{
	    		System.out.println("YOU FOOL! THAT IS NOT A SKILL NUMBER!!!! NO SKILLPOINT FOR YOU!!!!!!");
	    		}
	    	}
	    Hero.playerHitPoints = Hero.playerHitPoints + (Hero.levelOfPlayer * 2) + (LevelUp.endurance * 2);	
	    Hero.playerStamina = Hero.playerStamina + (Hero.levelOfPlayer * 2) + (LevelUp.endurance * 2);
		return skillChoice;
		}
	}
