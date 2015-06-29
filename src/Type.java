import java.util.ArrayList; 

public class Type{
	private String name; 
	protected float[] values; 
	private int value; //This value is for the type's value in the type chart
	//Values are for the ATTACKING type and its effectiveness against every defending type
	
	Type(String name, int value, float[] values){
		this.name = name;
		this.values = values; 
		this.value = value;
	}
	
	@Override 
	public String toString(){
		return name; 
	}
	
	@Override
	public boolean equals(Object other){
		if(other == null || this.getClass() != other.getClass())
			return false; 
		
		if(other.toString() != this.toString())
			return false; 
		return true; 
	}
	
}
