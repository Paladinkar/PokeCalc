
public enum AbD {
		
		Example("hasty", "+spd, -def"); 
		Ability ability; 
		
		private AbD(String name, String description){
			this.ability = new Ability(name, description); 
		}
}
