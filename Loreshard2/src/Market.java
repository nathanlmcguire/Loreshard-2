import java.util.Scanner;


public class Market 
	{
	static int itemChoice;
	
	public static int sellOrBuy()
		{
		System.out.println("As you walk along the dirt path, you see a tired old man sittiong on the side of the road.");	
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("He has a massive cart next to him piled high with items.");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("'Hello Sir,' he says.  'Need anything?  I have a [1]Steel Sword for 10 gold, [2]Steel Armor for 20 gold, and [3]Two Health Potions for 15.'");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("'But I see you are a traveler, and I have a soft spot for travelers. So you can take the [4]Special Deal: one random item from my cart!  For only 30 gold!'");
		System.out.println();
		Intros.delayThreeSeconds();
		System.out.println("'What would you like?'(type in the number of the item you want or 0 to leave)");
		System.out.println("Your GP: " + Loot.goldOfPlayer + "");
		Scanner userInput1 = new Scanner(System.in);
		itemChoice = userInput1.nextInt();
		if(Loot.goldOfPlayer > 30)
			{
			if(itemChoice == 1)
				{
				System.out.println("'Here you go, one Steel Sword!  Now, I msut be off!'");
				System.out.println();
				Intros.delayOneSecond();
				Loot.goldOfPlayer = Loot.goldOfPlayer - 10;
				Hero.weaponName = "Steel " + Hero.weaponName + "";
				Loot.weaponBonus = 4;
				System.out.println("You now do 4 more damage with your " + Hero.weaponName + "!");
				System.out.println();
				Intros.delayOneSecond();
				Inventory.showInventory();
				Intros.delayThreeSeconds();
				}
			else if(itemChoice == 2)
				{
				System.out.println("'Here you go, one set of Steel Armor!  Now, I must be off!'");
				System.out.println();
				Intros.delayOneSecond();
				Loot.goldOfPlayer = Loot.goldOfPlayer - 20;
				Loot.armorName = "Steel Armor";
				Loot.armorBonus = 4;
				System.out.println("Your max HP has now been increased by 4.");
				System.out.println();
				Intros.delayOneSecond();
				Inventory.showInventory();
				Intros.delayThreeSeconds();
				}
			else if(itemChoice == 3)
				{
				System.out.println("'There you go, 2 Healin Potions!  Now I must be off!'");
				System.out.println();
				Intros.delayOneSecond();
				Loot.goldOfPlayer = Loot.goldOfPlayer - 15;
				Hero.numberOfPotions = Hero.numberOfPotions + 2;
				System.out.println("You have " + Hero.numberOfPotions + " healing potions now.");
				System.out.println();
				Intros.delayOneSecond();
				Inventory.showInventory();
				Intros.delayThreeSeconds();
				}
			else if(itemChoice == 4)
				{
				System.out.println("'There you go, now I must be off!'  He throws a bag of loot to you.");
				System.out.println();
				Intros.delayOneSecond();
				Loot.goldOfPlayer = Loot.goldOfPlayer - 30;
				Loot.lootBeast();
				Intros.delayThreeSeconds();
				Inventory.showInventory();
				Intros.delayThreeSeconds();
				}
			else if(itemChoice == 0)
				{
				System.out.println("'Maybe another time then.'  You continue on your quest to the Vale.");
				System.out.println();
				Intros.delayOneSecond();
				}
			}
		else if(Loot.goldOfPlayer < 30)
			{
			System.out.println("'Oh, you don't have the money for this kind of trade.  You need at least 30 gold to shop here.'");
			System.out.println();
			Intros.delayOneSecond();
			System.out.println("'Maybe another time then.'  You continue on your quest to the Vale.");
			System.out.println();
			Intros.delayOneSecond();
			}
		return itemChoice;
		}	
	}
