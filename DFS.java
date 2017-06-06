import java.io.*;
import java.util.*;

class DFS {

	public static void DFS(int vertex, int[][] matrix, int[] visited)	{

		visited[vertex]++;
		for (int i=0; i<matrix.length; i++)	{

			if (matrix[vertex][i]==1 && visited[i]==0)	{

				DFS(i, matrix, visited);
			}					
		}
	}

	public static void main(String[] args) {

		
	}
}