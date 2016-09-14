package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("KAJ", 4, 2, 1, 1, true, 0);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("This is Kareem. I'm so sorry. " + firstMonster);
		System.out.println("Kareem has this many legs: " + firstMonster.getlegCount());
		System.out.println("Kareem has no arms. This is proof: " + firstMonster.getarmCount());
		System.out.println("Kareem's skin is not green: " + firstMonster.gethasGreenSkin());
		System.out.println("Kareem has this many eyes: " + firstMonster.geteyeCount()) ;
	}
}

/*
 * monster name is Kareem-Abdul Jabbar
 * has four legs
 * has no arms
 * has two eyes
 * has one antenna
 *  
 */