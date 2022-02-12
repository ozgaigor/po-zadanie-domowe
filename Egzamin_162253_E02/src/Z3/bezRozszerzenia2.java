import java.io.File;
import java.util.stream.Stream;
import java.util.List;

public class bezRozszerzenia2 {
    public static List<String> pliki(File folder, String rozszerzenie)
    {
        String[] wynik = folder.list(((dir, name) -> true));
        assert wynik != null;
        Stream<String> stream = Stream.of(wynik).map(x -> {
            if(x.contains(rozszerzenie))
            {
                return x.replace(rozszerzenie, "");
            }
            else
            {
                return x;
            }
        });
        return stream.toList();
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\Igor\\Desktop\\Egzamin_162253_E02");
        System.out.println(pliki(file, ".txt"));
    }
}