package Z1;

//posortowane tablice

public class ArrayUtil3 {
    public static <T extends Comparable<T>> boolean isSorted(T[] tablica)
    {
        for(int i=0; i< tablica.length-1; i++)
        {
            if(tablica[i].compareTo(tablica[i+1])==1)
            {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
            Integer[] tab1 = new Integer[5];
            tab1[0] = 2;
            tab1[1] = 4;
            tab1[2] = 5;
            tab1[3] = 70;
            tab1[4] = 111;
            System.out.println(ArrayUtil3.isSorted(tab1));
        }
    }
