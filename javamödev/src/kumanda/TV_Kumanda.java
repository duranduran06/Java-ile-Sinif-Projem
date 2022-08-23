package kumanda;

import java.util.Date;
import java.util.Random;

public class TV_Kumanda extends Kumanda{
	
	private String ÝD;
	private static int Tvkumandaadet=0;
	private int ses;
	private int kanal;
	
	Random rnd =new Random();
	private int tut=(6000000+rnd.nextInt(999999));
	
	public TV_Kumanda(int ses,int kanal ,int tuþS,int pilS, Date üretimT,Pil piltürü,String Hangifirma)
	{
		this.ÝD="TV-"+tut;
		setSes(ses);
		setKanal(kanal);
		setTuþ_sayýsý(tuþS);
		setPil_sayýsý(pilS);
		setÜretim_tarihi(üretimT);
		setPil_türü(piltürü);
		setHangi_Firma_Ýçin_Üretildi(Hangifirma);
		Tvkumandaadet++;
		
		
	}
	
	public void setSes(int ses) {
		if(ses>=0 && ses<=30)
		{this.ses = ses;}
		else
		{System.out.println("Lütfen ses deðerini 0 ile 30 arasý atama yapýnýz ");}
	}
	public void setKanal(int kanal) {
		if(kanal>=1 && kanal<=500)
		{this.kanal = kanal;}
		else
		{System.out.println("Lütfen kanal deðerini 1 ile 500 arasý atama yapýnýz");}
	}
	








	public String getÝD() {
		System.out.println("Kumanda ÝD= "+ÝD);
		return ÝD;
	}

	public static int getTvkumandaadet() {
		System.out.println("Üretilen TV kumanda sayýsý "+Tvkumandaadet);
		return Tvkumandaadet;
	}

	

	@Override
	public void cihaz_aç() {
		if(getCihaz_durum()==false)
		 {
			 setCihaz_durum(true);
			 System.out.println("Tv  açýldý");
		 }
		 else
			 System.out.println("Tv zaten Açýk");
		
	}

	@Override
	public void cihaz_kapat() {
		if(getCihaz_durum()==true)
		{
			setCihaz_durum(false);
			System.out.println("TV kapatýldý");
		}
		else
			System.out.println("TV zaten kapalý");
		
	}

	@Override
	public String pil_bitiyor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void sesi_arttýr()
	{
		if(getCihaz_durum()==true)
		{
				if(this.ses<30)
				{
					this.ses+=1;
				System.out.println("Ses artýþý yapýldý= "+this.ses);
				}
		else
			System.out.println("Ses maksimum seviyede");
		}
		else
			System.out.println("Cihaz kapalý");
		
	}
	public void sesi_azalt()
	{
		if(getCihaz_durum()==true)
		{
				if(this.ses>0)
				{
					this.ses-=1;
				System.out.println("Ses azaltma yapýldý= "+this.ses);
				}
		else
			System.out.println("Ses en düþük deðerde");
		}
		else
			System.out.println("Cihaz kapalý");
	}
	public void kanal_ileri()
	{
		if(getCihaz_durum()==true)
		{
			if(this.kanal>=500)
			{
				this.kanal=1;
				System.out.println("Kanal ileri yapýldý...KANAL BAÞA DÖNDÜ= "+this.kanal);
			}
			else {
				if(this.kanal<500)
				{
					this.kanal+=1;
				System.out.println("Kanal ileri yapýldý= "+this.kanal);
				}
			}
		
		}
		else
			System.out.println("Cihaz kapalý");
		
	}
	public void kanal_geri()
	{
		if(getCihaz_durum()==true)
		{
			if(this.kanal<=1)
			{
				this.kanal=500;
				System.out.println("Kanal geri yapýldý...KANAL SONA DÖNDÜ= "+this.kanal);
			}
			else {
				if(this.kanal>1)
				{
					this.kanal-=1;
				System.out.println("Kanal geri yapýldý= "+this.kanal);
				}
			}
		
		}
		else
			System.out.println("Cihaz kapalý");
		
	}

	public void istenilen_kanal_git(int num)
	{
		if(getCihaz_durum()==true)
			if(num>=0 && num<=500)
			{
			this.kanal=num;
			System.out.println("istenilen kanala gidildi= "+this.kanal);
			}
			else
				System.out.println("TV deðerlerini aþýyor");
			else
				System.out.println("Cihaz kapalý");
	}


	
	
	

}
