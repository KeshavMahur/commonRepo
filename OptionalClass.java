import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class OptionalClass {
    public static void main(String[] args) {
        Optional op = Optional.empty();
        Optional op1 = Optional.empty();
        // System.out.println(op == op1 && op.equals(op1));// return true if both are true
        // System.out.println(op == op1 && op.equals(op1));// return true if both are true
        /*try{
            Optional<String> opObjWithString = Optional.of(s1);// throw null pointer exception
        }catch (Exception e){
            //e.printStackTrace();
            Optional<String> opobj = Optional.ofNullable(s1);// if value is present reurn optional obj with speacified obj otherwise return optional obj
            System.out.println(opobj.isPresent());// return false beacause string has no value
        }*/

        /*   *//*Optional with predicate*//*
        int a = 4;
        Optional<Integer> optionalInteger = Optional.of(a);
        Optional<Integer> op2 = optionalInteger.filter(i->i%2==0);
        System.out.println(optionalInteger == op2);
        System.out.println("-------------------------------------------------");*/

        /*OPtional map and flatmap*/

        String s = "keshav";
        Optional<String> optionalS = Optional.of(s);

        //Optional<String> str1 = optionalS.map(str -> str = null);
    }
    private static Optional<Object> apply(Integer integer) {
        return Optional.of(integer + integer);
    }

}
