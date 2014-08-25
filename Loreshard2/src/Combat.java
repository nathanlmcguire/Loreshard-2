import java.awt.Graphics;

public class Combat 
	{
	
	public static void main(String[] args) 
		{
		//Intros.startGameIntro();
		Hero.askName();
		Hero.generateCharacter();
		Hero.generatePlayerHitPoints();
		HealthBar.createHealthBar();
		MonsterGenerator.areaChange();
		while (Fight.playAgainChoice == 1)
			{
			Fight.chooseAction();
			Fight.simulateCombat();
			MonsterGenerator.areaChange();
			}
		}		
	}