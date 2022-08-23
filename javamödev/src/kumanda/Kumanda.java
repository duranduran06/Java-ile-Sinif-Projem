package kumanda;

import java.util.Date;




public abstract class Kumanda {
	
	
	private final String firma_ismi="KGF";
	private int tu�_say�s�;
	private int pil_say�s�;
	private Date �retim_tarihi;
	private boolean cihaz_durum=false;
	private String Hangi_Firma_��in_�retildi;
	private Pil pil_t�r�;
	
	
	public String getHangi_Firma_��in_�retildi() {
		System.out.println("�retilen firma ismi= "+Hangi_Firma_��in_�retildi);
		return Hangi_Firma_��in_�retildi;
	}

	public void setHangi_Firma_��in_�retildi(String hangi_Firma_��in_�retildi) {
		if(this.Hangi_Firma_��in_�retildi!=null)
		{
			System.out.println("HATA �RET�LEN F�RMA B�LG�LER� DE���T�R�LEMEZ");
		}
		else
		Hangi_Firma_��in_�retildi = hangi_Firma_��in_�retildi;
	}
	public int getTu�_say�s�() {
		System.out.println("Kumanda tu� say�s�= "+tu�_say�s�);
		return tu�_say�s�;
	}
	public void setTu�_say�s�(int tu�_say�s�) {
		this.tu�_say�s� = tu�_say�s�;
	}
	public int getPil_say�s�() {
		System.out.println("Kumanda pil say�s�= "+pil_say�s�);
		return pil_say�s�;
		
	}
	public void setPil_say�s�(int pil_say�s�) {
		this.pil_say�s� = pil_say�s�;
	}

	public Date get�retim_tarihi() {
		System.out.println(�retim_tarihi);
		return �retim_tarihi;
	}
	public void set�retim_tarihi(Date �retim_tarihi) {
		this.�retim_tarihi = �retim_tarihi;
	}
	public boolean getCihaz_durum() {
		
		return cihaz_durum;
	}
	public void setCihaz_durum(boolean cihaz_durum) {
		this.cihaz_durum = cihaz_durum;
	}
	public Pil getPil_t�r�() {
		return pil_t�r�;
	}
	public void setPil_t�r�(Pil pil_t�r�) {
		this.pil_t�r� = pil_t�r�;
	}
	public String getFirma_ismi() {
		System.out.println("�reten firma= "+firma_ismi);
		return firma_ismi;
	} 
	

	public abstract String pil_bitiyor();
	public abstract void cihaz_a�();
	public abstract void cihaz_kapat();
	
}

