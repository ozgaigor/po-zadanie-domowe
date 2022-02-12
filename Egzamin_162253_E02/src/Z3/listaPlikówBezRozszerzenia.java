package Z3;

import java.io.File;
import java.util.Arrays;
public class listaPlikówBezRozszerzenia {
    public static void main(String[] args)
    {
        String ar = "\\162253_E02\\scr\\Z3";
        String[] files = fileList(ar,".txt");
        for (String s:files){
            System.out.println(s);
        }
    }
    public static String[] fileList(String ar, String ex)
    {
        File file = new File(ar);
        return file.list(((dir,name)->!name.endsWith(ex)));
    }
}