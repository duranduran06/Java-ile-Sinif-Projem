package kumanda;

import java.util.Date;



public class Cihaz {

	public static void main(String[] args) {
		Date now =new Date();
		Pil pil1=new Pil("GP",12);	
		
		
		System.out.println("***************************TV KUMANDASI ���N B�LG�LER***************************");
		
		TV_Kumanda kumanda1=new TV_Kumanda(29,497,1,2,now,pil1,"LG");
		kumanda1.get�D();
		kumanda1.getFirma_ismi();
		kumanda1.setHangi_Firma_��in_�retildi("SAMSUNG");//firma de�i�tirilemez
		kumanda1.getHangi_Firma_��in_�retildi();
		kumanda1.getTu�_say�s�();
		kumanda1.getPil_say�s�();
		kumanda1.get�retim_tarihi();
		kumanda1.getPil_t�r�().getPilT�r�();
		kumanda1.getPil_t�r�().getPilVoltaj�();
		TV_Kumanda.getTvkumandaadet();
		
		//METOTLAR
		kumanda1.kanal_ileri();
		kumanda1.cihaz_a�();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_geri();
		kumanda1.kanal_geri();
		kumanda1.kanal_geri();
		kumanda1.kanal_geri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.kanal_ileri();
		kumanda1.istenilen_kanal_git(980);
		kumanda1.kanal_ileri();
		kumanda1.istenilen_kanal_git(80);
		kumanda1.kanal_ileri();
		kumanda1.sesi_artt�r();
		kumanda1.sesi_artt�r();
		TV_Kumanda kumanda2=new TV_Kumanda(12, 233, 14, 2, now, pil1, "SONY");
		kumanda2.cihaz_a�();
		TV_Kumanda.getTvkumandaadet();

		
		
						System.out.println("***************************KL�MA KUMANDASI ���N B�LG�LER*************************");
		
						Klima_Kumandas� ilk=new Klima_Kumandas�(15,2,now,pil1,"VESTEL");
						ilk.get�D();
						ilk.getFirma_ismi();
						ilk.getHangi_Firma_��in_�retildi();
						ilk.setHangi_Firma_��in_�retildi("LG");//F�RMA DE���T�R�LEMEZ
						ilk.getHangi_Firma_��in_�retildi();
						ilk.getTu�_say�s�();
						ilk.getPil_say�s�();
						ilk.get�retim_tarihi();
						ilk.getPil_t�r�().getPilT�r�();
						ilk.getPil_t�r�().getPilVoltaj�();
						Klima_Kumandas�.getKlimaKumandaAdet();
						
						//METOTLAR
						ilk.mevcut_s�cakl�k();
						ilk.s�cakl�k_Artt�r();
						ilk.cihaz_a�();
						ilk.cihaz_a�();
						ilk.mevcut_s�cakl�k();
						ilk.s�cakl�k_Artt�r();
						ilk.s�cakl�k_Artt�r();
						ilk.s�cakl�k_Azalt();
						ilk.s�cakl�k_Azalt();
						ilk.s�cakl�k_Azalt();
						ilk.istenilen_s�cakl�k_git(65);
						ilk.istenilen_s�cakl�k_git(5);
						ilk.istenilen_s�cakl�k_git(42);
						ilk.s�cakl�k_Artt�r();
						ilk.s�cakl�k_Artt�r();
						ilk.cihaz_kapat();
						ilk.mevcut_s�cakl�k();
						Klima_Kumandas� ikinci=new Klima_Kumandas�(45, 3, now, pil1, "SAMSUNG");
						ikinci.cihaz_a�();
						Klima_Kumandas�.getKlimaKumandaAdet();
						
						
						
						
					
						
		

			
	}
	

}
