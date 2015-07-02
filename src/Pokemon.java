
public class Pokemon {
	
	String name; 
	String info;
	Type t1; 
	Type t2;
	Ability[] abilites; 
	int[] ivs; 
	int[] evs; 
	Nature n; 
	int lv;  
	double weight; 
	int idNum; 
	
	//we need a way to handle bonus's (as in increase atk 
	
	//Base Stats
	Stat HP; 
	Stat Atk; 
	Stat Def;
	Stat SpAtk; 
	Stat SpDef;
	Stat Spd; 
	
	//Moves
	Move m1;
	Move m2;
	Move m3;
	Move m4;
	
	//flesh this out as we go along (t2, info, ability, iv/ev/, nature, lv, weight,
		//stats, and the rest of the moves); 
	
	//1 type
	Pokemon(String name, Type t1, int idNum){	
		this.name = name; 
		this.t1 = t1; 
		this.idNum = idNum; 
	}

	public Pokemon(String name, Type t1, Move m1){
		this.name = name; 
		this.t1 = t1; 
		this.m1 = m1; 
	}
	
	//2 types
	Pokemon(String name, Type t1, Type t2, int idNum){	
		this.name = name; 
		this.t1 = t1; 
		this.t2 = t2; 
		this.idNum = idNum; 
	}
	
	public Pokemon(String name, Type t1, Type t2, Move m1){
		this.name = name; 
		this.t1 = t1; 
		this.t2 = t2; 
		this.m1 = m1; 
	}
	
	//This method will be used when a move changes a pokemon's type 
	public void changeType(Pokemon p, Type newType){
		if(p.t2 != null){
			p.t2 = null; 
		}
		
		p.t1 = newType; 
	}

}
