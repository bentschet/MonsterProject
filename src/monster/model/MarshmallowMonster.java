package monster.model;

public class MarshmallowMonster
{
	private String frogman;
	private int legCount;
	private boolean hasUnicycle;
	private int armCount;
	private int eyeCount;
	private boolean hasGreenSkin;
	
	public MarshmallowMonster()
	{
		this.frogman = "frogman";
		this.legCount = 2;
		this.hasUnicycle = false;
		this.armCount = 2;
		this.eyeCount = 2;
		this.hasGreenSkin = false;
			
	}
	
	public MarshmallowMonster(String frogman, int legCount, int armCount, boolean hasUnicycle,
							  boolean hasGreenSkin, int eyeCount)
	{
		this.frogman = frogman;
		this.legCount = 2;
		this.armCount = 2;
		this.hasUnicycle = false;
		this.hasGreenSkin = true;
		this.eyeCount = 2;
		
	}
}
