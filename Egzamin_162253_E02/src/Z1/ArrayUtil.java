package Z1;

//Usuwanie powtórek z listy

import java.time.LocalTime;
import java.util.ArrayList;

public class ArrayUtil{
    public static <T extends Comparable>ArrayList
    removeRepeatedElements(ArrayList<T> list)
    {
        ArrayList<T> arrayList = list;
        ArrayList<T> wynik = new ArrayList<T>();
        arrayList.stream().distinct().forEach(i->wynik.add(i));
        return wynik;
    }
    public static void main(String[]args){
        LocalTime czas1 = LocalTime.of(10,11);
        LocalTime czas2 = LocalTime.of(11,12);
        LocalTime czas3 = LocalTime.of(12,13);
        LocalTime czas4 = LocalTime.of(10,11);
        LocalTime czas5 = LocalTime.of(11,12);

        ArrayList<LocalTime> LocalTimeArray = new ArrayList<LocalTime>();
        LocalTimeArray.add(czas1);
        LocalTimeArray.add(czas2);
        LocalTimeArray.add(czas3);
        LocalTimeArray.add(czas4);
        LocalTimeArray.add(czas5);

        //----------------------------------------------

        Character znak1 = 'a';
        Character znak2 = 'b';
        Character znak3 = 'b';
        Character znak4 = 'c';
        Character znak5 = 'c';
        Character znak6 = 'd';
        ArrayList<Character> CharacterArray = new ArrayList<Character>();

        CharacterArray.add(znak1);
        CharacterArray.add(znak2);
        CharacterArray.add(znak3);
        CharacterArray.add(znak4);
        CharacterArray.add(znak5);
        CharacterArray.add(znak6);

        ArrayList<Character> check = removeRepeatedElements(CharacterArray);
        for (Character Charchk:check)
        {
            System.out.println(Charchk);
        }

        ArrayList<LocalTime> check1 = removeRepeatedElements(LocalTimeArray);
        for (LocalTime Localchk:check1)
        {
            System.out.println(Localchk);
        }
    }
}
