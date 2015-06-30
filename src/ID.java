
public enum ID {
		
		Leftovers("Leftovers", "Returns 1/16 of maximum HP at the end of each turn held"); 
	
		Item item; 
		
		private ID(String name, String description){
			this.item = new Item(name, description); 
		}
}
