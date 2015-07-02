
public enum PD {
	
	///FIRST 150
	 Pika("Pikachu", TD.ELE, MoD.ThunderBolt); 
	
	private Pokemon poke; 
	
	private PD(String name, TD type, MoD m1){
		this.poke = new Pokemon(name, type.getType(), m1.getMove());
	}
	
	public Pokemon getPoke(){
		return poke;
	}
	
	public static void main(String[] args){
		System.out.println(PD.Pika.getPoke().t1);
	}
	
}
