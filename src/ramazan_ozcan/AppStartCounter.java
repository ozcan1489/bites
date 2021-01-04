package ramazan_ozcan;

public class AppStartCounter {

	/*
	 * Parametre olarak manuel giriþ mevcut. Dosya yükleme ekranýndan tetiklenecekse
	 * eðer, Dimension bilgileri set edilmeli.
	 */
	public static MapInterface map = new Dimension(8, 10);
	public static ZoneCounterInterface zoneCounter = new ZoneCounter(); 
	
	public static void main(String[] args) {
		
		try {
			zoneCounter.Init(map);
		} catch (Exception e) {
			System.out.println("Init methodu çalýþýrken hata meydana geldi.\n"+e);
			e.printStackTrace();
		}
		
		try {
			zoneCounter.Solve(map);
		} catch (Exception e) {
			System.out.println("Solve methodu çalýþýrken hata meydana geldi.\n"+e);
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
