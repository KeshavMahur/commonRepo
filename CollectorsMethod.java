import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CollectorsMethod {
    public static void main(String[] args){
      List<Integer> list = Arrays.asList(1,2,3,4,5);
      Double avg = list.stream().collect(Collectors.averagingDouble(integer -> integer));
      Integer sum = list.stream().collect(Collectors.summingInt(integer -> integer));
      System.out.println("Avarage = "+avg+","+"Sum = "+sum);
    List<String> list1 = Arrays.asList("Keshav","mayank","raju","Keshav");
    Function<String, Character> f = string->string.charAt(0);
       Map m = list1.stream().collect(Collectors.groupingBy(f));
        System.out.println(m);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        List<String> listString = Arrays.asList("keshav","keshav","Kamal","Kalpna","Shiva","Shalini","Kumaar","Anas");
       Map<Object,Set<String>> map = listString.stream().collect(Collectors.groupingBy((string)->string.toLowerCase().charAt(0),Collectors.toSet()));
        System.out.println(map);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
      Map<Object,Set<String>> map1  = Arrays.asList("kumar","kumar","shrma","deepak").stream().collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.toSet()));
        System.out.println(map1);
        List<String> stringList = Arrays.asList("Keshav","Mahur","Deepak","Kishan","Jagpal","Jagpal");
      Map<Object,List<String>> conGp = stringList.parallelStream().collect(Collectors.groupingByConcurrent((string)->string.charAt(0)));

      LinkedList linkedLIst = list.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedLIst);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        List l = Arrays.asList("kamal","ramprakash","kumar","kumar").stream().collect(Collectors.mapping(Function.identity(),Collectors.toList()));
        System.out.println(l);

        Map<Boolean,List<Integer>> map2= Arrays.asList(1,2,3,2,4,3,4,5,6,7,8,10).stream().collect(Collectors.partitioningBy(integer -> integer%2==0));
        System.out.println(map2);

        Map<Boolean,Set<Integer>> setPart = Arrays.asList(1,2,3,2,4,3,4,5,6,7,8,10).stream().collect(Collectors.partitioningBy(integer -> integer%2==0,Collectors.toSet()));
        System.out.println(setPart);
        System.out.println("---------------------------------------------------------------------------------------------");
       IntSummaryStatistics obj = list.stream().collect(Collectors.summarizingInt(integer -> integer));
        System.out.println(obj);


    }
}