import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

class Main {

	public static class Node	{

		public int rank;
		public Node parent;
		public int data;

		public Node(int number)	{

			rank = 1;
			parent = this;
			data = number;
		}
	}

	public static void union(Node x, Node y)	{

		Node xRoot = find(x);
		Node yRoot = find(y);

		if (xRoot==yRoot)	return;

		if (xRoot.rank < yRoot.rank)	{

			xRoot.parent=yRoot;
         	yRoot.rank+=xRoot.rank;
		}
         
     	else {

     		yRoot.parent=xRoot;
         	xRoot.rank+=yRoot.rank;
     	}         
	}

	public static Node find(Node node)	{

		if (node.parent != node)  node.parent=find(node.parent);
     	return node.parent;
	}	


	public static void main(String[] args) throws IOException{

	}
}