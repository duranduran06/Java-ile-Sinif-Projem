package kumanda;

public class Pil  {
	private String PilT�r�;
	private int PilVoltaj�;
	
	
	public Pil(String pilT,int Pilv)
	{
		this.PilT�r�=pilT;
		this.PilVoltaj�=Pilv;
		
	}
	
	public String getPilT�r�() {
		System.out.println("Pilin t�r�= "+this.PilT�r�);
		return PilT�r�;
	}
	public void setPilT�r�(String pilT�r�) {
		PilT�r� = pilT�r�;
	}
	public int getPilVoltaj�() {
		System.out.println("Pilin voltaj�= "+this.PilVoltaj�);
		return PilVoltaj�;
	}
	public void setPilVoltaj�(int pilVoltaj�) {
		PilVoltaj� = pilVoltaj�;
	}
	

}
