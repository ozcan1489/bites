package ramazan_ozcan;

public interface MapInterface {

	// Creates / Allocates a map of given size.
	void SetSize(Dimension dim);

	// Get dimensions of given map.
	// void GetSize(Dimension dim);
	/*
	 * return type olarak size bilgisi iletilmeli. Tek methotta bu bilgi isteniyorsa
	 * return type bir dizi olmalý. Yukarýdaki nesne iletilen method tanýmlamasý.
	 */
	int[] GetSize(Dimension dim);

	// Sets border at given point.
	void SetBorder(int x, int y) throws Exception;

	// Clears border at given point.
	void ClearBorder(int x, int y) throws Exception;

	// Checks if given point is border.
	public void IsBorder(int cells[][],int x, int y,boolean[][] checking) throws Exception;

	// Show map contents.
	void Show();
	
	public int[][] getCells(); 


}
