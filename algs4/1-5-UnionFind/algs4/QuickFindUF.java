package algs4;

import java.util.Arrays;

public class QuickFindUF extends UF {

	public QuickFindUF(int N) {
		super(N);
	}

	@Override
	int find(int p) {
		return id[p];
	}

	int union1(int p, int q) {
		int arrayAccess = 0;
		int pID = find(p);
		arrayAccess++;
		int qID = find(q);
		arrayAccess++;

		if (pID == qID)
			return arrayAccess;

		for (int i = 0; i < id.length; i++) {

			arrayAccess++;
			if (id[i] == pID) {
				arrayAccess++;
				id[i] = qID;
			}

		}
		count--;
		return arrayAccess;

	}

	@Override
	void union(int p, int q) {
		int pID = find(p);
		int qID = find(q);

		if (pID == qID)
			return;

		for (int i = 0; i < id.length; i++)
			if (id[i] == pID)
				id[i] = qID;
		count--;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Arrays.toString(id);
	}

}
