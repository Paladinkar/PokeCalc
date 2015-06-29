
public class Stat {
	float multiplyer = 1.0f; 
	int base; 
	
	public void changeMult(){
		//put in logic, this can either parse a sting to determine sharply 	
		//or hashly or whatever, or it can just be fed an integer value (prolly better) 
		//this will in turn determine the multiplyer
	}
	
	public double finalStat(){
		return base * multiplyer; 
	}
	
	public Stat(int base){
		this.base = base; 
	}
	
	
	//might need to make this work with an int array for all stats
	public int evConversion(int ev){
			return ev/4; 
	}
	
}
