import java.io.*;
import java.util.*;

class Main {

    public static void eSieve(int[] numsToCheck)    {

        int length = numsToCheck.length;
        boolean[] checker = new boolean[numsToCheck.length];

        for (int i=0; i<length; i++)    {
            checker[i] = (i==0 || i==1) ? false: true;
        }

        for (int i=2; i<Math.sqrt(numsToCheck[length-1])+1; i++)    {
            for (int j=i*i; j<length; j+=i)     if (checker[j]==true)   checker[j]=false;
        }
    }
	public static void main(String[] args) {

		int[] ints = new int[8000000];
        for (int i=0; i<ints.length; i++)   ints[i] = i;
        eSieve(ints);
	}
}