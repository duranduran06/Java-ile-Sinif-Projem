package kumanda;

import java.util.Date;
import java.util.Random;


public class Klima_Kumandası extends Kumanda {
	
	

	private String İD;
	private static int KlimaKumandaAdet=0;
	private int sıcaklık=10;
	Random rnd =new Random();
	private int tut=(5000000+rnd.nextInt(999999));
	
	
	public Klima_Kumandası(int tuşS,int pilS, Date üretimT,Pil piltürü,String Hangifirma)
	{
		this.İD="KL-"+tut;
		setTuş_sayısı(tuşS);
		setPil_sayısı(pilS);
		setÜretim_tarihi(üretimT);
		setPil_türü(piltürü);
		setHangi_Firma_İçin_Üretildi(Hangifirma);
		KlimaKumandaAdet++;
		
	}
	

	
	public String getİD() {
		System.out.println("Kumanda İD= "+İD);
		return İD;
	}	
	public void mevcut_sıcaklık()
	{
		if(getCihaz_durum()==true)
		{
		System.out.println("Mevcut Sıcaklık"+this.sıcaklık);
		}
		else
			System.out.println("Cihaz kapalı");
	}
	public void sıcaklık_Arttır()
	{
		if(getCihaz_durum()==true)
		{
		if(this.sıcaklık<43)
		{
		this.sıcaklık+=1;
		System.out.println("Sıcaklık artışı yapıldı= "+this.sıcaklık);
		}
		else
			System.out.println("Klima değerlerini aşıyor");
		}
		else
			System.out.println("Cihaz kapalı");
	}
	public void sıcaklık_Azalt()
	{
		if(getCihaz_durum()==true)
		{
		if(this.sıcaklık>10)
		{
		this.sıcaklık-=1;
		System.out.println("Sıcaklık azaltma yapıldı= "+this.sıcaklık);
		}
		else
			System.out.println("Klima değerlerini aşıyor");
		}
		else
			System.out.println("Cihaz kapalı");
	}
	public void istenilen_sıcaklık_git(int değer)
	{
		if(getCihaz_durum()==true)
		if(değer>=10 && değer<=43)
		{
		this.sıcaklık=değer;
		System.out.println("istenilen sıcaklığa gidildi= "+this.sıcaklık);
		}
		else
			System.out.println("Klima değerlerini aşıyor");
		else
			System.out.println("Cihaz kapalı");
	}
	
	@Override
	public String pil_bitiyor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cihaz_aç() {
	 if(getCihaz_durum()==false)
	 {
		 setCihaz_durum(true);
		 System.out.println("Klima açıldı");
	 }
	 else
		 System.out.println("Klima Zaten Açık");
		
	}

	@Override
	public void cihaz_kapat() {
	if(getCihaz_durum()==true)
	{
		setCihaz_durum(false);
		System.out.println("Klima kapatıldı");
	}
	else
		System.out.println("klima zaten kapalı");
		
	}



	public static int getKlimaKumandaAdet() {
		System.out.println("Üretilen klima kumanda sayısı "+KlimaKumandaAdet);
		return KlimaKumandaAdet;
	}

	


}
