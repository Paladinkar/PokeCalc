
public enum TD {
	
	 NOR("Normal", 0, new float[]{1, 1, 1, 1, 1, 0.5f, 1, 0, 0.5f, 1, 1, 1, 1, 1, 1, 1, 1, 1}),
	 
	 FLY("Flying", 2, new float[]{1, 2, 1, 1, 1, 0.5f, 2, 1, 0.5f, 1, 1, 2, 0.5f, 1, 1, 1, 1, 1}),
	 POI("Poison", 3, new float[]{1, 1, 1, 0.5f, 0.5f, 0.5f, 1, 0.5f, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2}),
	  GRD("Ground", 4, new float[]{1, 1, 0, 2, 1, 2, 0.5f, 1, 2, 2, 1, 0.5f, 2, 1, 1, 1, 1, 1}),
	  RCK("Rock", 5, new float[]{1, 0.5f, 2, 1, 0.5f, 1, 2, 1, 0.5f, 2, 1, 1, 1, 1, 2, 1, 1, 1}), 
	  
	 
	  WTR("Water", 10, new float[]{1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0.5f, 0.5f, 1, 1, 1, 0.5f, 1, 1}),
	 //ELE should be farther down
	 ELE("Electric", 11, new float[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
	 
	 
	 
	 
	 /* 
	  FTG; this should be # 2  
	  
	  BUG; 
	  GHO;
	  STL;
	 FIR;
	 GRS;
	  
	 PSY ;
	 ICE;
	 DRA;
	 DRK;
	 FAI ; 
	
	*/
	
	
	
	private Type type; 
	private TD(String name, int value, float[] values){
		Type type = new Type(name, value, values);
		this.type = type; 
	}
	
	public Type getType(){
		return type;
	}
	
	
	
	public static void main(String[] args)
	{	
		//print the values of the enum
		for (int i = 0; i < TD.values().length; i++)
		{
			System.out.println(TD.values()[i].toString());
		}
	}
}
