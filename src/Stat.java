
public class Stat {
	double multiplyer = 2/2; 
	int base; 
	int value = 0;  
	double evs; 
	int iv; 
	
	
	public void setValue(int value){
		this.value += value; 
	}
	
	public void setMult(float value){
			if(value > 0){
				multiplyer = (value + 2)/2; 
			}
			
			if(value < 0){
				multiplyer = 2/(Math.abs(value) + 2); 
			}
			
			else multiplyer = 2/2; 
	}
	
	public double finalStat(){
		return (base + iv + evs/4) * multiplyer; 
	}
	
	public Stat(int base){
		this.base = base; 
	}

}
