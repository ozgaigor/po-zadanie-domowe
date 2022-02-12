package Z1;

import java.time.LocalTime;
import java.util.Arrays;

public class isPalindrom {
        public static <t extends Comparable> boolean jestPailandromem(t[] tablica) {
            t[] pom = tablica.clone();
            int j = 0;
            for (int i = tablica.length - 1; i >= 0; i--) {
                pom[j] = tablica[i];
                j++;
            }
            for(int k =0; k<tablica.length;k++){
                //System.out.println(tablica[k]);
                //System.out.println(tablicapomocnicza[k]);
                if(!tablica[k].equals(pom[k])) {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        Integer[] tab1_true={1,2,2,1};
        Integer[] tab1_false={2,1,2,1};
        LocalTime[] tab3_true ={LocalTime.of(21,11),
                LocalTime.of(11,11),
                LocalTime.of(21,11)};
        LocalTime[] tab3_false ={LocalTime.of(11,11),
                LocalTime.of(11,12),
                LocalTime.of(21,12)};

        System.out.println(isPalindrom.jestPailandromem(tab1_true));
        System.out.println(isPalindrom.jestPailandromem(tab1_false));
        System.out.println(isPalindrom.jestPailandromem(tab3_true));
        System.out.println(isPalindrom.jestPailandromem(tab3_false));
    }
}
