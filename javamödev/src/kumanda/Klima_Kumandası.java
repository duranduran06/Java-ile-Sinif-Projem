package kumanda;

import java.util.Date;
import java.util.Random;


public class Klima_Kumandas� extends Kumanda {
	
	

	private String �D;
	private static int KlimaKumandaAdet=0;
	private int s�cakl�k=10;
	Random rnd =new Random();
	private int tut=(5000000+rnd.nextInt(999999));
	
	
	public Klima_Kumandas�(int tu�S,int pilS, Date �retimT,Pil pilt�r�,String Hangifirma)
	{
		this.�D="KL-"+tut;
		setTu�_say�s�(tu�S);
		setPil_say�s�(pilS);
		set�retim_tarihi(�retimT);
		setPil_t�r�(pilt�r�);
		setHangi_Firma_��in_�retildi(Hangifirma);
		KlimaKumandaAdet++;
		
	}
	

	
	public String get�D() {
		System.out.println("Kumanda �D= "+�D);
		return �D;
	}	
	public void mevcut_s�cakl�k()
	{
		if(getCihaz_durum()==true)
		{
		System.out.println("Mevcut S�cakl�k"+this.s�cakl�k);
		}
		else
			System.out.println("Cihaz kapal�");
	}
	public void s�cakl�k_Artt�r()
	{
		if(getCihaz_durum()==true)
		{
		if(this.s�cakl�k<43)
		{
		this.s�cakl�k+=1;
		System.out.println("S�cakl�k art��� yap�ld�= "+this.s�cakl�k);
		}
		else
			System.out.println("Klima de�erlerini a��yor");
		}
		else
			System.out.println("Cihaz kapal�");
	}
	public void s�cakl�k_Azalt()
	{
		if(getCihaz_durum()==true)
		{
		if(this.s�cakl�k>10)
		{
		this.s�cakl�k-=1;
		System.out.println("S�cakl�k azaltma yap�ld�= "+this.s�cakl�k);
		}
		else
			System.out.println("Klima de�erlerini a��yor");
		}
		else
			System.out.println("Cihaz kapal�");
	}
	public void istenilen_s�cakl�k_git(int de�er)
	{
		if(getCihaz_durum()==true)
		if(de�er>=10 && de�er<=43)
		{
		this.s�cakl�k=de�er;
		System.out.println("istenilen s�cakl��a gidildi= "+this.s�cakl�k);
		}
		else
			System.out.println("Klima de�erlerini a��yor");
		else
			System.out.println("Cihaz kapal�");
	}
	
	@Override
	public String pil_bitiyor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cihaz_a�() {
	 if(getCihaz_durum()==false)
	 {
		 setCihaz_durum(true);
		 System.out.println("Klima a��ld�");
	 }
	 else
		 System.out.println("Klima Zaten A��k");
		
	}

	@Override
	public void cihaz_kapat() {
	if(getCihaz_durum()==true)
	{
		setCihaz_durum(false);
		System.out.println("Klima kapat�ld�");
	}
	else
		System.out.println("klima zaten kapal�");
		
	}



	public static int getKlimaKumandaAdet() {
		System.out.println("�retilen klima kumanda say�s� "+KlimaKumandaAdet);
		return KlimaKumandaAdet;
	}

	


}
