
public class Move {
	
	String name;
	String description; 
	public Type type; 
	int basePow; 
	int accuracy; 
	String damageType; //This might need to be a class...we shall see, or maybe
		// it can be integrated into teh atk or spAtk stat
	
	//There needs to be some way to indicate effects; 

	public Move(String name, String description, Type type, int basePow, int accuracy, String damageType){
		this.name = name; 
		this.description = description; 
		this.type = type; 
		this.basePow = basePow;
		this.damageType = damageType; 
		this.accuracy = accuracy; 
	}
	

}
