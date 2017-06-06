import java.io.*;
import java.util.*;

class Main     {

    public static ArrayList<Long> getPrimeFactors(Long input)     {

        ArrayList<Long> primeFactors = new ArrayList<Long>();

        for (long i = 2; i*i <= input && input!= 1; i++) {
            while (input%i == 0){
                input/= i;
                primeFactors.add(i);
            }
        }
        if (input>1)     primeFactors.add(input);
        return primeFactors;
    }

    public static void main(String[] args) {

        long input = 171452345L;
        System.out.println(getPrimeFactors(input).toString());
    }
}

