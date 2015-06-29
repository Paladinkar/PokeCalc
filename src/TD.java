
public class TD {
	
	public static Type NOR = new Type("Normal", 0, new float[]{1, 1, 1, 1, 1, 0.5f, 1, 0, 0.5f, 1, 1, 1, 1, 1, 1, 1, 1, 1});
	public static Type FTG; 
	public static Type FLY = new Type("Flying", 2, new float[]{1, 2, 1, 1, 1, 0.5f, 2, 1, 0.5f, 1, 1, 2, 0.5f, 1, 1, 1, 1, 1});
	public static Type POI = new Type("Poison", 3, new float[]{1, 1, 1, 0.5f, 0.5f, 0.5f, 1, 0.5f, 0, 1, 1, 2, 1, 1, 1, 1, 1, 2}); 
	public static Type GRD = new Type("Ground", 4, new float[]{1, 1, 0, 2, 1, 2, 0.5f, 1, 2, 2, 1, 0.5f, 2, 1, 1, 1, 1, 1});
	public static Type RCK = new Type("Rock", 5, new float[]{1, 0.5f, 2, 1, 0.5f, 1, 2, 1, 0.5f, 2, 1, 1, 1, 1, 2, 1, 1, 1}); 
	public static Type BUG; 
	public static Type GHO;
	public static Type STL;
	public static Type FIR;
	public static Type GRS;
	public static Type ELE;
	public static Type PSY ;
	public static Type ICE;
	public static Type DRA;
	public static Type DRK;
	public static Type FAI ; 
	
	
	
	public static Type WTR = new Type("Water", 10, new float[]{1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 0.5f, 0.5f, 1, 1, 1, 0.5f, 1, 1});
	
	
	
	//this stuff is just for debugging
	private boolean check18(Type t){
		return t.values.length == 18; 
	}
	
	public static void main(String[] args)
	{	
		TD td = new TD(); 
		System.out.println(td.check18(NOR) && td.check18(FLY) && td.check18(FTG) && td.check18(POI));
		//System.out.println(check18(GRD) && check18(RCK) && check18(WTR)); 
	}
}
