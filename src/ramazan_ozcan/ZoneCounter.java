package ramazan_ozcan;

public class ZoneCounter implements ZoneCounterInterface {

	public void Init(MapInterface map) throws Exception {

		int[] result = map.GetSize((Dimension) map);

		map.SetBorder(result[0], result[1]);
		map.Show();

	}

	public int Solve(MapInterface map) throws Exception {

		int[] result = map.GetSize((Dimension) map);

		boolean visited[][] = new boolean[result[0]][result[1]];
		int count = 0;
		int[][] cells = map.getCells();

		for (int i = 0; i < visited[0].length; ++i)
			for (int j = 0; j < visited[1].length; ++j)
				if (cells[i][j] == 1 && !visited[i][j]) {

					map.IsBorder(cells, i, j, visited);
					++count;
				}

		return count;

	}

}
