package Z3;

import java.io.File;
import java.util.List;

// wypisuje liste plików w folderze

public class listaPlikówZRozszerzeniem {
    public static String[] DirectoryList(String path){
        String[] result={};
        try{
            File f=new File(path);
            result=f.list((dir,name)->dir.isDirectory());
        }
        catch(Exception e){
        }
        return result;
    }
    public static void main(String[] args) {
        List.of(DirectoryList("C:\\")).forEach(System.out::println);
    }
}
