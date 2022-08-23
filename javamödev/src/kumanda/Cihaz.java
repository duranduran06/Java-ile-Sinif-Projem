package kumanda;

import java.util.Date;



public class Cihaz {

	public static void main(String[] args) {
		Date now =new Date();
		Pil pil1=new Pil("GP",12);	
		
		
		System.out.println("***************************TV KUMANDASI ÝÇÝN BÝLGÝLER***************************");
		
		TV_Kumanda kumanda1=new TV_Kumanda(29,497,1,2,now,pil1,"LG");
		kumanda1.getÝD();
		kumanda1.getFirma_ismi();
		kumanda1.setHangi_Firma_Ýçin_Üretildi("SAMSUNG");//firma deðiþtirilemez
		kumanda1.getHangi_Firma_Ýçin_Üretildi();
		kumanda1.getTuþ_sayýsý();
		kumanda1.getPil_sayýsý();
		kumanda1.getÜretim_tarihi();
		kumanda1.getPil_türü().getPilTürü();
		kumanda1.getPil_türü().getPilVoltajý();
		TV_Kumanda.getTvkumandaadet();
		
		//METOTLAR
		kumanda1.kanal_ileri();
		kumanda1.cihaz_aç();
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
		kumanda1.sesi_arttýr();
		kumanda1.sesi_arttýr();
		TV_Kumanda kumanda2=new TV_Kumanda(12, 233, 14, 2, now, pil1, "SONY");
		kumanda2.cihaz_aç();
		TV_Kumanda.getTvkumandaadet();

		
		
						System.out.println("***************************KLÝMA KUMANDASI ÝÇÝN BÝLGÝLER*************************");
		
						Klima_Kumandasý ilk=new Klima_Kumandasý(15,2,now,pil1,"VESTEL");
						ilk.getÝD();
						ilk.getFirma_ismi();
						ilk.getHangi_Firma_Ýçin_Üretildi();
						ilk.setHangi_Firma_Ýçin_Üretildi("LG");//FÝRMA DEÐÝÞTÝRÝLEMEZ
						ilk.getHangi_Firma_Ýçin_Üretildi();
						ilk.getTuþ_sayýsý();
						ilk.getPil_sayýsý();
						ilk.getÜretim_tarihi();
						ilk.getPil_türü().getPilTürü();
						ilk.getPil_türü().getPilVoltajý();
						Klima_Kumandasý.getKlimaKumandaAdet();
						
						//METOTLAR
						ilk.mevcut_sýcaklýk();
						ilk.sýcaklýk_Arttýr();
						ilk.cihaz_aç();
						ilk.cihaz_aç();
						ilk.mevcut_sýcaklýk();
						ilk.sýcaklýk_Arttýr();
						ilk.sýcaklýk_Arttýr();
						ilk.sýcaklýk_Azalt();
						ilk.sýcaklýk_Azalt();
						ilk.sýcaklýk_Azalt();
						ilk.istenilen_sýcaklýk_git(65);
						ilk.istenilen_sýcaklýk_git(5);
						ilk.istenilen_sýcaklýk_git(42);
						ilk.sýcaklýk_Arttýr();
						ilk.sýcaklýk_Arttýr();
						ilk.cihaz_kapat();
						ilk.mevcut_sýcaklýk();
						Klima_Kumandasý ikinci=new Klima_Kumandasý(45, 3, now, pil1, "SAMSUNG");
						ikinci.cihaz_aç();
						Klima_Kumandasý.getKlimaKumandaAdet();
						
						
						
						
					
						
		

			
	}
	

}
