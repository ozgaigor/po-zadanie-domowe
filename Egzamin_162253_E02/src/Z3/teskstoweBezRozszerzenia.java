package Z3;

import java.io.File;

//wypisuje pliki tekstowe poza danym rozszerzeniem

public class teskstoweBezRozszerzenia {
    public static <t> void wypiszbezrozszerzenia(File plik,String rozszerzenie) {
        String[] etap1 = plik.list((katalog, nazwa)-> (new File((katalog.toString())+"/"+nazwa)).isFile());
        for(String element: etap1){
            if (element.endsWith(rozszerzenie)==false){
                System.out.println(element);
            }
        }
    }
    public static void main(String[] args) {
        File plik= new File("C:\\Users\\Igor\\Desktop\\Nowy folder");
        wypiszbezrozszerzenia(plik,".txt");
    }
}