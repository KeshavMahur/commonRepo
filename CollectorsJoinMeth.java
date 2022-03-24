import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsJoinMeth {
    public static void main(String[] args) {
        char chAry[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String singelstrObj = Stream.of(chAry).map(String::valueOf).collect(Collectors.joining());
    String aryStr =    Arrays.asList("da","ddad","kljldkjslf").stream().collect(Collectors.joining(",","Start - ","- End"));
        System.out.println(aryStr);
    }
}
