package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("KAJ", 4, 2, );
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("This is Kareem. I'm so sorry." + firstMonster);
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