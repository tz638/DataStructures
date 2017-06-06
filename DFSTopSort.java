import java.io.*;
import java.util.*;

class DFSTopSort {

	public static void DFS(int vertex, int[][] matrix, int[] visited, ArrayList<Integer> list)	{

		if (visited[vertex]==1) return;
		visited[vertex]=1;
		for (int i=0; i<matrix.length; i++)	{

			if (matrix[vertex][i]==1)	{

				DFS(i, matrix, visited, list);
			}					
		}
		list.add(vertex);
	}

	public static ArrayList<Integer> topSort (int[][] matrix)		{

		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] visited = new int[matrix.length];
		for (int i = 0; i<visited.length; i++)	{

			if (visited[i]==0 ) DFS(i, matrix, visited, list);
		}
		Collections.reverse(list);
		return list;
	}

	public static void main(String[] args) {

		
	}
}