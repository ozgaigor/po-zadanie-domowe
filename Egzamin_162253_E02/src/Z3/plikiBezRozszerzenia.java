package Z3;

import java.io.File;
import java.util.Arrays;

public class plikiBezRozszerzenia {

    // wypisz wszystkie pliki poza danym rozszerzeniem

    public static void main(String[] args) {

        String path = "C:\\Users\\Igor\\Desktop\\Nowy folder";
        String[] files = fileList(path, ".txt");
        for (String s:files
        ) {
            System.out.println(s);
        }
    }
    public static String[] fileList(String path, String extension){

        File file = new File(path);
        return file.list(((dir, name) -> !name.endsWith(extension)));



    }


}