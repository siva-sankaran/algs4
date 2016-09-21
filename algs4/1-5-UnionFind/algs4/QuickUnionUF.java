package algs4;

public class QuickUnionUF extends UF {

	int arrayAccess;

	public QuickUnionUF(int N) {
		super(N);
		arrayAccess = 0;
	}

	int getElementAt(int p) {
		arrayAccess++;
		return id[p];
	}

	@Override
	int find(int p) {
		while (p != id[p])
			p = id[p];
		return p;
	}

	int[] find1(int p) {

		while (p != getElementAt(p))
			p = getElementAt(p);
		int tmp = arrayAccess;
		arrayAccess = 0;
		return new int[] { p, tmp };
	}

	@Override
	void union(int p, int q) {
		int pRoot = find(p);
		int qRoot = find(q);

		id[pRoot] = qRoot;

		count--;
	}

	int union1(int p, int q) {
		int[] op = find1(p);
		int[] oq = find1(q);
		
		if(op[0] == oq[0]) return op[1] + oq[1];
		
		id[op[0]] = oq[0];
		
		count--;
		return op[1] + oq[1] + 1;

	}

}
