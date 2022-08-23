package kumanda;

import java.util.Date;
import java.util.Random;

public class TV_Kumanda extends Kumanda{
	
	private String �D;
	private static int Tvkumandaadet=0;
	private int ses;
	private int kanal;
	
	Random rnd =new Random();
	private int tut=(6000000+rnd.nextInt(999999));
	
	public TV_Kumanda(int ses,int kanal ,int tu�S,int pilS, Date �retimT,Pil pilt�r�,String Hangifirma)
	{
		this.�D="TV-"+tut;
		setSes(ses);
		setKanal(kanal);
		setTu�_say�s�(tu�S);
		setPil_say�s�(pilS);
		set�retim_tarihi(�retimT);
		setPil_t�r�(pilt�r�);
		setHangi_Firma_��in_�retildi(Hangifirma);
		Tvkumandaadet++;
		
		
	}
	
	public void setSes(int ses) {
		if(ses>=0 && ses<=30)
		{this.ses = ses;}
		else
		{System.out.println("L�tfen ses de�erini 0 ile 30 aras� atama yap�n�z ");}
	}
	public void setKanal(int kanal) {
		if(kanal>=1 && kanal<=500)
		{this.kanal = kanal;}
		else
		{System.out.println("L�tfen kanal de�erini 1 ile 500 aras� atama yap�n�z");}
	}
	








	public String get�D() {
		System.out.println("Kumanda �D= "+�D);
		return �D;
	}

	public static int getTvkumandaadet() {
		System.out.println("�retilen TV kumanda say�s� "+Tvkumandaadet);
		return Tvkumandaadet;
	}

	

	@Override
	public void cihaz_a�() {
		if(getCihaz_durum()==false)
		 {
			 setCihaz_durum(true);
			 System.out.println("Tv  a��ld�");
		 }
		 else
			 System.out.println("Tv zaten A��k");
		
	}

	@Override
	public void cihaz_kapat() {
		if(getCihaz_durum()==true)
		{
			setCihaz_durum(false);
			System.out.println("TV kapat�ld�");
		}
		else
			System.out.println("TV zaten kapal�");
		
	}

	@Override
	public String pil_bitiyor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void sesi_artt�r()
	{
		if(getCihaz_durum()==true)
		{
				if(this.ses<30)
				{
					this.ses+=1;
				System.out.println("Ses art��� yap�ld�= "+this.ses);
				}
		else
			System.out.println("Ses maksimum seviyede");
		}
		else
			System.out.println("Cihaz kapal�");
		
	}
	public void sesi_azalt()
	{
		if(getCihaz_durum()==true)
		{
				if(this.ses>0)
				{
					this.ses-=1;
				System.out.println("Ses azaltma yap�ld�= "+this.ses);
				}
		else
			System.out.println("Ses en d���k de�erde");
		}
		else
			System.out.println("Cihaz kapal�");
	}
	public void kanal_ileri()
	{
		if(getCihaz_durum()==true)
		{
			if(this.kanal>=500)
			{
				this.kanal=1;
				System.out.println("Kanal ileri yap�ld�...KANAL BA�A D�ND�= "+this.kanal);
			}
			else {
				if(this.kanal<500)
				{
					this.kanal+=1;
				System.out.println("Kanal ileri yap�ld�= "+this.kanal);
				}
			}
		
		}
		else
			System.out.println("Cihaz kapal�");
		
	}
	public void kanal_geri()
	{
		if(getCihaz_durum()==true)
		{
			if(this.kanal<=1)
			{
				this.kanal=500;
				System.out.println("Kanal geri yap�ld�...KANAL SONA D�ND�= "+this.kanal);
			}
			else {
				if(this.kanal>1)
				{
					this.kanal-=1;
				System.out.println("Kanal geri yap�ld�= "+this.kanal);
				}
			}
		
		}
		else
			System.out.println("Cihaz kapal�");
		
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
				System.out.println("TV de�erlerini a��yor");
			else
				System.out.println("Cihaz kapal�");
	}


	
	
	

}
