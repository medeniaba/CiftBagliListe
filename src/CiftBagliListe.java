import java.util.Scanner;





	class ciftEleman{
	
		int içerik ;
		ciftEleman ileri , geri ;
		
		ciftEleman(int icerik){
			
			this.içerik = içerik ; 
			ileri = null ; 
			geri = null ; 
			
		}}
	
		
	
public class CiftBagliListe {
	

		
		ciftEleman bas ; 
		ciftEleman son ; 
	 public CiftBagliListe() {
		 
		 bas = null ; 
		 son = null ; 
		 
	 }
	 public void cBasaEkle ( ciftEleman yeni )
	 {
		 
		 
		 
		 if ( son == null ) {
			 
			 bas = yeni ; 
			 son = yeni ; 
			 
		 }
		 else {
			 
			 yeni.ileri = bas ;
			 bas.geri = yeni ; 
			 bas = yeni ; 
			 
			 
		 }
		 
	 }
	 
	 public void cSonaEkle ( ciftEleman yeni ) {
		 
		 if ( bas == null ) {
			 
			 bas = yeni ; 
			 son = yeni ; 
			 
		 }
		 else {
			 son.ileri = yeni ; 
			 yeni.geri = son ; 
			 son = yeni ; 
			 
		 }
		 
		 
	 }
	 
	 public void cArayaEkle ( ciftEleman yeni , ciftEleman once ) {
		 yeni.ileri = once.ileri;
		 yeni.geri = once ; 
		 once.ileri.geri = yeni;
		 once.ileri = yeni ; 
		 
		 
	 }
	 
	 public void cBastanSil() {
		 bas = bas.ileri;
		 if(bas == null) {
			 son = null ; 
			 
		 }
		 else {
			 
			 bas.geri = null ; 
			 
		 }
		 
	 } 
	 public void cSondanSil() {
		 son = son.geri ;
		 
		 if ( son == null ) {
			 bas = null ; 
			 
		 }
		 else {
			 son.ileri = null ; 
		 }
		 
		 
	 }
	 
	 void listeortaSil( ciftEleman s ) {
		 
		 s.ileri.geri = s.geri ; 
		 s.geri.ileri = s.ileri ; 
		 
	 }
	 
	 void yazdır ( ciftEleman bas ) {
			
			ciftEleman tmp = bas ; 
			if ( bas == null ) {
				
				System.out.println("Liste boş ");
				
			}

			else {
				
				while ( tmp != null ) {
					System.out.println(tmp.içerik + "-->"+ " ");
					tmp = tmp.ileri ; 
					
				}
				
				
				
				
			}
				
		}
	 
	

	
	
	public static void main(String[] args){
		
		ciftEleman yeni = new ciftEleman(5);
		ciftEleman yeni1 = new ciftEleman(6);
		ciftEleman yeni2 = new ciftEleman(7);
		ciftEleman yeni3 = new ciftEleman(8);
		
		
		CiftBagliListe list = new CiftBagliListe();

		list.cSonaEkle(yeni);
		list.cBasaEkle(yeni1);
		list.cBasaEkle(yeni2);
		list.cBasaEkle(yeni3);

		list.yazdır(list.bas);
		
		
	
	}}