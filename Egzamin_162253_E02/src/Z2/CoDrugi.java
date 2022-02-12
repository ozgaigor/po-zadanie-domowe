package Z2;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class CoDrugi {
    public static <t> void wypiszCoDrugi(Iterable<t> argument) {
        int pom=0;
        int pom2=1;
        for(t element: argument){
            if(pom==0){
                if(pom2!=1) System.out.print(", ");
                else pom2=0;
                System.out.print(element);
                pom=1;
            }
            else {
                pom=0;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> lista=new  ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        wypiszCoDrugi(lista);
        System.out.print("\n");
        Stack<Integer> stack=new  Stack<Integer>();
        stack.add(7);
        stack.add(8);
        stack.add(3);
        stack.add(5);
        wypiszCoDrugi(stack);
        PriorityQueue<Integer> kolejka=new  PriorityQueue<Integer>();
        kolejka.add(7);
        kolejka.add(8);
        kolejka.add(3);
        kolejka.add(5);
        System.out.print("\n");
        wypiszCoDrugi(kolejka);

    }
}