package Z2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Przecinki {
    public static void main(String[] args){
        ArrayList<Integer> ints=new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        print(ints);
        TreeSet<String> str1=new TreeSet<>();
        str1.add("A");
        str1.add("B");
        str1.add("C");
        print(str1);
        LinkedList<String> str2=new LinkedList<>();
        str2.add("X");
        str2.add("Y");
        str2.add("Z");
        print(str2);
    }
    public static <T> void print(Iterable<T> n){n.forEach((i)->{System.out.print(i+",");});
    }
}