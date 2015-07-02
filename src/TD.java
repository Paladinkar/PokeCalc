
public enum TD {
	 NOR("Normal", 0, new float[]{1, 1, 1, 1, 1, 0.5f, 1, 0, 0.5f, 1, 1, 1, 1, 1, 1, 1, 1, 1}),
	 FTG("Fighting", 1, new float[]{2, 1, 0.5f, 0.5f, 1, 2, 0.5f, 0, 2, 1, 1, 1, 1, 0.5f, 2, 1, 2, 0.5f}),
	 FLY("Flying", 2, new float[]{1, 2, 1, 1, 1, 0.5f, 2, 1, 0.5f, 1, 1, 2, 0.5f, 1, 1, 1, 1, 1}),
	 POI("Poison", 3, new float[]{1, 1, 1, 0.5f, 0.5f, 0.5f, 1, 0.5f, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2}),
	 GRD("Ground", 4, new float[]{1, 1, 0, 2, 1, 2, 0.5f, 1, 2, 2, 1, 0.5f, 2, 1, 1, 1, 1, 1}),
	 RCK("Rock", 5, new float[]{1, 0.5f, 2, 1, 0.5f, 1, 2, 1, 0.5f, 2, 1, 1, 1, 1, 2, 1, 1, 1}), 
	 BUG("Bug", 6, new float[]{1, 0.5f, 0.5f, 0.5f, 1, 1, 1, 0.5f, 0.5f, 0.5f, 1, 2, 1, 2, 1, 1, 2, 0.5f}), 
	 GHO("Ghost", 7, new float[]{0, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5f, 1}),
	 STL("Steel", 8, new float[]{1, 1, 1, 1, 1, 2, 1, 1, 0.5f, 0.5f, 0.5f, 1, 0.5f, 1, 2, 1, 1, 2}),
	 FIR("Fire", 9, new float[]{1, 1, 1, 1, 1, 0.5f, 2, 1, 2, 0.5f, 0.5f, 2, 1, 1, 2, 0.5f, 1, 1,}), 
	 WTR("Water", 10, new float[]{1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0.5f, 0.5f, 1, 1, 1, 0.5f, 1, 1}),
	 GRS("Grass", 11, new float[]{1, 1, 0.5f, 0.5f, 2, 2, 0.5f, 1, 0.5f, 0.f, 2, 0.5f, 1, 1, 1, 0.5f, 1, 1}),
	 ELE("Electric", 12, new float[]{1, 1, 2, 1, 0, 1, 1, 1, 1, 1, 2, 0.5f, 0.5f, 1, 1, 0.5f, 1, 1}), 
	 PSY("Psychic", 13, new float[]{1, 2, 1, 2, 1, 1, 1, 1, 0.5f, 1, 1, 1, 1, 0.5f, 1, 1, 0, 1,}), 
	 ICE("Ice", 14, new float[]{1, 1, 2, 1, 2, 1, 1, 1, 0.5f, 0.5f, 0.5f, 2, 1, 1, 0.5f, 2, 1, 1,}),
	 DRA("Dragon", 15, new float[]{1, 1, 1, 1, 1, 1, 1, 1, 0.5f, 1, 1, 1, 1, 1, 1, 2, 1, 0}),  
	 DRK("Dark", 16, new float[]{1, 0.5f, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 0.5f, 0.5f}), 
	 FAI("Fairy", 17, new float[]{1, 2, 1, 0.5f, 1, 1, 1, 1, 0.5f, 0.5f, 1, 1, 1, 1, 1, 2, 2, 1}); 
	
	private Type type; 
	
	private TD(String name, int value, float[] values){
		this.type = new Type(name, value, values);
	}
	
	public Type getType(){
		return type;
	}
	
	
	public static void main(String[] args){	
		//print the values of the enum
		for (int i = 0; i < TD.values().length; i++){
			Type current = TD.values()[i].getType(); 
			System.out.println(current.values.length + " " + i + " should be: " + current.value);
		}
	}
}
