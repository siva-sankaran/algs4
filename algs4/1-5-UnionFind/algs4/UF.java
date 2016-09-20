package algs4;

public abstract class UF {
	int[] id;
	int count;

	public UF(int N) {
		this.count = N;
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	public int Count() {
		return count;
	}

	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	abstract int find(int p);

	abstract void union(int p, int q);

}
