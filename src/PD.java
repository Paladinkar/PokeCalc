
public enum PD {
	
	///FIRST 150
	 Pika("Pikachu", TD.ELE, MD.ThunderBolt); 
	
	Pokemon poke; 
	
	private PD(String name, TD type, MD m1){
		Pokemon poke = new Pokemon(name, type.getType(), m1.getMove());
		this.poke = poke; 
	}
	
	public Pokemon getPoke(){
		return poke;
	}
	
	
	
	
	public static void main(String[] args){
		System.out.println(PD.Pika.getPoke().t1);
	}
	
}
