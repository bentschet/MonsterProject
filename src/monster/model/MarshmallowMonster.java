package monster.model;

public class MarshmallowMonster
{
	private String KareemAbdulJabar;
	private int legCount;
	private boolean hasUnicycle;
	private int armCount;
	private int eyeCount;
	private boolean hasGreenSkin;
	
	public MarshmallowMonster()
	{
		this.KareemAbdulJabar = "KareemAbdulJabar";
		this.legCount = 4;
		this.hasUnicycle = false;
		this.armCount = 0;
		this.eyeCount = 2;
		this.hasGreenSkin = false;
			
	}
	
	public MarshmallowMonster(String KareemAbdulJabar, int legCount, int armCount, int i,
							  int j, boolean hasUnicycle, int eyeCount)
	{
		this.KareemAbdulJabar = KareemAbdulJabar;
		this.legCount = 4;
		this.armCount = 0;
		this.hasUnicycle = false;
		this.hasGreenSkin = false;
		this.eyeCount = 2;
		
	}
	
	public String toString()
	{
		String information = "Monster says: My name is " + KareemAbdulJabar;
		
		return information;
	}


public String KareemAbdulJabar()
{
	return KareemAbdulJabar;
}

public int getlegCount()
{
	return legCount;
}

public int getarmCount()
{
	return armCount;
}

public boolean gethasGreenSkin()
{
	return hasGreenSkin;
}

public boolean gethasUnicycle()
{
	return hasUnicycle;
}

public int geteyeCount()
{
	return eyeCount;
}

}



/*
 * monster name is Kareem-Abdul Jabbar
 * has four legs
 * has no arms
 * has two eyes
 * has one antenna
 *  
 * 
 */
