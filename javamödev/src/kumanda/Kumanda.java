package kumanda;

import java.util.Date;




public abstract class Kumanda {
	
	
	private final String firma_ismi="KGF";
	private int tuþ_sayýsý;
	private int pil_sayýsý;
	private Date üretim_tarihi;
	private boolean cihaz_durum=false;
	private String Hangi_Firma_Ýçin_Üretildi;
	private Pil pil_türü;
	
	
	public String getHangi_Firma_Ýçin_Üretildi() {
		System.out.println("Üretilen firma ismi= "+Hangi_Firma_Ýçin_Üretildi);
		return Hangi_Firma_Ýçin_Üretildi;
	}

	public void setHangi_Firma_Ýçin_Üretildi(String hangi_Firma_Ýçin_Üretildi) {
		if(this.Hangi_Firma_Ýçin_Üretildi!=null)
		{
			System.out.println("HATA ÜRETÝLEN FÝRMA BÝLGÝLERÝ DEÐÝÞTÝRÝLEMEZ");
		}
		else
		Hangi_Firma_Ýçin_Üretildi = hangi_Firma_Ýçin_Üretildi;
	}
	public int getTuþ_sayýsý() {
		System.out.println("Kumanda tuþ sayýsý= "+tuþ_sayýsý);
		return tuþ_sayýsý;
	}
	public void setTuþ_sayýsý(int tuþ_sayýsý) {
		this.tuþ_sayýsý = tuþ_sayýsý;
	}
	public int getPil_sayýsý() {
		System.out.println("Kumanda pil sayýsý= "+pil_sayýsý);
		return pil_sayýsý;
		
	}
	public void setPil_sayýsý(int pil_sayýsý) {
		this.pil_sayýsý = pil_sayýsý;
	}

	public Date getÜretim_tarihi() {
		System.out.println(üretim_tarihi);
		return üretim_tarihi;
	}
	public void setÜretim_tarihi(Date üretim_tarihi) {
		this.üretim_tarihi = üretim_tarihi;
	}
	public boolean getCihaz_durum() {
		
		return cihaz_durum;
	}
	public void setCihaz_durum(boolean cihaz_durum) {
		this.cihaz_durum = cihaz_durum;
	}
	public Pil getPil_türü() {
		return pil_türü;
	}
	public void setPil_türü(Pil pil_türü) {
		this.pil_türü = pil_türü;
	}
	public String getFirma_ismi() {
		System.out.println("Üreten firma= "+firma_ismi);
		return firma_ismi;
	} 
	

	public abstract String pil_bitiyor();
	public abstract void cihaz_aç();
	public abstract void cihaz_kapat();
	
}

