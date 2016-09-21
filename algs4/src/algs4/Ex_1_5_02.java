package algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_5_02 {

	public static void main(String[] args) {
		
		StdOut.println("Quick Union:");
		QuickUnionUF QuickUnionUF = new QuickUnionUF(10);
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 9,0 := " + QuickUnionUF.union1(9, 0));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 3,4 := " + QuickUnionUF.union1(3, 4));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 5,8 := " + QuickUnionUF.union1(5, 8));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 7,2 := " + QuickUnionUF.union1(7, 2));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 3,4 := " + QuickUnionUF.union1(3, 4));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 2,1 := " + QuickUnionUF.union1(2, 1));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 5,7 := " + QuickUnionUF.union1(5, 7));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 0,3 := " + QuickUnionUF.union1(0, 3));
		StdOut.println(QuickUnionUF.toString());
		StdOut.println("no. of array acces for union 4,2 := " + QuickUnionUF.union1(4, 2));

		//StdOut.println(QuickUnionUF.toString());
		//StdOut.println("no. of array acces for union 4,6 := " + QuickUnionUF.union1(4, 6));

		StdOut.println(QuickUnionUF.toString());
		StdOut.println("Component count := " + QuickUnionUF.Count());

	}

}
