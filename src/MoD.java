
public enum MoD {
	
	ThunderBolt("Thunderbolt", "", TD.ELE, 90, 100, "Special");
	
	private Move move; 
	
	private MoD(String name, String description, TD type, int basePow, int accuracy, String damageType){
		this.move = new Move(name, description, type.getType(), basePow, accuracy, damageType); 
	}
	
	public Move getMove(){
		return move; 
	}
	
}
