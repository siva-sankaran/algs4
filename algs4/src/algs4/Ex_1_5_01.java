package algs4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_5_01 {

	public static void main(String[] args) {

		QuickFindUF QuickFindUF = new QuickFindUF(10);
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 9,0 := " + QuickFindUF.union1(9, 0));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 3,4 := " + QuickFindUF.union1(3, 4));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 5,8 := " + QuickFindUF.union1(5, 8));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 7,2 := " + QuickFindUF.union1(7, 2));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 3,4 := " + QuickFindUF.union1(3, 4));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 2,1 := " + QuickFindUF.union1(2, 1));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 5,7 := " + QuickFindUF.union1(5, 7));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 0,3 := " + QuickFindUF.union1(0, 3));
		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 4,2 := " + QuickFindUF.union1(4, 2));

		StdOut.println(QuickFindUF.toString());
		StdOut.println("no. of array acces for union 4,6 := " + QuickFindUF.union1(4, 6));

		StdOut.println(QuickFindUF.toString());
		StdOut.println("Component count := " + QuickFindUF.Count());

	}

}
