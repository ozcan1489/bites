package ramazan_ozcan;

import java.util.Random;

public class Dimension implements MapInterface {

	public Dimension(int w, int h) {
		width = w;
		height = h;
		cells = new int[w][h];
	}

	public boolean CheckWithin(int[][] cells, int x, int y, boolean checking[][]) {
		
        return (x >= 0) && (x < cells.length) && (y >= 0) && (y < cells[0].length) && (cells[x][y] == 1 && !checking[x][y]); 

	}

	public int[][] getCells() {
		return cells;
	}

	public int width, height;
	int cells[][];

	@Override
	public void SetSize(Dimension dim) {
		// TODO Auto-generated method stub

	}

	@Override
	public int[] GetSize(Dimension dim) {

		return new int[] { dim.width, dim.height };
	}

	@Override
	public void SetBorder(int x, int y) throws Exception {
		

		boolean checking[][] = new boolean[x][y];

		/*
		 * Graph'tan veri okuyamayacaðýmýz için diziye rastgele deðer atama.
		 */
		
		Random cellValue = new Random();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				cells[i][j] = cellValue.nextInt(2);
				if (cells[i][j] == 0 && !CheckWithin(cells,i, j,checking)) {

					IsBorder(cells, i, j, checking);
				}
			}
		}
	}

	@Override
	public void ClearBorder(int x, int y) throws Exception {
		

	}

	@Override
	public void IsBorder(int cells[][], int x, int y, boolean checking[][]) throws Exception {

		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

		checking[x][y] = true;

		for (int k = 0; k < 8; ++k)
			if (CheckWithin(cells,x + rowNbr[k], y + colNbr[k],checking)) {

				IsBorder(cells, x + rowNbr[k], y + colNbr[k], checking);
			}
	}

	@Override
	public void Show() {
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				System.out.print(cells[i][j] + "\t");
			}
			System.out.println();
		}

	}
}