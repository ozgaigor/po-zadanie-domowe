package Z1;

//sprawdzenie czy jest posortowane

import java.math.BigInteger;
import java.time.LocalDate;

public class ArrayUtil2 {
    public static <T extends Comparable<T>> boolean isSorted(T[] tab){
        for(int i = 0; i< tab.length-1; i++){
            if(tab[i].compareTo(tab[i+1]) > 0){
                return false;
            }
        }
        return true;
    }
    public static void main (String [] args) {
    BigInteger[] testbigint = new BigInteger[3];
    testbigint[0] = BigInteger.valueOf(456456456);
    testbigint[1] = BigInteger.valueOf(556456456);
    testbigint[2] = BigInteger.valueOf(656456456);
    BigInteger[] testbigintf = new BigInteger[3];
    testbigintf[0] = BigInteger.valueOf(456456456);
    testbigintf[1] = BigInteger.valueOf(756456456);
    testbigintf[2] = BigInteger.valueOf(656456456);
        System.out.println(isSorted(testbigint));
        System.out.println(isSorted(testbigintf));

    String[] teststring = new String[3];
    teststring[0] = "abcdef";
    teststring[1] = "bbcdef";
    teststring[2] = "cbcdef";
    String[] teststringf = new String[3];
    teststringf[0] = "zbcdef";
    teststringf[1] = "dbcdef";
    teststringf[2] = "abcdef";
        System.out.println(isSorted(teststring));
        System.out.println(isSorted(teststringf));

    LocalDate[] testtime = new LocalDate[3];
    testtime[0] = LocalDate.of(2000, 8, 27);
    testtime[1] = LocalDate.of(2000, 9, 27);
    testtime[2] = LocalDate.of(2000, 10, 27);
    LocalDate[] testtimef = new LocalDate[3];
    testtimef[0] = LocalDate.of(2000, 10, 27);
    testtimef[1] = LocalDate.of(2000, 9, 27);
    testtimef[2] = LocalDate.of(2000, 8, 27);
        System.out.println(isSorted(testtime));
        System.out.println(isSorted(testtimef));

}

}
