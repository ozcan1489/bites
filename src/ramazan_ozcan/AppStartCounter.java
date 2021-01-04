package ramazan_ozcan;

public class AppStartCounter {

	/*
	 * Parametre olarak manuel giri� mevcut. Dosya y�kleme ekran�ndan tetiklenecekse
	 * e�er, Dimension bilgileri set edilmeli.
	 */
	public static MapInterface map = new Dimension(8, 10);
	public static ZoneCounterInterface zoneCounter = new ZoneCounter(); 
	
	public static void main(String[] args) {
		
		try {
			zoneCounter.Init(map);
		} catch (Exception e) {
			System.out.println("Init methodu �al���rken hata meydana geldi.\n"+e);
			e.printStackTrace();
		}
		
		try {
			zoneCounter.Solve(map);
		} catch (Exception e) {
			System.out.println("Solve methodu �al���rken hata meydana geldi.\n"+e);
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
