package kumanda;

public class Pil  {
	private String PilTürü;
	private int PilVoltajý;
	
	
	public Pil(String pilT,int Pilv)
	{
		this.PilTürü=pilT;
		this.PilVoltajý=Pilv;
		
	}
	
	public String getPilTürü() {
		System.out.println("Pilin türü= "+this.PilTürü);
		return PilTürü;
	}
	public void setPilTürü(String pilTürü) {
		PilTürü = pilTürü;
	}
	public int getPilVoltajý() {
		System.out.println("Pilin voltajý= "+this.PilVoltajý);
		return PilVoltajý;
	}
	public void setPilVoltajý(int pilVoltajý) {
		PilVoltajý = pilVoltajý;
	}
	

}
