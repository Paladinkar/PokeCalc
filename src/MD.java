
public enum MD {
	
	ThunderBolt("Thunderbolt", "", TD.ELE, 90, 100, "Special");
	
	Move move; 
	
	private MD(String name, String description, TD type, int basePow, int accuracy, String damageType){
		Move move = new Move(name, description, type.getType(), basePow, accuracy, damageType); 
		this.move = move;
	}
	
	public Move getMove(){
		return move; 
	}
	
}
