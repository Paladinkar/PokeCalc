
public class Mechanics {
	
	
	
//	public void attack(/*Not sure what params yet*/){
			//DO STUFF
			//Print out result of attack, i.e. attack damage against opponent
		
			//parms will likely be, attacking pkmn, def pkmn, att/spATk, def/spDef, move
		//float STAB = determineSTAB() ****FILL in params later; 
		//float typeBonus = typeMechanics() ***Fill in params
	//	}
	
	//fix to not return a float once implementation is figured, also prompt user 
			//for move instead of using default
	private float attack(Move atk, Pokemon atkr, Pokemon def){
		 //need to add in logic for abilites that change the default behavior of type matchups
			//based of the attack, have to determine whether to use atk/def or spA/spD
		if(def.t2 == null)
			return (float)((((double)(2 * atkr.lv + 10)/250) * atk.basePow) * atk.type.values[def.t1.value] *  determineSTAB(atkr, atk)) ; 
		else
			return atk.type.values[def.t1.value] * atk.type.values[def.t2.value] * determineSTAB(atkr, atk) * atk.basePow;
		
	}
	
	private float determineSTAB(Pokemon attacker, Move atk){
		if(attacker.t1.toString().equals(atk.type.toString()) ||  attacker.t2.toString().equals(atk.type.toString()))
			return 1.5f;
		//NEED to add in a bit of logic about the ability Adaptability, this turns the bonus to 
			//to a 2x
		//NEED to add in logic for pokemon that have abilities such as normalize, that give them
			//STAB on moves that don't match their base type
		else
			return 1; 
	}
	
	
	public static void main(String[] args){
		Mechanics m = new Mechanics();
		//TypeData td = new TypeData(); 
		Move hydroPump = new Move("Hydro Pump", "Terns o' damage", TD.WTR.getType(), 120, 80, "Special");
		Pokemon blastoise = new Pokemon("Blastoise", TD.WTR.getType(), hydroPump);
		Pokemon golem = new Pokemon("Golem", TD.RCK.getType(), hydroPump); //lol, fix this
		//System.out.println(hydroPump.type);
		System.out.println(m.attack(hydroPump, blastoise, golem));
		
	}


	
	
}
